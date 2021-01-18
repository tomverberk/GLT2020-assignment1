module slco::Load

import slco::Parser;
import slco::AST;
import slco::Syntax;

import ParseTree;

public Program implode(Program p) = implode(#Program, p); 

public Program load(loc l) = implode(parserSLCO(l));