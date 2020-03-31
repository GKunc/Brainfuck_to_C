grammar Brainfuck;

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
WS: . -> skip;