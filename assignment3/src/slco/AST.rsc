module slco::AST

/*
 * Define bstract Syntax for slco
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 // Datatypes

 
 data AType(loc src = |tmp:///|)
 	= string() | integer() | boolean();
 	
 data Program
 = Program (Model model);
 
 data Model
 = Model(Id modelId, list[Class] classes, list[Object] objects, list[Channel] channels);
 
 data Class 
 = Class(Id classId, list[Id] portIds, list[StateMachine] stateMachines);
 
 data StateMachine
 = StateMachine(Id stateMachineId, list[Variable] variables, Id initialState, list[Id] states, list[Transition] transitions);
 
 data Variable
 = Variable(VariableType variableType, Id variableId);
 
 data VariableType
 = string() 
 | integer();
 
 data State
 = State(Id stateId);
 
 data Transition
 = Transition(Id transitionId, Id stateIdBegin, Id stateIdEnd, list[TransitionBody] transitionBodies);
 
 //TODO DIT IS MOEILIJK
 data TransitionBody
 = TransitionBody(TransitionLine transitionLine); 
 
 data TransitionLine
 = TranstionLine(SendAction sendAction)
 | TranstionLine(ReceiveAction receiveAction)
 | TranstionLine(WaitAction waitAction);
 
 data SendAction 
 = SendAction(Id actionId, Parameter outputVariable, list[Combination] combinations, Id portId );
 
 data ReceiveAction
 = ReceiveAction(Id actionId, Parameter inputVariable, list[Combination] combinations, Id portId );
 
 data Combination
 = Combination(Operator operator, Parameter outputVariable);
 
 data WaitAction
 = integer();
 
 data Parameter
 = Parameter(Id parameterId)
 | integer(); 
 
// TODO geen idee hoe we dit moeten doen
 data Operator
 = Operator();

 data Object = 
 Object(Id objectId, Id classId);
 
 data Channel = 
 Channel(Id channelId, VariableType variableType, list[VariableType] variableTypes, 
 Id objectIdSource, Id portIdSource, 
 Id objectIdTarget, Id portIdTarget);
 
 data Id
= id(str name);
