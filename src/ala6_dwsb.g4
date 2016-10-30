grammar ala6_dwsb;

WHITESPACE 			: [' \r\n\t']+ -> skip;
OPERATOR 			: ( '&&' | '<' | '+' | '-' | '*' );
IDENTIFIER 			: [a-zA-Z0-9_]+;
INTEGER_LITERAL 	: [0-9]+;

goal 				: mainClass ( classDeclaration )* EOF;
mainClass 			: 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}';
classDeclaration	:'class' IDENTIFIER ( 'extends' IDENTIFIER )? '{' ( varDeclaration )* ( methodDeclaration )* '}';
varDeclaration 		: type IDENTIFIER ';';
//Diogo, tirei o Formal do methodDecl p poder ajeitar e rodar, tava dando erro.
methodDeclaration 	:'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )*( statement )* 'return' expression ';' '}';
type				: 'int' '[' ']' | 'boolean' | 'int' |IDENTIFIER;
formalList			: type IDENTIFIER (',' formal)*;
formal				: type IDENTIFIER;
statement 			: '{' ( statement )* '}'
					| 'if' '(' expression ')' statement 'else' statement
					| 'while' '(' expression ')' statement
					| 'System.out.println' '(' expression ')' ';'
					| IDENTIFIER '=' expression ';'
					| IDENTIFIER '[' expression ']' '=' expression ';';
expression			: expression OPERATOR expression
					| expression '[' expression ']'
					| expression '.' 'length'
					| expression '.' IDENTIFIER '(' ( expression ( ',' expression )* )? ')'
					| INTEGER_LITERAL
					| 'true'
					| 'false'
					| IDENTIFIER
					| 'this'
					| 'new' 'int' '[' expression ']'
					| 'new' IDENTIFIER '(' ')'
					| '!' expression
					| '(' expression ')';
