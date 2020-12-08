module ccl::Parser


import ccl::Syntax;
import ParseTree;


 /*
 * Define the parser for the CCL language. The name of the function must be parseCCL. 
 * This function receives as parameter the path of the file to parse represented as a loc, and returns a parse tree that represents the parsed program.
 */
 
 // The function parserCCL requires a location, then it will parse the file it got and checks it with the syntax at the start location #Program.
 public Program parserCCL(loc l) = parse(#Program, l);