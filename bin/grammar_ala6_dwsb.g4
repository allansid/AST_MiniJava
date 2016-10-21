grammar grammar_ala6_dwsb;

goal				: mainClass ( classDeclaration )* EOF;
mainClass			: 'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';
classDeclaration	: 'class' identifier ( 'extends' identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}';
varDeclaration 		: type identifier;
methodDeclaration 	: 'public' type identifier '(' (formalList)? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';
formalList			: type identifier (',' formal)*;
formal				: type identifier;
type 				: 'int' '[' ']' 
					| 'boolean' 
					| 'int' 
					| identifier;
statement 			: '{' ( statement )* '}' 
					| 'if' '(' expression ')' statement 'else' statement
					| 'while' '(' expression ')' statement
					| 'System.out.println' '(' expression ')' ';'
					| identifier '=' expression ';'
					| identifier '[' expression ']' '=' expression ';';
expression 			: expression ( '&&' | '<' | '+' | '-' | '*' ) expression
					| expression '[' expression ']'
					| expression '.' 'length'
					| expression '.' identifier '(' ( expression ( ',' expression )* )? ')'
					| INTEGER_LITERAL
					| 'true'
					| 'false'
					| identifier
					| 'this'
					| 'new' 'int' '[' expression ']'
					| 'new' identifier '(' ')'
					| '!' expression
					| '(' expression ')';
identifier			: IDENTIFIER;
IDENTIFIER			: [a-zA-Z0-9_]+;
INTEGER_LITERAL		: [0-9]+;
WHITESPACE			: [' \r\n\t']+;