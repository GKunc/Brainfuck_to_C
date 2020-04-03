grammar brainfock;

file: expression*;

expression: operator | LPARENTHESES expression* RPARENTHESES;

operator: GREATER | LOWER | PLUS | MINUS | DOT | COMMA;

GREATER: '>';
LOWER: '<';
PLUS: '+';
MINUS: '-';
DOT: '.';
COMMA: ',';
LPARENTHESES: '[';
RPARENTHESES: ']';
FORK: 'Y';
WS: . -> skip;