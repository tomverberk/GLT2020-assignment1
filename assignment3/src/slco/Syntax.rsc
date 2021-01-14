module slco::Syntax

extend lang::std::Id;
extend lang::std::Layout;
/*
 * Define concrete syntax for SLCO. The language's specification is available in the PDF (Section 3)
 
 Op het moment heb ik deze veel te groot gemaakt, zodat we straks kunnen inkorten waar handig
*/

lexical String = [A-Za-z0-9_\-]+;
lexical Integer = [0] | [+\-]?[1-9][0-9]*;
lexical Boolean = "true" | "false";

// Start of the program, with the word resource
start syntax Program = "model" Model model;

// A model has an ID clasess objects and channels
syntax Model 
= Id modelId "{" 
"classes" Class+ classes 
"objects" Object+ objects
"channels" Channel+ channels
"}";

// A class has an ID ports and statemachines
syntax Class 
= Id classId "{" 
ports Id+ portIds
"state machines" StateMachine stateMachines
"}";

//Assumption we have at least one Variable
syntax StateMachine = Id stateMachineId "{" 
"variables" Variable+ variables 
States states 
"transitions" Transition+ transitions
"}";

syntax Variable = VariableType variableType Id variableId;
syntax VariableType = "Integer"|"String";

syntax States = "initial" Id stateId ("state" Id stateId)*;


//Okay het probleem is dat de volgorde van send en receive uitmaakt voor de code
// ------------------------ begin onzekerheden en kloten met de Transitions -----------------//
syntax Transition 
= Id transitionId "from" Id stateIdBegin "to" Id stateIdEnd "{" TransitionBody transitionBody "}";

syntax TransitionBody 
=SendInputAction sendInputAction ";" ReceiveResultAction receiveResultAction
| ReceiveInputAction receiveInputAction ";" SendResultAction sendResultAction
| WaitAction waitAction;

//Ik weet niet zeker of we dit op moeten delen maar het klinkt logisch
syntax SendInputAction = "send input(" InputVariable+ inputVariables ") to" Id portId;
syntax SendResultAction = "send result(" InputId+ inputIds ") to" Id portId;
syntax ReceiveInputAction = "receive input(" InputId+ inputIds ") to" Id portId;
syntax ReceiveResultAction = "receive result(" InputId+ inputIds ") to" Id portId;
syntax ReceiveAction = "receive" ("input"|"result")  ;
syntax WaitAction = "after" Integer "ms";

// ------------------------ einde onzekerheden en kloten met de Transitions -----------------//

syntax InputVariable = 
Input id "," !>> ")"
| Input id !>> ",";

//Dit is of een string of een integer of iets anders, wacht is er iets anders idk probably niet
syntax Input = Integer | String;

syntax InputId =
Id idVariableId "," !>> ")"
| Id idVariableId !>> ",";

//Object declaration
syntax Object = Id objectId ":" Id classId;

//channel declaration
syntax Channel = Id channelId "(" VariableType* variableTypes ") sync between" Id objectIdSource "." Id portIdSource "and" Id objectIdTarget "." portIdTarget;



