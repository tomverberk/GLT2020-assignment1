module slco::Syntax

lexical Natural = [0-9]+ !>> [0-9];

extend lang::std::Id;
extend lang::std::Layout;
/*
 * Define concrete syntax for SLCO. The language's specification is available in the PDF (Section 3)
 
 Op het moment heb ik deze veel te groot gemaakt, zodat we straks kunnen inkorten waar handig
*/

lexical String = [A-Za-z0-9_\-]+;
lexical Integer = Integer: [0] | [+\-]?[1-9][0-9]*;
//lexical Boolean = "true" | "false";
//
//// Start of the program, with the word resource
start syntax Program =  Program: "model" Model model;


// A model has an ID clasess objects and channels
syntax Model = Model: 
String modelId "{" "classes" Class* classes 
"objects" Object* objects
"channels" Channel* channels
"}";

// A class has an ID ports and statemachines
syntax Class = Class:
String classId "{" 
"ports" (String ",")* portIds
"state machines" StateMachine* stateMachines
"}";

//Assumption we have at least one Variable
syntax StateMachine = StateMachine :
Id stateMachineId "{" 
"variables" Variable* variables 
"initial" String initialState ("state" String)* states 
"transitions" Transition* transitions 
"}";
//
syntax Variable = Variable: String variableType ":" String variableId;
////
syntax VariableType = VariableType: 
String id;

//// Transitions
syntax Transition  = Transition:
String transitionId "from" String stateIdBegin "to" String stateIdEnd "{" TransitionBody* transitionBodies 
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
= SendAction: String actionId 
"(" Parameter outputVariable Combination* combinations 
") to" String portId;

syntax ReceiveAction 
= ReceiveAction: String actionId "(" Parameter inputVariable Combination* combinations ") from" String portId;
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
| Parameter: String parameterId ;

syntax Operator
= Operator: "+" 
| Operator: "-" 
| Operator: ",";

//Dit is of een string of een integer of iets anders, wacht is er iets anders idk probably niet
//syntax Input = Integer | String;

//Object declaration
syntax Object = Object :
String objectId ":" String classId;
//
//channel declaration
syntax Channel = Channel:
String channelId "(" VariableType variableTypes ("," VariableType)* variableTypes ")" "sync" "between" String objectIdSource "." String portIdSource "and" String objectIdTarget "." String portIdTarget;



