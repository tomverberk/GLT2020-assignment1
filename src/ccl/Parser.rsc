module ccl::Parser


import ccl::Syntax;
import ParseTree;


 /*
 * Define the parser for the CCL language. The name of the function must be parseCCL. 
 * This function receives as parameter the path of the file to parse represented as a loc, and returns a parse tree that represents the parsed program.
 */
 
 public Program parserccl(loc l) = parse(#Program, l);