module slco::AST

/*
 * Define Abstract Syntax for slco
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 // Datatypes

 data AType(loc src = |tmp:///|)
 	= string() | integer() | boolean();
 	
 data aProgram
 = Aprogram (AModel aModel);
 
 data AModel
 = Amodel(AId aModelId, list[AClass] aClasses, list[AObject] aObjects, list[AChannel] aChannels);
 
 data AClass 
 = Aclass(AId aClassId, list[AId] aPortIds, list[AStateMachine] aStateMachines);
 
 data AStateMachine
 = AstateMachine(AId aStateMachineId, list[AId] aStateIds, list[ATransition] aTransitions);
 
 data AVariable
 = Avariable(AVariableType aVariableType, AId aVariableId);
 
 data AVariableType
 = string() | integer();
 
 
 data ATransition
 = Atransition(AId aTransitionId, AId aStateIdBegin, AId aStateIdEnd, list[ATransitionBody] aTransitionBodies);
 
 //TODO DIT IS MOEILIJK
 data ATransitionBody
 = AtransitionBody(AId aTransitionBodyId); 
 
 data AObject = 
 Aobject(AId aObjectId, AId aClassId);
 
 data AChannel = 
 Achannel(AId aChannelId, list[AVariableType] aVariableTypes, 
 AId aObjectIdSource, AId aPortIdSource, 
 AId aObjectIdTarget, AId aPortIdTarget);
 
 
 data AId
= Aid(str name);
