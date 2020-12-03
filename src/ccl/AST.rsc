module ccl::AST

/*
 * Define Abstract Syntax for CCL
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 // Datatypes
data AType(loc src = |tmp:///|)
    = string() | integer() | boolean();
 
 data AProgram 
 = Aprogram(AResource resource);
 
 data AResource
 = Aresource(AId id, list[AMI] mis);
 
 data AMI 
 = Asmi(AId id, ASMI smi) 
 | Acmi(AId id, ACMI cmi)
 | Ami(AId id);
 
 data ASMI = Asmi(list[ASMIelement] elements);
 
 data ASMIelement 
 = ASregion(str reg) 
 | ASengine(str eng)
 | ASCPU(int cpu)
 | ASmemory(int size)
 | ASIPV6(str ipv6)
 | ASstorage(str kind, int size);

 
 data ACMI 
 = Acmi(list[ACMIelement] elements);
 
 data ACMIelement 
 = ACregion(str reg)
 | ACOS(str os)
 | ACIPV6(str ipv6)
 | ACstorage(str kind, int size)
 | ACCPU(int size)
 | ACmemory(int size);
 
 data AId
= Aid(str name);
 
