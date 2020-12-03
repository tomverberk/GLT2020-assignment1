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
	visit(ast.resource) {
		case Aresource(AresourceId id, list[AMI] mis): 
			hasError = (hasError || checkResource(Aresource(id, mis)));
	}
	return hasError;
}

bool checkResource(AResource resource){
	// TODO MAKE SURE ALL IS IN SAME REGION
	hasError = false;
	hasError = (hasError || RegionCheck(resource));
	// AND NOT 2 TIMES SAME MI BUT DIFFERENT LABELL
	
	// ALL OTHER CHECKS
	
		visit(resource.mis) {
			case Asmi(AId id, ASMI smi): hasError = (hasError || checkMI(smi) || comparisonCheck(smi,id,resource.mis));
			case Acmi(AId id, ACMI cmi): hasError = (hasError || checkMI(cmi) || comparisonCheck(cmi,id,resource.mis));
			default: ;
		}
	return hasError;
}

bool comparisonCheck(ASMI og_asmi, AId og_id, list[AMI] mis){
	visit(mis)
		{
			case Asmi(AId id, ASMI smi): CompareSMI(og_asmi, smi, og_id, id);
			case Acmi(AId id, ACMI cmi): IdIsSame(id.name, og_id.name);
			default: ;
		}
	return true;
}

bool comparisonCheck(ACMI og_acmi, AId og_id, list[AMI] mis){
	visit(mis)
		{
			case Asmi(AId id, ASMI smi): IdIsSame(id.name, og_id.name);
			case Acmi(AId id, ACMI cmi): CompareCMI(og_acmi, cmi, og_id, id) ;
			default: ;
		}
	return true;
}


bool CompareSMI(ASMI smi_1, ASMI smi_2, AId id_1, AId id_2){
		// If content is different but name is the same
		if(!ContentIsSame(smi_1, smi_2) && IdIsSame(id_1.name, id_2.name)){
			return true;
		}
		//If content is the same but id is different
		if(ContentIsSame(smi_1, smi_2) && IdIsSame(id_1.name, id_2.name)){
			return true;
		}
	return false;	
}

bool CompareCMI(ACMI cmi_1, ACMI cmi_2, AId id_1, AId id_2){
		// If content is different but name is the same
		if(!ContentIsSame(cmi_1, cmi_2) && IdIsSame(id_1.name, id_2.name)){
			return true;
		}
		//If content is the same but id is different
		if(ContentIsSame(cmi_1, cmi_2) && IdIsSame(id_1.name, id_2.name)){
			return true;
		}
	return false;	
}

//Returns true if two ACMI have the same elements
bool ContentIsSame(ACMI cmi_1, ACMI cmi_2){
	for(element_1 <- cmi_1.elements){
		matchElement1 = false;
			for(element_2 <- cmi_2.elements){
				if(element_1 == element_2){
					matchElement1 = true;
				}
			}
		if(matchElement1){
			return false;
		}
	}
	return true;
}
bool ContentIsSame(ASMI smi_1, ASMI smi_2){
	for(element_1 <- smi_1.elements){
		matchElement1 = false;
			for(element_2 <- smi_2.elements){
				if(element_1 == element_2){
					matchElement1 = true;
				}
			}
		if(matchElement1){
			return false;
		}
	}
	return true;
}



//bool UniqueNessCheck(str id_og_name, list[AMI] mis){
//	int count = 0;
//	visit(mis)
//		{
//			case Asmi(AId id, ASMI smi): count += checkLabels(id.name, id_og_name);
//			case Acmi(AId id, ACMI cmi): count += checkLabels(id.name, id_og_name);
//			default: ;
//		}
//	if(count == 1){
//		return false;
//	}
//	return true;
//}

bool IdIsSame(str id1, str id2){
	if(id1 == id2){
		return true;
	}
	return false;		
}

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
	return true;
}

str getRegion(ASMI smi){
	visit(smi.elements){
			case Aregion(str reg): return reg;
			default: ;
		}
	return "";
} 

str getRegion(ACMI cmi){
	visit(cmi.elements){
			case Aregion(str reg): return reg;
			default: ;
		}
	return "";
} 


 //Check MI’s labels must be unique.
//bool checkUniquenessMILabels(AProgram ast){
//	
//	return false;
//}

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
//bool sameMIDifferentLabel(AProgram ast){
//
//
//	return true; 
//}

//check The language supports Booleans, integers and string types.
// TODO to be fair idk of dit moet of niet
bool support(AProgram ast){


	return true;
}
