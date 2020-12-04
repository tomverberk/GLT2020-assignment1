module ccl::AST

/*
 * Define Abstract Syntax for CCL
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 // Datatypes
data AType(loc src = |tmp:///|)
    = string() | integer() | boolean();
 
 // The program has one resource
 data AProgram 
 = Aprogram(AResource resource);
 
 // A resource does have one id and multiple MIs, we list these mis.
 data AResource
 = Aresource(AId id, list[AMI] mis);
 
 // A MI is either a storage Mi, computing MI, or an ID
 data AMI 
 = Asmi(AId id, ASMI smi) 
 | Acmi(AId id, ACMI cmi)
 | Ami(AId id);
 
 // A storage MI has a list of elements
 data ASMI = Asmi(list[ASMIelement] elements);
 
 // The elements of a storage MI
 data ASMIelement 
 = ASregion(str reg) 
 | ASengine(str eng)
 | ASCPU(int cpu)
 | ASmemory(int size)
 | ASIPV6(str ipv6)
 | ASstorage(str kind, int size);

  // A computing MI has a list of elements
 data ACMI 
 = Acmi(list[ACMIelement] elements);
 
  // The elements of a computing MI
 data ACMIelement 
 = ACregion(str reg)
 | ACOS(str os)
 | ACIPV6(str ipv6)
 | ACstorage(str kind, int size)
 | ACCPU(int size)
 | ACmemory(int size);
 
 // All MI's and resources have an ID. THis is the abstract data type for the ID
 data AId
= Aid(str name);
 
