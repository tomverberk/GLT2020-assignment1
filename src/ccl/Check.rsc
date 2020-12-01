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
bool checkUniquenessMILabels(AProgram ast){

	return true;
}

// Check The storage size must be greater than zero but less than or equal to 1000 GB.
bool storageSizeMax(AProgram ast){

	return true;
}

// Check The maximum memory size is 64 GB.
bool memorySizeMax(AProgram ast){

	return true;
}

//check MI region must be valid. In other words, the MI’s region have to be one of the locations
//mentioned in Section 3.1.
//  "California"
// "Cape Town"
// "Frankfurt"
// "Bogota"
// "Seoul";
bool MIRegionInCorrect(AProgram ast){

	return true;
}

//check DB engine must be valid. In other words, the name of the DB engine have to be one of
//the engines mentioned in Section 3.1.

// "MySQL"
// "PostgreSQL"
// "MariaDB"
// "Oracle"
// "SQL Server";
bool DBEngineInValid(AProgram ast){

	return true;
}

// check All MIs in a resource element must be dened in the same region.
bool MIInResourceInSameRegion(AProgram ast){

	return true;
}

//Check OS resourceValid In other words the name of the 
//OS has to be one of the OS mentioned in section 3.1
// "Linux"
// "Red Hat enterprises"
// "Ubuntu Server"
// "Windows Server 2019"

bool OSResourceInCorrect(AProgram ast){

	return true;
}


// check Do not accept duplicate MIs with the exact same conguration and dierent labels.
bool sameMIDifferentLabel(AProgram ast){


	return true; 
}

//check The language supports Booleans, integers and string types.
bool support(AProgram ast){


	return true;
}
