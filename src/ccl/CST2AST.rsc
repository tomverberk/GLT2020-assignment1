module ccl::CST2AST

import ccl::AST;
import ccl::Syntax;

//import ParseTree;
import String;
import List;
//import Integer;
//import ccl::Boolean;

/*
 * -Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * - Hint: Use switch to do case distinction with concrete patterns 
 * - Map regular CST arguments (e.g., *, +, ?) to lists 
 * - Map lexical nodes to Rascal primitive types (bool, int, str)
 */

 
AProgram cst2ast(start[Program] pr) {
	AProgram program = Aprogram(cst2ast(pr.resource));
	return program; 
}

AResource cst2ast(Resource resource) {
	AResource Resource = Aresource("<resource.id>", toList(resource.mis));
	return Resource; 
}

list[AMI] toList(MI* mis){
	return [cst2ast(mi.milast) | MI mi <- mis];
}

AMI cst2ast(MIlastElement mi) {
    switch (mi) {
    case (MIlastElement)`storage <Id id> { <SMI smi> }`: return Asmi(cst2ast(id), cst2ast(smi));
    case (MIlastElement)`computing <Id id> { <CMI cmi> }`: return Acmi(cst2ast(id), cst2ast(cmi));
    case (MIlastElement)`<Id id>`: return Ami(cst2ast(id));
        default: throw "Unhandled expression: <mi>"; 
    } 
}


ASMI cst2ast(SMI smi){
	return Asmi(toList(smi.smiElements));
}

list[ASMIelement] toList(SMIelement* smielements) {
    return [cst2ast(e.element) | SMIelement e <- smielements];
}


ASMIelement cst2ast(SMIlastElement smi) {
	switch (smi) {
	case (SMIlastElement)`region: <Region reg>`: return Aregion("<reg>");
	case (SMIlastElement)`Engine: <Engine eng>`: return Aengine("<eng>");
	case (SMIlastElement)`CPU: <CPU cpu> GB`: return ACPU(toInt("<cpu>"));
	case (SMIlastElement)`memory: <Memory mem> GB`: return Amemory(toInt("<mem>"));
	//ADD MAYBE STRING TO BOOLEAN
	case (SMIlastElement)`IPV6: <IPV6 ipv6> GB`:return AIPV6("<ipv6>");
	case (SMIlastElement)`storage: <Storage sto>`:return Astorage("<sto.val1>", toInt("<sto.val2>"));
		default: throw "Unhandled expression: <smi>";
	}
}


ACMI cst2ast(CMI cmi){
	return Acmi(toList(cmi.cmiElements));
}


list[ACMIelement] toList(CMIelement* cmielements) {
    return [cst2ast(e.element) | CMIelement e <- cmielements];
}


ACMIelement cst2ast(CMIlastElement cmi) {
	switch (cmi) {
		case (CMIlastElement)`region: <Region reg>`: return Aregion("<reg>");
		case (CMIlastElement)`OS: <OS os>`: return AOS("<os>");
		case (CMIlastElement)`IPV6: <IPV6 ipv6> GB`:return AIPV6("<ipv6>");
		case (CMIlastElement)`storage: <Storage sto>`:return Astorage("<sto.val1>", toInt("<sto.val2>"));
		case (CMIlastElement)`CPU: <CPU cpu> GB`: return ACPU(toInt("<cpu>"));
		case (CMIlastElement)`memory: <Memory mem> GB`: return Amemory(toInt("<mem>"));
		default: throw "Unhandled expression: <cmi>";
	}
}

AId cst2ast(Id id){
	return Aid("<id>");
}