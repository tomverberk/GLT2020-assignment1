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

// ------ BEGIN Creation of the type-environment and standard functions------ ///
// Create a mapping between variables and types
alias TENV = tuple[ map[Id, Type] symbols, list[tuple[loc l, str msg]] errors];

// Used to add Errors to the type-environment
TENV addError(TENV env, loc l, str msg) = env[errors = env.errors + <l, msg>];

//basic operation
str required(Type t, str got) = "Required <getName(t)>, got <got>";
str required(Type t1, Type t2) = required(t1, getName(t2));

//Method to ininitalize the TENV with a model
TENV InitializeWithModel(SLCOId model) =                                                 
<( Id : Model()  | id(Id Id) <- model), []>;

// ------- End creation of the type-environment and standard functions ----- ///

// ------- Begin methods regarding adding ID's to the environment ----- //

//Method that is responsible for ensuring that the ID is checked and added to the environment
TENV addId(Type tp, TENV env, SLCOId id){
	env = CheckIdExists(env, id);
	env = addIdToENV(tp, env, id);
	return env;
}

// Method that loops through list and adds them individually
TENV addIds(Type tp, TENV env, list[SLCOId] Ids){
	for(id <- Ids){
		env = addId(tp, env, id);
	};
	return env;
}

//Method used to actually Add an ID to the ENV
TENV addIdToENV(Type tp, TENV env, SLCOId Id) =
<(Id.name : tp) + env.symbols, env.errors>;


//Method that checks if the ID initializes is not already in the type environment
TENV CheckIdExists(TENV env, SLCOId Id){
	if(env.symbols[Id.name]?){
		return addError(env, Id@location, "Already declared variable <Id.name>");
	}
	return env;
}





// ------- BEGIN Type environment handling of Combinations ----------- //

TENV checkComb(combinations:intCon(int N), Type req, TENV env) =                              
  req == Integer() ? env : addError(env, combinations@location, required(req, "Integer"));

TENV checkComb(combinations:IdCon(SLCOId Id), Type req, TENV env) {                              
  	return CheckId(Id, req, env);
}

//WE are only doing operations with Integers
TENV checkComb(combinations:add(Comb E1, Comb E2), Type req, TENV env) =                        
  req == Integer() ? checkComb(E1, Integer(), checkComb(E2, Integer(), env))
                   : addError(env, combinations@location, required(req, "Integer"));
  
TENV checkComb(combinations:sub(Comb E1, Comb E2), Type req, TENV env) =                      
  req == Integer() ? checkComb(E1, Integer(), checkComb(E2, Integer(), env))
                   : addError(env, combinations@location, required(req, "Integer"));

//WE CAN SEND BOTH ID's and Integers
TENV checkComb(combinations:comma(Comb E1, Comb E2), Type req, TENV env) =                    
 	checkComb(E1, req, checkComb(E2, req, env));

// ------- END Type environment handling of Combinations ----------- //

// ------- BEGIN Type environment handling of Variables ---------- //
//We only implemented Integer Variables, but in the future this can be easily extended to also incorperate Strings etc.
TENV addVariables(TENV env, list[Variable] variables){
	for(variable <- variables){
		//SLCOId id = variable.variableId;
		//env = CheckIdExists(env, id);
		//env = addIdToENV(variable.tp, env, id);
		env = addId(variable.tp, env, variable.variableId);
	};
	return env;
}

// ------- END Type environment handling of Variables ---------- //

// ------- BEGIN Typechecking of Id's in the program ----------- //

// Method that checks if an id inputted in the program exists, and if so checks if it has the right type.
TENV CheckId(SLCOId id, Type req, TENV env) {
	//First check if the identifier exists in the type environment
	if(!env.symbols[id.name]?){
		return addError(env, id@location, "Undeclared variable <id.name> Type: <req> expected");
	}
	//return addError(env, id@location, "Undeclared variable");
	//Next check if the required type is the type we have optained
	tpid = env.symbols[id.name]; 
	if(tpid != req){
		env = addError(env, id@location, required(req,tpid)); 
	}
	
	return env;
}

//Method that loops over the program and checks if all the ID's are correct
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
							tenv = checkComb(sendAction.combinations, Integer(), tenv);
							tenv = CheckId(sendAction.portId, Port(), tenv);
						}
						case TransitionLine(ReceiveAction receiveAction): {
							tenv = checkComb(receiveAction.combinations, Integer(), tenv);
							tenv = CheckId(receiveAction.portId, Port(), tenv);
						}
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

// ------- END Typechecking of Id's in the program ----------- //

// ------- BEGIN TENV creation of a program --------------- //

// Method that for a program adds the channels, objects, and classes that belong to the object to the Type environment
TENV CreateEnvironmentFromProgram(Program p){
	Model m = p.model;
	TENV tenv = InitializeWithModel(m.modelId); 
	for(object <- m.objects) {
		tenv = addId(Object(), tenv, object.objectId);
		bool classExists = false;
		for(c <- m.classes){
				// this must happen exactly once
				if(object.classId == c.classId){
					tenv = addIdsOfClass(c, tenv);
					classExists = true;
				};
		};
		if(!classExists){
			SLCOId classId = object.classId;
			tenv = addError(tenv, classId@location, "Class <classId.name> not found");
		};
	}
	for(channel <- m.channels){
		tenv = addId(Channel(), tenv, channel.channelId);
	}
	
	return tenv;
}

// Method that adds all the ID's of a certain class to the Type environment.
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
					}
				};
			}
		};
		return tenv;
}
 
// ------- BEGIN TENV creation of a program --------------- //

// ------- Begin Standard methods ---------- //

//Method that checks the entire program

public TENV checkProgram(Program p){
	TENV env = CreateEnvironmentFromProgram(p);
	env = checkIds(p, env);
	return env;
}

// Method that prints all the errors of the program
public list[tuple[loc l, str msg]] checkProgram(loc l) = checkProgram(load(l)).errors;
//Method that prints all the symbols of the Type Environment of the program
public map[Id, Type] checkTENV(loc l) = checkProgram(load(l)).symbols;

// --------- END Standard methods ------- //



