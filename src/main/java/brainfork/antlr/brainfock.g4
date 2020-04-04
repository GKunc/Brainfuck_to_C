grammar brainfock;

file: expression*;

expression: operator | LPARENTHESES expression* RPARENTHESES;

operator: GREATER | LOWER | PLUS | MINUS | DOT | COMMA | FORK;

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