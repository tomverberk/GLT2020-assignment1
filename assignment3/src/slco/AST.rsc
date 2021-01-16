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
 = AstateMachine(AId aStateMachineId, list[AId] aVariableIds, AId aInitialState, list[AId] aStateIds, list[ATransition] aTransitions);
 
 data AVariable
 = Avariable(AVariableType aVariableType, AId aVariableId);
 
 data AVariableType
 = string() 
 | integer();
 
 data AState
 = Astate(AId aStateId);
 
 data ATransition
 = Atransition(AId aTransitionId, AId aStateIdBegin, AId aStateIdEnd, list[ATransitionBody] aTransitionBodies);
 
 //TODO DIT IS MOEILIJK
 data ATransitionBody
 = AtransitionBody(ATransitionLine aTransitionLine); 
 
 data ATransitionLine
 = AtranstionLine(ASendAction aSendAction)
 | AtranstionLine(AReceiveAction aReceiveAction)
 | AtranstionLine(AWaitAction aWaitAction);
 
 data ASendAction 
 = AsendAction(AId aSendActionId, AParameter aParameter, list[ACombination aCombination], AId aPortId );
 
 data AReceiveAction
 = AreceiveAction(AId aSendActionId, AParameter aParameter, list[ACombination aCombination], AId aPortId );
 
 data ACombination
 = Acombination(AOperator aOperator, AParameter aParameter);
 
 data AWaitAction
 = integer();
 
 data AParameter
 = Aparameter(AId aParameterId)
 | integer(); 
 
 
// TODO geen idee hoe we dit moeten doen
 data AOperator
 = aOperator();
 
 data AObject = 
 Aobject(AId aObjectId, AId aClassId);
 
 data AChannel = 
 Achannel(AId aChannelId, AVariableType aVriableType, list[AVariableType] aVariableTypes, 
 AId aObjectIdSource, AId aPortIdSource, 
 AId aObjectIdTarget, AId aPortIdTarget);
 
 data AId
= Aid(str name);
