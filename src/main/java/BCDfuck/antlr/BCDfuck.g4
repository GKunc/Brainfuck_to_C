grammar BCDfuck;

file: expression*;

expression: operator | B expression* C;

operator: A | C | D | E | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE;

A: 'A';
B: 'B';
C: 'C';
D: 'D';
E: 'E';
ZERO: '0';
ONE: '1';
TWO: '2';
THREE: '3';
FOUR: '4';
FIVE: '5';
SIX: '6';
SEVEN: '7';
EIGHT: '8';
NINE: '9';
WS: . -> skip;