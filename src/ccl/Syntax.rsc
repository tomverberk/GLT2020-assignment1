module ccl::Syntax

import Integer;

/*
 * Define concrete syntax for CCL. The language's specification is available in the PDF (Section 3)
*/

start syntax Program = "resource" Resource*;


syntax Resource = 
"Resource" Id "{" MI* "my_server }";

syntax MI 
= "storage" Id "{" SMI "}"  
| "computing" Id "{" CMI "}";

syntax SMI =
"region:" Region ","
"engine:" Engine ","
"CPU:" CPU "cores" ","
"memory:" Memory "GB" ","
"IPV6:" IPV6 ","
"Storage:" Storage "GB";

syntax CMI = 
"region:" Region ","
"OS:" OS ","
"IPV6:" IPV6 ","
"Storage:" Storage "GB" ","
"CPU:" CPU "cores";

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
Integer;

// TODO max 64
syntax Memory = 
[0-64];

// TODO Boolean
syntax IPV6 =
"yes" 
| "no";

// TODO storage int ish
syntax Storage =
("BLS " | "SSD ") "of" 
[25-1000];

syntax OS 
= "Linux"
| "Red Hat enterprises"
| "Ubuntu Server"
| "Windows Server 2019";

lexical Id = [A-Za-Z][A-Za-z0-9\-]*;

