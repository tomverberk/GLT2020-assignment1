module ccl::Test

import ccl::AST;
import ccl::Check;
import ccl::CST2AST;
import ccl::Parser;
import ccl::Plugin;
import ccl::Syntax;
import util::IDE;
import ParseTree;

//Method that checks for all test files if it gives the expected outcome. If it does not return the expected outcome it will set the boolean mistake to true
// which will indicate that there is a mistake somewhere in a file. At the end the value of AFileHasMistake is negated,
// such that the value will return true if everything is correct and false if there is a mistake.

//When executing wellformedness the ccl files are also parsed, thus we have checked the correct parsing of all files
bool CheckAllProgramReturnExpectedWellformedness(){
	bool aFileHasMistakes = false;
	
		main();
		// The first file we check all possible values for the elements of MI, this file should not have any errors, so returns true
		aFileHasMistakes = aFileHasMistakes || !checkWellformedness(|project://glt2020-ccl/src/allPossibleValuesCheck.ccl|);
		
		// The third file is a correct ccl program, where twice exact the same MI is placed in the resource and the ID's are the same. This is also correct.
		aFileHasMistakes = aFileHasMistakes || !checkWellformedness(|project://glt2020-ccl/src/CorrectCCLprogram.ccl|);
		
		// Ez is just a random easy program we wrote which is correct
		aFileHasMistakes = aFileHasMistakes || !checkWellformedness(|project://glt2020-ccl/src/correctProgrambutDouble.ccl|);
		
		// Id does not exist is not a correct program. It has an MI, without elements, but the ID of this MI does not exist with the previous MI's so it cannot duplicate the elements of another MI, which is not allowed
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/idDoesNotExists.ccl|);
		
		// This file has an engine which is not existing. So the file is not correct
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectDBengine.ccl|);
		
		// DuplicateMIs is a file where we have two mis with the same elements, but different labels ,which is not allowed.
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectDuplicateMIs.ccl|);
		
		// IncorrectLables has two different MIs but with the same labels, which is not allowed.
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectLables.ccl|);
		
		// IncorrectMemory has a memorysize , which is above the allowed memory size
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectMemory.ccl|);
		
		// IncorectMIareas has two MI's, but in different areas, whih is not allowed
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectMIareas.ccl|);
		
		// IncorrectRegion has a MI, which is located in a non existing region. 
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectRegion.ccl|);
		
		// IncorrectStorage has a negative amount of storage space, which is not allowed
		aFileHasMistakes = aFileHasMistakes || checkWellformedness(|project://glt2020-ccl/src/incorrectStorage.ccl|);
	return !aFileHasMistakes;
}
		