grammar RichRail;

command 	: newcommand | addcommand | getcommand | delcommand | remcommand;

newcommand 	: newtraincommand | newwagoncommand;
newtraincommand : 'new' 'locomotive' ID;
newwagoncommand	: 'new' 'wagon' ID ('numseats' NUMBER)?;
addcommand 	: 'add' ID 'to' ID;
getcommand 	: 'getnumseats' type ID;
delcommand 	: 'delete' type ID;
remcommand	: 'remove' ID 'from' ID;

type		: ('locomotive') | ('wagon');

ID		: ('a'..'z')('a'..'z'|'0'..'9')*;
NUMBER		: ('0'..'9')+;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+;