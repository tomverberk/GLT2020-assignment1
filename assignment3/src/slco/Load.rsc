module slco::Load

import slco::Parser;
import slco::AST;
import slco::Syntax;

import ParseTree;

public AProgram implode(Program p) = implode(#AProgram, p); 

public AProgram load(loc l) = implode(parserSLCO(l));