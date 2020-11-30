module ccl::AST

/*
 * Define Abstract Syntax for CCL
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 public alias resourceId = str;
 public alias miId = str;
 
 data Program = program(RESOURCE);
 
 data RESOURCE = resource(resourceId id, list[MI] mis);
 data MI 
 = mi(miId id, SMI smi) 
 | mi(miId id, CMI cmi);
 
 data SMI = smi(list[SMIelement]);
 
 data SMIelement 
 = region(str Reg)
 |engine(str Eng)
 | CPU(int iVal)
 |memory(int iVal)
 |IPV6(bool IBool)
 | storage(int iVal);
 
 data CMI = cmi(list[CMIelement]);
 
 data CMIelement 
 = region(str sVal)
 | OS(str sVal)
 |IPV6(bool IBool)
 |storage(int iVal)
 |CPU(int iVal)
 |memory(int iVal);
 
