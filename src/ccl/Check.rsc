module ccl::Check

import ccl::AST;
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



//Start of the checkWellformedness
bool checkCloudConfiguration(AProgram ast){
// If has error, then true, else false
	hasError = false;
	visit(ast.resource) {
		case Aresource(AId id, list[AMI] mis): 
			hasError = (hasError || checkResource(Aresource(id, mis)));
	}
	// has error is true if we have an error, so we return !haserror.
	return !hasError;
}


bool checkResource(AResource resource){
	// TODO MAKE SURE ALL IS IN SAME REGION
	hasError = false;
	// Check if all regions are the same of all the MI's
	hasError = (hasError || RegionCheck(resource));
	
	// Visit all mis and check if it is an storage MI or a computing MI and do the checks accordingly	
		visit(resource.mis) {
			case Asmi(AId id, ASMI smi): hasError = (hasError || checkMI(smi) || comparisonCheck(smi,id,resource.mis) );
			case Acmi(AId id, ACMI cmi): hasError = (hasError || checkMI(cmi) || comparisonCheck(cmi,id,resource.mis) );
			default: ;
		}
	return hasError;
}

// Checking a storage MI
bool comparisonCheck(ASMI og_asmi, AId og_id, list[AMI] mis){
	bool hasError = false;
	// Loop over all the other MIs and check for  the constraints. For computing MIs we only check the ID, since the elements cannot be the same. 
	visit(mis)
		{
			case Asmi(AId id, ASMI smi): hasError = hasError || CompareSMI(og_asmi, smi, og_id, id);
			case Acmi(AId id, ACMI cmi): hasError = hasError || IdIsSame(id.name, og_id.name);
			default: ;
		}
	return hasError;
}

// Checking a computing MI
bool comparisonCheck(ACMI og_acmi, AId og_id, list[AMI] mis){
	bool hasError = false;
	// Loop over all the other MIs and check for the constraints. For storage MIs we only check the ID, since the elements cannot be the same. 
	visit(mis)
		{
			case Asmi(AId id, ASMI smi): hasError = hasError || IdIsSame(id.name, og_id.name);
			case Acmi(AId id, ACMI cmi): hasError = hasError || CompareCMI(og_acmi, cmi, og_id, id) ;
			default: ;
		}
	return hasError;
}

// In this check we compare if the content is the same, if the content is the same, then also the ID should be the same.
bool CompareSMI(ASMI smi_1, ASMI smi_2, AId id_1, AId id_2){
		// If content is different but name is the same
		if(!ContentIsSame(smi_1, smi_2) && IdIsSame(id_1.name, id_2.name)){
			return true;
		}
		
		//If content is the same but id is different
		if(ContentIsSame(smi_1, smi_2) && !IdIsSame(id_1.name, id_2.name)){
			return true;
		}
	return false;
}

// In this check we compare if the content is the same, if the content is the same, then also the ID should be the same.
bool CompareCMI(ACMI cmi_1, ACMI cmi_2, AId id_1, AId id_2){
		// If content is different but name is the same
		if(!ContentIsSame(cmi_1, cmi_2) && IdIsSame(id_1.name, id_2.name)){
			return true;
		}
		
		//If content is the same but id is different
		if(ContentIsSame(cmi_1, cmi_2) && !IdIsSame(id_1.name, id_2.name)){
			return true;
		}
	return false;	
}

//Returns true if two ACMI have all the same elements
bool ContentIsSame(ACMI cmi_1, ACMI cmi_2){
// Loop over all the elements of computing MI 1
	for(element_1 <- cmi_1.elements){
		// check if theelement is in the elements of Computing MI 2
		matchElement1 = false;
			for(element_2 <- cmi_2.elements){
				if(element_1 == element_2){
					matchElement1 = true;
				}
			}
		// If one of the elments is not in there, then we can immmediately return false, since not all elements are the same
		if(!matchElement1){
			return false;
		}
	}
	return true;
}

//Returns true if two ASMI have all the same elements
bool ContentIsSame(ASMI smi_1, ASMI smi_2){
// Loop over all the elements of computing MI 1
	for(element_1 <- smi_1.elements){
	// check if theelement is in the elements of Computing MI 2
		matchElement1 = false;
			for(element_2 <- smi_2.elements){
				if(element_1 == element_2){
					matchElement1 = true;
				}
			}
			// If one of the elments is not in there, then we can immmediately return false, since not all elements are the same
		if(!matchElement1){
			return false;
		}
	}
	return true;
}

