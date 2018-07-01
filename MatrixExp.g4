grammar MatrixExp;  //A["p1","p2"]+B["p1","p3"]>C["p1"]

exp:  '(' exp ')'   #COMBINE   
   | '-' exp        #NEGATIVE
   | '!' exp        #NOT
   | exp '^' exp    #POWER
   | exp '*' exp    #MUL
   | exp '/' exp    #DIV
   | exp '%' exp    #MODE
   | exp '+' exp    #ADD
   | exp '-' exp    #SUB   
   | exp '>' exp    #GREATE
   | exp '>=' exp   #GREATEOREQUEAL
   | exp '=' exp    #EQUAL
   | exp '<' exp    #LESS
   | exp '<=' exp   #LESSOREQUEAL
   | exp '!=' exp   #NOTEQUEAL
   | exp '&&' exp   #AND
   | exp '||' exp   #OR
   | matrix         #MTRX
   | NUMBER          #NUMBER
   ;
matrix: MATRIXNAME '[' propList ']'
      ;

prop: ID        
    ;
propList: prop (',' prop)*
        ;
MATRIXNAME: 'A'..'Z'
          ;
		  
ID  :  NameStartChar NameChar*
    ;
fragment LETTER  : [a-zA-Z] ;	

fragment
NameChar
: NameStartChar
| '0'..'9'
| '_'
| '\u00B7'
| '\u0300'..'\u036F'
| '\u203F'..'\u2040'
;

fragment
NameStartChar
: 'A'..'Z' | 'a'..'z'
| '\u00C0'..'\u00D6'
| '\u00D8'..'\u00F6'
| '\u00F8'..'\u02FF'
| '\u0370'..'\u037D'
| '\u037F'..'\u1FFF'
| '\u200C'..'\u200D'
| '\u2070'..'\u218F'
| '\u2C00'..'\u2FEF'
| '\u3001'..'\uD7FF'
| '\uF900'..'\uFDCF'
| '\uFDF0'..'\uFFFD'
;

NUMBER
    :   INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   INT EXP            // 1e10 -3e4
    |   INT                // -3, 45
    ;
fragment INT :   '0' | '1'..'9' '0'..'9'* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS:[ \t\r\n]+ -> skip;
NL      :   '\r'? '\n' ;
