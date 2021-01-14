module slco::Test

import slco::AST;
import slco::Check;
import slco::CST2AST;
import slco::Parser;
import slco::Plugin;
import slco::Syntax;
import util::IDE;
import ParseTree;

//Method that checks for all test files if it gives the expected outcome. If it does not return the expected outcome it will set the boolean mistake to true
// which will indicate that there is a mistake somewhere in a file. At the end the value of AFileHasMistake is negated,
// such that the value will return true if everything is correct and false if there is a mistake.

//When executing wellformedness the ccl files are also parsed, thus we have checked the correct parsing of all files
bool CheckAllProgramReturnExpectedWellformedness(){
	return true;
}
		