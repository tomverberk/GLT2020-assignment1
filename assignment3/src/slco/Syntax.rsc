module slco::Syntax

import Prelude;


extend lang::std::Id;
extend lang::std::Layout;

/*
 * Define concrete syntax for SLCO. The language's specification is available in the PDF (Section 3)
 
 Op het moment heb ik deze veel te groot gemaakt, zodat we straks kunnen inkorten waar handig
*/

lexical Natural = [0-9]+ !>> [0-9];
lexical Id = Id: ([a-z0-9] !<< [a-z][a-z0-9]* !>> [a-z0-9]);
lexical String = [A-Za-z0-9_\-]+;
lexical Integer = Integer: [0] | [+\-]?[1-9][0-9]*;
//lexical Boolean = "true" | "false";
//
//// Start of the program, with the word resource
start syntax Program =  Program: "model" Model model;


// A model has an ID clasess objects and channels
syntax Model = Model: 
Id modelId "{" "classes" Class* classes 
"objects" Object* objects
"channels" Channel* channels
"}";

// A class has an ID ports and statemachines
syntax Class = Class:
Id classId "{" 
"ports" (String ",")* portIds
"state machines" StateMachine* stateMachines
"}";

//Assumption we have at least one Variable
syntax StateMachine = StateMachine :
Id stateMachineId "{" 
"variables" Variable* variables 
"initial" Id initialState ("state" Id)* states 
"transitions" Transition* transitions 
"}";
//
syntax Variable = Variable: Id variableType ":" Id variableId;
////
syntax VariableType = VariableType: 
Id id;

//// Transitions
syntax Transition  = Transition:
Id transitionId "from" Id stateIdBegin "to" Id stateIdEnd "{" TransitionBody* transitionBodies 
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
= SendAction: Id actionId 
"(" Parameter outputVariable Combination* combinations 
") to" Id portId;

syntax ReceiveAction 
= ReceiveAction: Id actionId "(" Parameter inputVariable Combination* combinations ") from" Id portId;
//
syntax Combination 
= Combination: Operator operator Parameter outputVariable;
//

//Waarom staat dit hier allemaal bij
syntax WaitAction
= WaitAction: Integer number "ms"; // !>> ";"
//| Integer "ms" ";" !>> "}";

// Passed parameters
syntax Parameter 
= Parameter: Integer integer 
| Parameter: Id parameterId ;

syntax Operator
= Operator: "+" 
| Operator: "-" 
| Operator: ",";

//Dit is of een string of een integer of iets anders, wacht is er iets anders idk probably niet
//syntax Input = Integer | Id;

//Object declaration
syntax Object = Object :
Id objectId ":" Id classId;
//
//channel declaration
syntax Channel = Channel:
Id channelId "(" VariableType variableTypes ("," VariableType)* variableTypes ")" "sync" "between" Id objectIdSource "." Id portIdSource "and" Id objectIdTarget "." Id portIdTarget;



