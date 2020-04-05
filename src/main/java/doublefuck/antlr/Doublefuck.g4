grammar Doublefuck;

file: expression*;

expression: operator | LPARENTHESES expression* RPARENTHESES | LBRACKET expression * RBRACKET;

operator: GREATER | LOWER | PLUS | MINUS | DOT | COMMA | V | POWER | SLASH | BACKSLASH | COLON | SEMICOLON;

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