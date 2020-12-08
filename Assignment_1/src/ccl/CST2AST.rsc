module ccl::CST2AST

import ccl::AST;
import ccl::Syntax;
import String;

/*
 * -Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * - Hint: Use switch to do case distinction with concrete patterns 
 * - Map regular CST arguments (e.g., *, +, ?) to lists 
 * - Map lexical nodes to Rascal primitive types (bool, int, str)
 */

 // This file maps the concrete syntax tree to the abstract syntax tree, by linking all types to each other.
 
 // Mapping for the start of the program. 
AProgram cst2ast(Program pr) { 
	switch(pr) {
		case (Program)`resource <Resource resource>`: return Aprogram(cst2ast(pr.resource));
		default: throw "Unhandled expression: <pr>";
	}
}

//Mapping for the resource from cst to ast, a resource has an id and a list of MIs
AResource cst2ast(Resource resource) {
	switch(resource) {
		case (Resource)`<Id id> { <MI* mis> }`: return Aresource(cst2ast(id), toList(mis));
		default: throw "Unhandled expression: <resource>";
	}
}

// Listing the MIs (storage, computing, id)
list[AMI] toList(MI* mis){
	return [cst2ast(mi.milast) | MI mi <- mis];
}

// A MI is either a storage, computing or ID. For the id we can map only the id from cst2ast, but for the other two we have to map the elements too
AMI cst2ast(MIlastElement mi) {
    switch (mi) {
    case (MIlastElement)`storage <Id id> { <SMI smi> }`: return Asmi(cst2ast(id), cst2ast(smi));
    case (MIlastElement)`computing <Id id> { <CMI cmi> }`: return Acmi(cst2ast(id), cst2ast(cmi));
    case (MIlastElement)`<Id id>`: return Ami(cst2ast(id));
        default: throw "Unhandled expression: <mi>"; 
    } 
}

// An Storage mi has a list of storage Mi elements
ASMI cst2ast(SMI smi){
// Here we return the list of the storage mi elements
	return Asmi(toList(smi.smiElements));
}

// Creating the list of Storage MI elements
list[ASMIelement] toList(SMIelement* smielements) {
    return [cst2ast(e.element) | SMIelement e <- smielements];
}

// Mapping of the storage MI elements to the Abstract syntax storage Mi elements
ASMIelement cst2ast(SMIlastElement smi) {
	switch (smi) {
	case (SMIlastElement)`region: <Region reg>`: return ASregion("<reg>");
	case (SMIlastElement)`engine: <Engine eng>`: return ASengine("<eng>");
	case (SMIlastElement)`CPU: <CPU cpu> cores`: return ASCPU(toInt("<cpu>"));
	case (SMIlastElement)`memory: <Memory mem> GB`: return ASmemory(toInt("<mem>"));
	case (SMIlastElement)`IPV6: <IPV6 ipv6>`:return ASIPV6("<ipv6>");
	case (SMIlastElement)`storage: <Storage sto> GB`:return ASstorage("<sto.val1>", toInt("<sto.val2>"));
		default: throw "Unhandled expression: <smi>";
	}
}

// An computing mi has a list of storage Mi elements
ACMI cst2ast(CMI cmi){
// Here we return the list of the computing mi elements
	return Acmi(toList(cmi.cmiElements));
}

// Creating the list of Computing MI elements
list[ACMIelement] toList(CMIelement* cmielements) {
    return [cst2ast(e.element) | CMIelement e <- cmielements];
}

// Mapping of the computing  MI elements to the Abstract syntax computing Mi elements
ACMIelement cst2ast(CMIlastElement cmi) {
	switch (cmi) {
		case (CMIlastElement)`region: <Region reg>`: return ACregion("<reg>");
		case (CMIlastElement)`OS: <OS os>`: return ACOS("<os>");
		case (CMIlastElement)`IPV6: <IPV6 ipv6>`:return ACIPV6("<ipv6>");
		case (CMIlastElement)`storage: <Storage sto> GB`:return ACstorage("<sto.val1>", toInt("<sto.val2>"));
		case (CMIlastElement)`CPU: <CPU cpu> cores`: return ACCPU(toInt("<cpu>"));
		case (CMIlastElement)`memory: <Memory mem> GB`: return ACmemory(toInt("<mem>"));
		default: throw "Unhandled expression: <cmi>";
	}
}

// Mapping the CST ID to the AST ID
AId cst2ast(Id id){
	return Aid("<id>");
}