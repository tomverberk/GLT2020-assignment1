module slco::AST

/*
 * Define bstract Syntax for slco
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 // Datatypes

 
 //data Type(loc src = |tmp:///|)
 //	= string() | integer() | boolean();
 	
 data Program
 = Program(Model model);
 


 
 data Model
 = Model(str modelId , list[Class] classes , list[Object] objects
 ,list[Channel] channels
 );
 
 data Class 
 = Class(str classId ,list[str] portIds, list[StateMachine] stateMachines
 );
 
 data StateMachine
 = StateMachine(str stateMachineId, list[Variable] variables, str initialState, list[str] states ,list[Transition] transitions
 );
// 
 data Variable
 = Variable(str variableType, str variableId);
// 
 data VariableType
= VariableType(str id);
 
 data Transition
 = Transition(str transitionId, str stateIdBegin, str stateIdEnd, list[TransitionBody] transitionBodies
 );
 
 
 //TODO DIT IS MOEILIJK
 data TransitionBody
 = TransitionBody(TransitionLine transitionLine); //misschien vind ie dit niet leuk
 //
 data TransitionLine
 = TransitionLine(SendAction sendAction)
 | TransitionLine(ReceiveAction receiveAction)
 | TransitionLine(WaitAction waitAction);
 //
 data SendAction 
 = SendAction(str actionId, Parameter outputVariable, list[Combination] combinations, 
 str portId );
 
 data ReceiveAction
 = ReceiveAction(str actionId, Parameter inputVariable, list[Combination] combinations, str portId );
 
 data Combination
 = Combination(Operator operator, 
 Parameter outputVariable);
 //
 data WaitAction
 = WaitAction(int number);
 
 data Parameter
 = Parameter(int integer)
 |  Parameter(str parameterId);
 
// TODO geen idee hoe we dit moeten doen
 data Operator
 = Operator();
 
 //data Input 
 //= Integer() |
 //String();

 data Object = 
 Object(str objectId, str classId);
 
 data Channel = 
 Channel(str channelId, VariableType variableType, list[VariableType] variableTypes, 
 str objectIdSource, str portIdSource, 
 str objectIdTarget, str portIdTarget);
 
 //  data Id
//= Id(str name);
 


//anno loc Type@location;                   
//anno loc Program@location;
//anno loc Model@location;
//anno loc Class@location;
//anno loc StateMachine@location;
//anno loc Variable@location;     
//anno loc VariableType@location;        
//anno loc Transition@location;     
//anno loc TransitionLine@location;     
//anno loc SendAction@location;     
//anno loc ReceiveAction@location;     
//anno loc WaitAction@location;     
//anno loc Parameter@location;     
////anno loc Operator@location;     
////anno loc Input@location;     
//anno loc Object@location;     
//anno loc Channel@location;       
