module slco::Syntax

import Prelude;


extend lang::std::Id;
extend lang::std::Layout;

/*
 * The concrete syntax for SLCO
*/

//Identifying some lexicals
lexical Natural = [0-9]+ !>> [0-9];
lexical String = [A-Za-z0-9_\-]+;
lexical Integer = Integer: [0] | [+\-]?[1-9][0-9]*;
//
// Start of the program, with the word resource
start syntax Program =  Program: "model" Model model;

//Syntax of an SLCOId
syntax SLCOId = 
id: Id name;


// A model has an ID clasess objects and channels
syntax Model = Model: 
SLCOId modelId "{" "classes" Class* classes 
"objects" Object* objects
"channels" Channel* channels
"}";

// A class has an ID ports and statemachines
syntax Class = Class:
SLCOId classId "{" 
"ports" SLCOId* portIds
"state machines" StateMachine* stateMachines
"}";

//Assumption we have at least one Variable
syntax StateMachine = StateMachine :
SLCOId stateMachineId "{" 
"variables" Variable* variables 
"initial" SLCOId initialState ("state" SLCOId)* states 
"transitions" Transition* transitions 
"}";
//
syntax Variable = Variable: Type type SLCOId variableId;
////
syntax Type =  
Integer: "Integer" | 
String: "String";

//// Transitions
syntax Transition  = Transition:
SLCOId transitionId "from" SLCOId stateIdBegin "to" SLCOId stateIdEnd "{" TransitionBody* transitionBodies 
"}";

//
syntax TransitionBody
= TransitionBody: TransitionLine transitionLine ";" !>> "}"
| TransitionBody: TransitionLine transitionLine !>> ";";

syntax TransitionLine
= TransitionLine: "send" SendAction sendAction
| TransitionLine: "receive" ReceiveAction receiveAction
| TransitionLine: "after" WaitAction waitAction;
//
// Transition actions
syntax SendAction 
= SendAction: SLCOId actionId 
"(" Combination combination 
") to" SLCOId portId;

syntax ReceiveAction 
= ReceiveAction: SLCOId actionId "(" Combination combination ") from" SLCOId portId;
//

syntax Combination 
   = intCon: Integer iVal
   | IdCon: SLCOId combId
   | bracket "(" Combination e ")"
   > left comma: Combination lhs "," Combination rhs
   > left ( add: Combination lhs "+" Combination rhs
          | sub: Combination lhs "-" Combination rhs
          )
  ;
//

//Waarom staat dit hier allemaal bij
syntax WaitAction
= WaitAction: Integer number "ms"; // !>> ";"
//| Integer "ms" ";" !>> "}";

syntax Operator
= Operator: "+" 
| Operator: "-" 
| Operator: ",";

//Object declaration
syntax Object = Object :
SLCOId objectId ":" SLCOId classId;
//
//channel declaration
syntax Channel = Channel:
SLCOId channelId "(" Type type ("," Type)* types ")" "sync" "between" SLCOId objectIdSource "." SLCOId portIdSource "and" SLCOId objectIdTarget "." SLCOId portIdTarget;



