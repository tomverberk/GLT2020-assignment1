module slco::Check

import slco::AST;
import slco::Load;
import Node;
import IO;

/*
 * -Implement a well-formedness checker for the CCL language. For this you must use the AST. 
 * - Hint: Map regular CST arguments (e.g., *, +, ?) to lists 
 * - Hint: Map lexical nodes to Rascal primitive types (bool, int, str)
 * - Hint: Use switch to do case distinction with concrete patterns
 */

 /*
 * Create a function called checkCloudConfiguration(...), which is responsible for calling all the required functions that check the program's well-formedness as described in the PDF (Section 3.2.) 
 * This function takes as a parameter the program's AST and returns true if the program is well-formed or false otherwise.
 */
 
/*
* Define a function per each verification defined in the PDF (Section 3.2.)
*/

// ------ Creation of the type-environment ------ ///
// Create a mapping between variables and types
alias TENV = tuple[ map[Id, Type] symbols, list[tuple[loc l, str msg]] errors];
alias OENV = map[Id, Id];

// Used to add Errors to the type-environment
TENV addError(TENV env, loc l, str msg) = env[errors = env.errors + <l, msg>];
//TENV addVariables(TENV env, list[Variable] decls) = env + newVariables(decls);
TENV addVariables(TENV env, list[Variable] decls) = 
<(variableId : tp | Variable(Type tp, Id variableId) <- decls) + env.symbols, []>;
TENV addId(Type tp, TENV env, SLCOId id) =
<(variableId : tp | id(Id variableId) <- id) + env.symbols, []>;
TENV addIds(Type tp, TENV env, list[SLCOId] Ids) =
<(variableId : tp | id(Id variableId) <- Ids) + env.symbols, []>;

TENV InitializeWithModel(SLCOId model) =                                                 
<( Id : Model()  | id(Id Id) <- model), []>;

//OENV addObject(SLCOId classId, OENV oenv, SLCOId objectId) =
//<(variableId : classId | id(Id variableId) <- objectId) + oenv>;
 


//basic operation
str required(Type t, str got) = "Required <getName(t)>, got <got>";
str required(Type t1, Type t2) = required(t1, getName(t2));

// ------- End creation of the type-environment ----- ///

//We are seeing a integer number, give an error if we are not expecting an integer number
TENV checkComb(exp:intCon(int N), Type req, TENV env) =
req == Integer() ? env :
addError(env, exp@location, required(req, "integer"));  

TENV checkComb(exp:strCon(str S), Type req, TENV env) =
req == String() ? env :
addError(env, exp@location, required(req, "string"));

TENV checkComb(exp:id(Id name), Type req, TENV env) {
	//First check if the identifier exists in the type environment
	if(!env.symbols[name]?){
		return addError(env, exp@location, "Undeclared variable <name>");
	}
	//Next check if the required type is the type we have optained
	tpid = env.symbols[name]; 
	return req == tpid ? env : addError(env, exp@location, required(req, tpid));
}

//Make sure the two parts have the same type
TENV checkExp(exp:add(Comb E1, Comb E2), Type req, TENV env) =
	req == Integer() || req == String() ?checkExp(E1, req, checkExp(E2, req, env))
					 				  : addError(env, exp@location, required(req, "Integer or String"));

//Make sure the two parts have the same type
TENV checkExp(exp:sub(Comb E1, Comb E2), Type req, TENV env) =
	req == Integer() || req == String() ?checkExp(E1, req, checkExp(E2, req, env))
					 				  : addError(env, exp@location, required(req, "Integer or String"));

//Make sure the two parts have the same type
TENV checkExp(exp:comma(Comb E1, Comb E2), Type req, TENV env) =
	req == Integer() || req == String() ?checkExp(E1, req, checkExp(E2, req, env))
					 				  : addError(env, exp@location, required(req, "Integer or String"));

TENV checkSLCOId(stat: id(Id name), TENV env) {
	if(!env.symbols[name]?)
		return addError(env, stat@location, "Undeclared variable <name>");
	tpid = env.symbols[name];
	return env;
	//return checkExp(Exp, tpid, env);
}

//Iterate over statements and for each statement 
TENV checkIds(list[SLCOId] ids1 , TENV tenv){
	//for(S <- ids1) {
	//	//env = checkSLCOId(S, env);
	//} 
	return tenv;
}

TENV CheckIds(Program p, TENV tenv){
	return tenv;
}


TENV CreateEnvironmentFromProgram(Program p){
	Model m = p.model;
	TENV tenv = InitializeWithModel(m.modelId); 
	for(object <- m.objects) {
		tenv = addId(Class(), tenv, object.objectId);
		for(c <- m.classes){
				// this must happen exactly once
				if(object.classId == c.classId){
					tenv = addIdsOfClass(c, tenv);
				}
			}
	}
	for(channel <- m.channels){
		tenv = addId(Channel(), tenv, channel.channelId);
	}
	
	return tenv;
}

TENV addIdsOfClass(Class c, TENV tenv){
		//addId(Class(), tenv, c.classId);
		tenv = addIds(Port(), tenv, c.portIds);
		for(sm <- c.stateMachines){
			tenv = addId(StateMachine(), tenv, sm.stateMachineId);
			tenv = addVariables(tenv, sm.variables);
			tenv = addId(State(), tenv, sm.initialState);
			tenv = addIds(State(), tenv, sm.states);
			for(t <- sm.transitions){
				tenv = addId(Transition(), tenv, t.transitionId);
			}
		};
		return tenv;
}
 
//Build up the type environments (being ports, integers, states)
//TENV createEnvironment(list[Variable] decls) {
//		(Id : tp | Variable(SLCOId variableId, TYPE tp) <- decls), [];
//	}
//
//TENV createEnvironment(list[Variable] decls, TENV tenv){
//	
//	(Id : tp | Variable(SLCOId variableId, TYPE tp) <- decls), [];
// 
//}

public TENV checkProgram(Program p){
	//if(Program(Model model) := P){
	TENV env = CreateEnvironmentFromProgram(p);
	return env;
	//return CheckIds(p, env);
	//} else {
	//throw "Cannot Happen";
}


public list[tuple[loc l, str msg]] checkProgram(str txt) = checkProgram(load(txt)).errors;



