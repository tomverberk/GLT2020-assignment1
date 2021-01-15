module slco::Check

import slco::AST;
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
alias TENV = tuple[ map[AId, AVariable] symbols, list[tuple[loc l, str msg]] errors];

// Used to add Errors to the type-environment
TENV addError(TENV env, loc l, str msg) = env[errors = env.errors + <l, msg>];

str required(AVariable v, str got) = "Required <getName(v)>, got <got>";
str required(AVariable v1, AVariable v2) = required(v1, getName(v2));

// ------- End creation of the type-environment ----- ///

//We are seeing a natural number, give an error if we are not expecting a natural number
TENV checkExp(exp:natCon(int N), TYPE req, TENV env) =
req == natural() ? env :
addError(env, exp@location, required(req, "natural"));

TENV checkExp(exp:strCon(str S), TYPE req, TENV env) =
req == string() ? env :
addError(env, exp@location, required(req, "string"));

//IDENTIFYER
TENV checkExp(exp:id(Id Id), TYPE req, TENV env) {
	//First check if the identifier exists in the type environment
	if(!env.symbols[Id]?){
		return addError(env, exp@location, "Undeclared variable <Id>");
	}
	//Next check if the required type is the type we have optained
	tpid = env.symbols[Id];
	return req == tpid ? env : addError(env, exp@location, required(req, tpid));
}

