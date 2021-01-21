module slco::Load

import slco::Parser;
import slco::AST;
import slco::Syntax;

import ParseTree;

public slco::AST::Program implode(slco::Syntax::Program p) = implode(#slco::AST::Program, p);

public slco::AST::Program load(loc l) = implode(parserSLCO(l));
