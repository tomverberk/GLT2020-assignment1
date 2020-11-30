module ccl::Syntax

/*
 * Define concrete syntax for CCL. The language's specification is available in the PDF (Section 3)
*/

start syntax Program = "resource" Resource;

// Dat er minimaal 1 resource is
syntax Resource 
= Id "{" MI* MIlastElement "}";

syntax MI
= "storage" Id "{" SMI "},"  
| "computing" Id "{" CMI "},"
| Id ",";

syntax MIlastElement 
= "storage" Id "{" SMI "}"  
| "computing" Id "{" CMI "}"
| Id;

// Minimaal 1 SMI element
syntax SMI 
= SMIelement* SMIlastElement;

syntax SMIelement 
= SMIlastElement ",";

syntax SMIlastElement
= "region: " Region 
| "engine: " Engine
| "CPU: " CPU "cores"
| "memory: " Memory "GB"
| "IPV6: " IPV6
| "storage:" Storage "GB";

// Minimaal 1 CMI element
syntax CMI = 
CMIelement* CMIlastElement;

syntax CMIelement 
= CMIlastElement ",";

syntax CMIlastElement
= "region: " Region
| "OS: " OS
| "IPV6: " IPV6
| "storage: " Storage
| "CPU: " CPU "cores"
| "memory: " Memory "GB";

syntax Region 
=  "California"
| "Cape Town"
| "Frankfurt"
| "Bogota"
| "Seoul";

syntax Engine 
=  "MySQL"
| "PostgreSQL"
| "MariaDB"
| "Oracle"
| "SQL Server";

syntax CPU =
Natural;

// TODO max 64
syntax Memory = 
Natural;

// TODO Boolean
syntax IPV6 =
"yes" 
| "no";

// TODO storage int ish
syntax Storage =
("BLS" | "SSD") "of" Natural;

syntax OS 
= "Linux"
| "Red Hat enterprises"
| "Ubuntu Server"
| "Windows Server 2019";

lexical Id = [A-Za-z0-9\-]+;

lexical Natural = [0-9]+ !>> [0-9];

layout Layout = WhitespaceAndComment* !>> [\ \t\n\r%];

lexical WhitespaceAndComment 
=[\ \t\n\r] 
| "%" ![%]+ "%"
| "%%" ![%]* $ ;

