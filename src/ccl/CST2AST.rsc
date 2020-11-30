module ccl::CST2AST

import ccl::AST;
import ccl::Syntax;

import ParseTree;
import String;
import Integer;
import Boolean;

/*
 * -Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * - Hint: Use switch to do case distinction with concrete patterns 
 * - Map regular CST arguments (e.g., *, +, ?) to lists 
 * - Map lexical nodes to Rascal primitive types (bool, int, str)
 */

 
//Program cst2ast(start[Program] pr) {
	
//}


ASMIlastElement cst2ast(SMIlastElement smi) {
	switch (smi) {
		case (SMIlastElement)`region: <Region reg>`: return Aregion(str reg);
		case (SMIlastElement)`Engine`: return Aengine(str eng);
	}
}

ARegion cst2ast(Region reg) {
	
}