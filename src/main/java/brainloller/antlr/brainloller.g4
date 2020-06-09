grammar brainloller;

file: expression*;

expression: operator | LPARENTHESES expression* RPARENTHESES;

operator: GREATER | LOWER | PLUS | MINUS | DOT | COMMA | ROTATELEFT | ROTATERIGHT;

GREATER: '(255, 0, 0)';
LOWER: '(128, 0, 0)';
PLUS: '(0, 255, 0)';
MINUS: '(0, 128, 0)';
DOT: '(0, 0, 255)';
COMMA: '(0, 0, 128)';
LPARENTHESES: '(255, 255, 0)';
RPARENTHESES: '(128, 128, 0)';
ROTATELEFT: '(0, 255, 255)';
ROTATERIGHT: '(0, 128, 128)';
WS: . -> skip;