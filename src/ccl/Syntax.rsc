module ccl::Syntax

extend lang::std::Id;
extend lang::std::Layout;
/*
 * Define concrete syntax for CCL. The language's specification is available in the PDF (Section 3)
*/

lexical String = [A-Za-z0-9\-]+;
lexical Integer = [0] | [+\-]?[1-9][0-9]*;
lexical Boolean = "true" | "false";

// Start of the program, with the word resource
start syntax Program = "resource" Resource resource;

// Basic layout of the resource, an id and 0 or more MIs.
syntax Resource 
= Id id "{" MI* mis "}";

// An MI, can either be the last, then it is not followed by a comma, else it is followed by a comma
syntax MI
= MIlastElement milast "," !>> "}"
| MIlastElement milast !>> ",";

// Defining the different MI's, either storage, computing, or the id of another mi
syntax MIlastElement 
= "storage" Id id "{" SMI smi "}"
| "computing" Id id "{" CMI smi "}"
| Id;

// All storage MI elements have a comma behind them, except for the last one
syntax SMIelement 
= SMIlastElement element "," !>> "}"
| SMIlastElement element !>> ",";

// There are 0 or more MI elements in a storage MI
syntax SMI 
= SMIelement* smiElements;

// The possible storage MI elements
syntax SMIlastElement
= "region"":" Region reg
| "engine"":" Engine eng
| "CPU"":" CPU "cores" cpu
| "memory"":" Memory "GB" mem
| "IPV6"":" IPV6 ipv6
| "storage"":" Storage "GB" sto;

// There are 0 or more MI elements in a computing MI
syntax CMI 
= CMIelement* cmiElements;

// All computing MI elements have a comma behind them, except for the last one
syntax CMIelement 
= CMIlastElement element "," !>> "}"
| CMIlastElement element !>> ",";

// The possible computing MI elements
syntax CMIlastElement
= "region"":" Region reg
| "OS"":" OS os
| "IPV6"":" IPV6 ipv6
| "storage"":" Storage "GB" sto
| "CPU"":" CPU "cores" cpu
| "memory"":" Memory "GB" mem;

// Region is a string
syntax Region 
= String;

// Engine is a string
syntax Engine 
= String;

// CPU is an integer
syntax CPU =
Integer;

// Memory is an integer
syntax Memory = 
Integer;

// IPV6 is a string (yes or no)
syntax IPV6 
= String;

// Storage has two values, a string (bls or ssd) and the integer of the amount of storage
syntax Storage 
= ("BLS" | "SSD") val1 "of" Integer val2;

// OS is a string
syntax OS 
= String;