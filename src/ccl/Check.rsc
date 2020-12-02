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
	hasError = false;
	visit(ast.resources) {
		case Aresource(AresourceId id, list[AMI] mis): 
			hasError = (hasError || checkResource(Aresource(id, mis)));
	}
	return hasError;
}

bool checkResource(AResource resource){
	hasError = false;
		visit(resource.mis) {
			case Asmi(AId id, ASMI smi): hasError = (hasError || checkMI(smi));
			case Acmi(AId id, ACMI cmi): hasError = (hasError || checkMI(cmi));
		}
	return hasError;
}

 //Check MI’s labels must be unique.
bool checkUniquenessMILabels(AProgram ast){
	
	return false;
}

bool checkMI(ASMI asmi){
	hasError = false;
	visit(asmi.elements) {
		case Aregion(str reg): hasError = (hasError || MIRegionInCorrect(Aregion(reg)));
		case Aengine(str eng): hasError = (hasError || DBEngineInValid(Aengine(eng)));
		case ACPU(int cpu): ;
		case Amemory(int size): hasError = (hasError || memorySizeMax(Amemory(size)));
		case AIPV6(str ivp6): ;
		case Astorage(str kind, int size): hasError = (hasError || storageSizeMax(Astorage(kind, size)));
		}
	return hasError;
}

bool checkMI(ACMI acmi){
	hasError = false;
	visit(acmi.elements) {
		case Aregion(str reg): hasError = (hasError || MIRegionInCorrect(Aregion(reg)));
		case AOS(str os): hasError = (hasError || OSResourceInCorrect(AOS(os)));
		case AIPV6(str ivp6): ;
		case Astorage(str kind, int size): hasError = (hasError || storageSizeMax(Astorage(kind, size)));
		case ACPU(int cpu): ;
		case Amemory(int size): hasError = (hasError || memorySizeMax(Amemory(size)));
		}
	return hasError;
}

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

// check All MIs in a resource element must be defined in the same region.
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

// check Do not accept duplicate MIs with the exact same connfguration and different labels.
// TODO
bool sameMIDifferentLabel(AProgram ast){


	return true; 
}

//check The language supports Booleans, integers and string types.
// TODO to be fair idk of dit moet of niet
bool support(AProgram ast){


	return true;
}
