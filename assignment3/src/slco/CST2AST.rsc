module slco::CST2AST

import slco::AST;
import slco::Syntax;
import String;

/*
 * -Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * - Hint: Use switch to do case distinction with concrete patterns 
 * - Map regular CST arguments (e.g., *, +, ?) to lists 
 * - Map lexical nodes to Rascal primitive types (bool, int, str)
 */

 // This file maps the concrete syntax tree to the abstract syntax tree, by linking all types to each other.
 
