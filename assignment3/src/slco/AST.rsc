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

 data Program(loc src = |tmp:///|)
 = Program(Model model);

 public data SLCOId =
 	id(Id name);

 data Model
 = Model(SLCOId modelId , list[Class] classes , list[Object] objects
 ,list[Channel] channels
 );

 data Class
 = Class(SLCOId classId, list[SLCOId] portIds, list[StateMachine] stateMachines
 );

 data StateMachine
 = StateMachine(SLCOId stateMachineId, list[Variable] variables, SLCOId initialState, list[SLCOId] states ,list[Transition] transitions
 );
//
 data Variable
 = Variable(Type tp, SLCOId variableId);
//
 data Type
= Integer() | String();

 data Transition
 = Transition(SLCOId transitionId, SLCOId stateIdBegin, SLCOId stateIdEnd, list[TransitionBody] transitionBodies
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
 = SendAction(SLCOId actionId, Comb combinations, SLCOId portId );

 data ReceiveAction
 = ReceiveAction(SLCOId actionId, Comb combinations, SLCOId portId );

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
 |  Parameter(SLCOId parameterId);

// TODO geen idee hoe we dit moeten doen
 data Operator
 = Operator();

 //data Input
 //= Integer() |
 //String();

 data Object =
 Object(SLCOId objectId, SLCOId classId);

 data Channel =
 Channel(SLCOId channelId, Type tp, list[Type] types,
 SLCOId objectIdSource, SLCOId portIdSource,
 SLCOId objectIdTarget, SLCOId portIdTarget);



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
