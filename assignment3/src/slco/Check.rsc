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
TENV addId(Type tp, TENV env, SLCOId Id) =
<(Id.name : tp) + env.symbols, []>;

// #TODE CHANGE THIS TO MAKE SURE THAT WE CHECK THAT THE VARIABLE DOES NOT YET EXISTS
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
//TENV checkId(Type idType, Type reqType, TENV env) =
//reqType == idType ? env :
//addError(env, idType@location, required(reqType, idType));  

TENV CheckComb(Comb combinations, TENV env){
	return env;
	//Dit is de enige die nog gedaan moet worden
}

TENV CheckId(SLCOId id, Type req, TENV env) {
	//First check if the identifier exists in the type environment
	if(!env.symbols[id.name]?){
		return addError(env, id@location, "Undeclared variable <id.name>");
	}
	//return addError(env, id@location, "Undeclared variable");
	//Next check if the required type is the type we have optained
	tpid = env.symbols[id.name]; 
	if(tpid != req){
		env = addError(env, id@location, required(req,tpid)); 
	}
	
	return env;
}


//Iterate over statements and for each statement 
TENV checkIds(Program p, TENV tenv){
	Model m = p.model;
	for(c <- m.classes){
		for(sm <- c.stateMachines){
			for(t <- sm.transitions){
				tenv = CheckId(t.stateIdBegin, State(), tenv);
				tenv = CheckId(t.stateIdEnd, State(), tenv);
				for(b <- t.transitionBodies){
					line = b.transitionLine;
					switch(line){
						case TransitionLine(SendAction sendAction): { 
							tenv = CheckComb(sendAction.combinations, tenv);
							tenv = CheckId(sendAction.portId, Port(), tenv);
						}
						case TransitionLine(ReceiveAction receiveAction): {
							tenv = CheckComb(receiveAction.combinations, tenv);
							tenv = CheckId(receiveAction.portId, Port(), tenv);
						}
						case TransitionLine(WaitAction waitAction): ; //Do nothing
						}
				};
			};
		};
	};
	for(object <- m.objects){
		//Check if the Class is of a real class
		tenv = CheckId(object.classId, Class(), tenv);
	};
	for(channel <- m.channels){
		//Check if the objects and ports exist
		tenv = CheckId(channel.objectIdSource, Object(), tenv);
		tenv = CheckId(channel.portIdSource, Port(), tenv);
		tenv = CheckId(channel.objectIdTarget, Object(), tenv);
		tenv = CheckId(channel.portIdTarget, Port(), tenv);
		
	};
	return tenv;
}


TENV CreateEnvironmentFromProgram(Program p){
	Model m = p.model;
	TENV tenv = InitializeWithModel(m.modelId); 
	for(object <- m.objects) {
		tenv = addId(Object(), tenv, object.objectId);
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
		tenv = addId(Class(), tenv, c.classId);
		tenv = addIds(Port(), tenv, c.portIds);
		for(sm <- c.stateMachines){
			tenv = addId(StateMachine(), tenv, sm.stateMachineId);
			tenv = addVariables(tenv, sm.variables);
			tenv = addId(State(), tenv, sm.initialState);
			tenv = addIds(State(), tenv, sm.states);
			for(t <- sm.transitions){
				tenv = addId(Transition(), tenv, t.transitionId);
				for(b <- t.transitionBodies){
					line = b.transitionLine;
					//Add ActionId's
					switch(line){
						case TransitionLine(SendAction sendAction): { 
							tenv = addId(Action(), tenv, sendAction.actionId);
						}
						case TransitionLine(ReceiveAction receiveAction): {
							tenv = addId(Action(), tenv, receiveAction.actionId);

						}
						case TransitionLine(WaitAction waitAction): ; //Do nothing
						}
				};
			}
		};
		return tenv;
}
 

public TENV checkProgram(Program p){
	TENV env = CreateEnvironmentFromProgram(p);
	env = checkIds(p, env);
	return env;
}


public list[tuple[loc l, str msg]] checkProgram(loc l) = checkProgram(load(l)).errors;
public map[Id, Type] checkTENV(loc l) = checkProgram(load(l)).symbols;