// simple comparing the strings of the ID to see if they are the same
bool IdIsSame(str id1, str id2){
	if(id1 == id2){
		return true;
	}
	return false;		
}

// Check if all regions are the same for all MIs
bool RegionCheck(AResource resource){
	str region;
	visit(resource.mis) {
			case Asmi(AId id, ASMI smi): region = getRegion(smi);
			case Acmi(AId id, ACMI cmi): region = getRegion(cmi);
			default: ;
		}
	visit(resource.mis) {
			case Asmi(AId id, ASMI smi): if(getRegion(smi) != region) return true;
			case Acmi(AId id, ACMI cmi): if(getRegion(cmi) != region) return true;	
			default: ;
		}
	return false;
}

// Get the region of an storage mi
str getRegion(ASMI smi){
	visit(smi.elements){
			case ASregion(str reg): return reg;
			default: ;
		}
	return "";
} 

// function to get the region of a computing mi
str getRegion(ACMI cmi){
	visit(cmi.elements){
			case ACregion(str reg): return reg;
			default: ;
		}
	return "";
} 

// All the checks for a storage MI and the constraints on its elements
bool checkMI(ASMI asmi){
	hasError = false;
	visit(asmi.elements) {
		case ASregion(str reg): hasError = (hasError || MIRegionInCorrect(ASregion(reg)));
		case ASengine(str eng): hasError = (hasError || DBEngineInValid(ASengine(eng)));
		case ASCPU(int cpu): ;
		case ASmemory(int size): hasError = (hasError || memorySizeMax(ASmemory(size)));
		case ASIPV6(str ivp6): ;
		case ASstorage(str kind, int size): hasError = (hasError || storageSizeMax(ASstorage(kind, size)));
		default: ;
		}
	return hasError;
}

// All the checks for a computing MI and the constraints on its elements
bool checkMI(ACMI acmi){
	hasError = false;
	visit(acmi.elements) {
		case ACregion(str reg): hasError = (hasError || MIRegionInCorrect(ACregion(reg)));
		case ACOS(str os): hasError = (hasError || OSResourceInCorrect(ACOS(os)));
		case ACIPV6(str ivp6): ;
		case ACstorage(str kind, int size): hasError = (hasError || storageSizeMax(ACstorage(kind, size)));
		case ACCPU(int cpu): ;
		case ACmemory(int size): hasError = (hasError || memorySizeMax(ACmemory(size)));
		default:;
		}
	return hasError;
}

// Check The storage size must be greater than zero but less than or equal to 1000 GB. (Storage MI)
bool storageSizeMax(ASMIelement storage){
	if(storage.size <= 1000 && storage.size >= 0){
		return false;
	}
	return true;
}

// Check The storage size must be greater than zero but less than or equal to 1000 GB. (Computing MI)
bool storageSizeMax(ACMIelement storage){
	if(storage.size <= 1000 && storage.size >= 0){
		return false;
	}
	return true;
}

// Check The maximum memory size is greater than zero and but less or equal to 64 gb
bool memorySizeMax(ASMIelement memory){
	if(memory.size <= 64 && memory.size >= 0){
		return false;
	}
	return true;
}

// Check The maximum memory size is greater than zero and but less or equal to 64 gb
bool memorySizeMax(ACMIelement memory){
	if(memory.size <= 64 && memory.size >= 0){
		return false;
	}
	return true;
}

//check MI region must be valid. In other words, the MI’s region have to be one of the locations (Storage MI)
//mentioned in Section 3.1.
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

//check MI region must be valid. In other words, the MI’s region have to be one of the locations (computing MI)
//mentioned in Section 3.1.
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

//Check OS resourceValid In other words the name of the 
//OS has to be one of the OS mentioned in section 3.1
bool OSResourceInCorrect(ACMIelement os){
	if(os.os == "Linux" 
	|| os.os == "Red Hat Enterprise" 
	|| os.os == "Ubuntu Server" 
	|| os.os == "Windows Server 2019"){
		return false;
		}
	return true;
}

//check The language supports Booleans, integers and string types.
// TODO to be fair idk of dit moet of niet
bool support(AProgram ast){


	return true;
}
