module slco::Check

import slco::AST;
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

// Used to add Errors to the type-environment
TENV addError(TENV env, loc l, str msg) = env[errors = env.errors + <l, msg>];
//TENV addVariables(TENV env, list[Variable] decls) = env + newVariables(decls);
TENV addVariables(TENV env, list[Variable] decls) = 
<(variableId : tp | Variable(Type tp, Id variableId) <- decls) + env.symbols, []>;
TENV addStates(TENV env, list[SLCOId] states) = 
<(variableId : State() | id(Id variableId) <- states) + env.symbols, []>;
TENV addPorts(TENV env, list[SLCOId] ports) =
<(variableId : Port() | id(Id variableId) <- ports) + env.symbols, []>;

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
	TENV tenv;
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
	return CheckIds(p, env);
	//} else {
	//throw "Cannot Happen";
}



