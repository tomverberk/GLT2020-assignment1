module ccl::AST

/*
 * Define Abstract Syntax for CCL
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 public alias AresourceId = str;
 public alias AmiId = str;
 
 // Datatypes
data AType(loc src = |tmp:///|)
    = string() | integer() | boolean();
 
 data AProgram 
 = Aprogram(AResource resource);
 
 data AResource
 = Aresource(AresourceId id, list[AMI] mis);
 
 data AMI 
 = Ami(AId id, ASMI smi) 
 | Ami(AId id, ACMI cmi)
 | Ami(AId id);
 
 data ASMI = Asmi(list[ASMIelement]);
 
 data ASMIelement 
 = Aregion(str reg)
 | Aengine(str eng)
 | ACPU(int iVal)
 | Amemory(int iVal)
 | AIPV6(str ipv6)
 | Astorage(int iVal);

//data Aregion
//= Aregion(str reg);
 
 data ACMI 
 = Acmi(list[ACMIelement]);
 
 data ACMIelement 
 = Aregion(str sVal)
 | AOS(str sVal)
 | AIPV6(str ipv6)
 | Astorage(int iVal)
 | ACPU(int iVal)
 | Amemory(int iVal);
 
 data AId
= Aid(str name);
 
