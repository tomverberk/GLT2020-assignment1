module ccl::AST

/*
 * Define Abstract Syntax for CCL
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 public alias AresourceId = str;
 public alias AmiId = str;
 
 data AProgram 
 = Aprogram(ARESOURCE resource);
 
 data ARESOURCE 
 = Aresource(AresourceId id, list[AMI] mis);
 
 data AMI 
 = Ami(AmiId id, ASMI smi) 
 | Ami(AmiId id, ACMI cmi);
 
 data ASMI = Asmi(list[ASMIelement]);
 
 data ASMIelement 
 = Aregion(str reg)
 | Aengine(str eng)
 | ACPU(int iVal)
 | Amemory(int iVal)
 | AIPV6(bool ipv6)
 | Astorage(int iVal);
 
 data ACMI 
 = Acmi(list[ACMIelement]);
 
 data ACMIelement 
 = Aregion(str sVal)
 | AOS(str sVal)
 | AIPV6(bool ipv6)
 | Astorage(int iVal)
 | ACPU(int iVal)
 | Amemory(int iVal);
 
