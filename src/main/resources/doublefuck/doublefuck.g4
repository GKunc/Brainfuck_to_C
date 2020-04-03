grammar doublefuck;

file: expression*;

expression: operator | LPARENTHESES expression* RPARENTHESES | LBRACKET expression * RBRACKET;

operator: GREATER | LOWER | PLUS | MINUS | DOT | COMMA;

GREATER: '>';
LOWER: '<';
PLUS: '+';
MINUS: '-';
DOT: '.';
COMMA: ',';
LPARENTHESES: '[';
RPARENTHESES: ']';
V: 'v';
POWER: '^';
SLASH: '/';
BACKSLASH: '\\';
COLON: ':';
SEMICOLON: ';';
LBRACKET: '{';
RBRACKET: '}';
WS: . -> skip;