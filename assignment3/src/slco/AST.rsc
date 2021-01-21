module slco::AST

/*
 * Define bIdact Syntax for slco
 *
 * - make sure there is an almost one-to-one correspondence with the grammar (Syntax.rsc)
 */
 
 // Datatypes

 
 //data Type(loc src = |tmp:///|)
 //	= String() | integer() | boolean();
 	
 //public data TYPE = natural() | Iding(); 
 
 public alias Id = str;
 
 data Program
 = Program(Model model);
 


 
 data Model
 = Model(Id modelId , list[Class] classes , list[Object] objects
 ,list[Channel] channels
 );
 
 data Class 
 = Class(Id classId ,list[Id] portIds, list[StateMachine] stateMachines
 );
 
 data StateMachine
 = StateMachine(Id stateMachineId, list[Variable] variables, Id initialState, list[Id] states ,list[Transition] transitions
 );
// 
 data Variable
 = Variable(Type tp, Id variableId);
// 
 data Type
= Integer() | String();
 
 data Transition
 = Transition(Id transitionId, Id stateIdBegin, Id stateIdEnd, list[TransitionBody] transitionBodies
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
 = SendAction(Id actionId, Comb combinations, 
 Id portId );
 
 data ReceiveAction
 = ReceiveAction(Id actionId, Comb combinations, Id portId );
 
 //data Combination
 //= Combination(Operator operator, 
 //Parameter outputVariable);
 
 public data Comb
     = intCon(int iVal)
     | strCon(str string)
     | add(Comb left, Comb right)
     | sub(Comb left, Comb right)
     | comma(Comb left, Comb right)
     ;
 
 //
 data WaitAction
 = WaitAction(int number);
 
 data Parameter
 = Parameter(int integer)
 |  Parameter(Id parameterId);
 
// TODO geen idee hoe we dit moeten doen
 data Operator
 = Operator();
 
 //data Input 
 //= Integer() |
 //String();

 data Object = 
 Object(Id objectId, Id classId);
 
 data Channel = 
 Channel(Id channelId, Type tp, list[Type] types, 
 Id objectIdSource, Id portIdSource, 
 Id objectIdTarget, Id portIdTarget);
 


anno loc Type@location;                   
anno loc Program@location;
anno loc Model@location;
anno loc Class@location;
anno loc StateMachine@location;
//anno loc strCon@location;
//anno loc intCon@location;
anno loc Variable@location;     
anno loc Type@location;        
anno loc Transition@location;     
anno loc TransitionLine@location;     
anno loc SendAction@location;     
anno loc ReceiveAction@location;     
anno loc WaitAction@location;     
anno loc Parameter@location;     
anno loc Operator@location;     
anno loc Comb@location;     
anno loc Object@location;     
anno loc Channel@location;       
