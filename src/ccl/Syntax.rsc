module ccl::Syntax

extend lang::std::Id;
extend lang::std::Layout;
/*
 * Define concrete syntax for CCL. The language's specification is available in the PDF (Section 3)
*/

lexical String = [A-Za-z0-9\-]+;
lexical Integer = [0] | [+\-]?[1-9][0-9]*;
lexical Boolean = "true" | "false";

//layout Layout = WhitespaceAndComment* !>> [\ \t\n\r%];
//
//lexical WhitespaceAndComment 
//=[\ \t\n\r] 
//| "%" ![%]+ "%"
//| "%%" ![%]* $ ;

start syntax Program = "resource" Resource resource;

syntax Resource 
= Id id "{" MI* mis "}";

syntax MI
= MIlastElement milast "," !>> "}"
| MIlastElement milast !>> ",";

syntax MIlastElement 
= "storage" Id "{" SMI "}"
| "computing" Id "{" CMI "}"
| Id;

syntax SMIelement 
= SMIlastElement element "," !>> "}"
| SMIlastElement element !>> ",";

syntax SMI 
= SMIelement* smiElements;

syntax SMIlastElement
= "region"":" Region reg
| "engine"":" Engine eng
| "CPU"":" CPU "cores" cpu
| "memory"":" Memory "GB" mem
| "IPV6"":" IPV6 ipv6
| "storage"":" Storage "GB" sto;

syntax CMI 
= CMIelement* cmiElements;

syntax CMIelement 
= CMIlastElement element "," !>> "}"
| CMIlastElement element !>> ",";

syntax CMIlastElement
= "region"":" Region reg
| "OS"":" OS os
| "IPV6"":" IPV6 ipv6
| "storage"":" Storage "GB" sto
| "CPU"":" CPU "cores" cpu
| "memory"":" Memory "GB" mem;

syntax Region 
= String;

syntax Engine 
= String;

syntax CPU =
Integer;

// TODO max 64
syntax Memory = 
Integer;

// TODO Boolean
syntax IPV6 
= String;

// TODO storage int ish
syntax Storage 
= ("BLS" | "SSD") val1 "of" Integer val2;

syntax OS 
= String;

syntax Type = "string" | "integer" | "boolean";  