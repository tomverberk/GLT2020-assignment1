module ccl::Check

import ccl::AST;

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



//Checks all the stuff
bool checkCloudConfiguration(AProgram ast){
	if ( checkUniquenessMILabels(ast)
	|| storageSizeMax(ast)
	|| memorySizeMax(ast)
	|| MIRegionInCorrect(ast)
	|| DBEngineInValid(ast)
	|| OSResourceInCorrect(ast)
	|| MIInResourceInSameRegion(ast)
	|| sameMIDifferentLabel(ast)
	|| support(ast)
	){
		return true;
	} else {
		return false;
	}
}

// Check MI’s labels must be unique.
//bool checkUniquenessMILabels(AProgram ast){
//	AResource Aresource = ast.resource;
//	visit(Aresource.mis) {
//		case(Asmi(AID id, ASMI smi): 
//
//	}
//	return true;
//}

// Check The storage size must be greater than zero but less than or equal to 1000 GB.
bool storageSizeMax(ASMIelement storage){
	if(storage.size <= 1000 && storage.size >= 0){
		return false;
	}
	return true;
}

bool storageSizeMax(ACMIelement storage){
	if(storage.size <= 1000 && storage.size >= 0){
		return false;
	}
	return true;
}

// Check The maximum memory size is 64 GB.
bool memorySizeMax(ASMIelement memory){
	if(memory.size <= 64 && memory.size >= 0){
		return false;
	}
	return true;
}

bool memorySizeMax(ACMIelement memory){
	if(memory.size <= 64 && memory.size >= 0){
		return false;
	}
	return true;
}

//check MI region must be valid. In other words, the MI’s region have to be one of the locations
//mentioned in Section 3.1.
//  "California"
// "Cape Town"
// "Frankfurt"
// "Bogota"
// "Seoul";
bool MIRegionInCorrect(ASMIelement region){
	if(region.reg == "California"
	|| region.reg == "Cape Town"
	|| region.reg == "Frankfurt"
	|| region.reg == "Bogota"
	|| region.reg == "Seoul"){
		return false;
		}
	return true;
}

bool MIRegionInCorrect(ACMIelement region){
	if(region.reg == "California"
	|| region.reg == "Cape Town"
	|| region.reg == "Frankfurt"
	|| region.reg == "Bogota"
	|| region.reg == "Seoul"){
		return false;
		}
	return true;
}

//check DB engine must be valid. In other words, the name of the DB engine have to be one of
//the engines mentioned in Section 3.1.

// "MySQL"
// "PostgreSQL"
// "MariaDB"
// "Oracle"
// "SQL Server";
bool DBEngineInValid(ASMIelement engine){
	if(engine.eng == "MySQL"
	|| engine.eng == "PostgreSQL" 
	|| engine.eng == "MariaDB" 
	|| engine.eng == "Oracle"
	|| engine.eng == "SQL Server"){
		return false;
		}
	return true;
}
// can't be ACMI element

// check All MIs in a resource element must be dened in the same region.
//TODO
bool MIInResourceInSameRegion(AProgram ast){

	return true;
}

//Check OS resourceValid In other words the name of the 
//OS has to be one of the OS mentioned in section 3.1
// "Linux"
// "Red Hat enterprises"
// "Ubuntu Server"
// "Windows Server 2019"

bool OSResourceInCorrect(ACMIelement os){
	if(os.os == "Linux" 
	|| os.os == "Red Hat enterprises" 
	|| os.os == "Ubuntu Server" 
	|| os.os == "Windows Server 2019"){
		return false;
		}
	return true;
}
// Can't be ASMIelement

// check Do not accept duplicate MIs with the exact same conguration and dierent labels.
// TODO
bool sameMIDifferentLabel(AProgram ast){


	return true; 
}

//check The language supports Booleans, integers and string types.
// TODO to be fair idk of dit moet of niet
bool support(AProgram ast){


	return true;
}
