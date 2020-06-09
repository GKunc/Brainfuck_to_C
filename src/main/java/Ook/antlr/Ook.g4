grammar Ook;

file: expression*;

expression: operator | LPARENTHESES expression* RPARENTHESES;

operator: GREATER | LOWER | PLUS | MINUS | DOT | COMMA;

GREATER: 'Ook. Ook?';
LOWER: 'Ook? Ook.';
PLUS: 'Ook. Ook.';
MINUS: 'Ook! Ook!';
DOT: 'Ook! Ook.';
COMMA: 'Ook. Ook!';
LPARENTHESES: 'Ook! Ook?';
RPARENTHESES: 'Ook? Ook!';
WS: . -> skip;