module slco::AST

/*
 * The Abstract syntax for SLCO
 * -- Almost has a one to one correspondence with slco::Syntax
 */

//Creating an Alias for ID
 public alias Id = str;

//Start with Program which has a model
 data Program(loc src = |tmp:///|)
 = Program(Model model);

// Initialize the Datatype SLCOId which has an Id (string) is value
 public data SLCOId =
 	id(Id name);

// Datatype Model
 data Model
 = Model(SLCOId modelId , list[Class] classes , list[Object] objects ,list[Channel] channels);

// Datatype Class
 data Class
 = Class(SLCOId classId, list[SLCOId] portIds, list[StateMachine] stateMachines);

// Datatype Statemachine
 data StateMachine
 = StateMachine(SLCOId stateMachineId, list[Variable] variables, 
 SLCOId initialState, list[SLCOId] states, list[Transition] transitions);

// Datatype Variable
 data Variable
 = Variable(Type tp, SLCOId variableId);

// Datatype Type, For Concrete Syntax only Integer and String are used, however static semantics use the others
 data Type
= Integer() | String() | State() | Port() | Class() | Model() | StateMachine() | Transition() | Channel() | Object() | Action();

// Datatype Transition
 data Transition
 = Transition(SLCOId transitionId, SLCOId stateIdBegin, SLCOId stateIdEnd, list[TransitionBody] transitionBodies);


 // Datatype TransitionBody, TODO Remove this as it is redundant (not that important)
 data TransitionBody
 = TransitionBody(TransitionLine transitionLine); 
 
 // Datatype TransitionLine, is either a sendaction, receiveaction, or waitAction
 data TransitionLine
 = TransitionLine(SendAction sendAction)
 | TransitionLine(ReceiveAction receiveAction)
 | TransitionLine(WaitAction waitAction);

// Datatype Sendaction
 data SendAction
 = SendAction(SLCOId actionId, Comb combinations, SLCOId portId );

// Datatype ReceiveAction
 data ReceiveAction
 = ReceiveAction(SLCOId actionId, Comb combinations, SLCOId portId );

// Datatype WaitAction
 data WaitAction
 = WaitAction(int number);
 
 //Datatype Comb, is either an int, id, or combination between 2 COMB's
 public data Comb
     = intCon(int iVal)
     | IdCon(SLCOId combId)
     | add(Comb left, Comb right)
     | sub(Comb left, Comb right)
     | comma(Comb left, Comb right);


// Datatype Object
 data Object =
 Object(SLCOId objectId, SLCOId classId);

//Datatype Channel
 data Channel =
 Channel(SLCOId channelId, Type tp, list[Type] types, SLCOId objectIdSource, SLCOId portIdSource, SLCOId objectIdTarget, SLCOId portIdTarget);


// Add location to the data types. For error chechking
anno loc Type@location;
anno loc Program@location;
anno loc Model@location;
anno loc Class@location;
anno loc StateMachine@location;
anno loc Variable@location;
anno loc Type@location;
anno loc Transition@location;
anno loc TransitionLine@location;
anno loc SendAction@location;
anno loc ReceiveAction@location;
anno loc WaitAction@location;
anno loc Comb@location;
anno loc Object@location;
anno loc Channel@location;
anno loc SLCOId@location;
