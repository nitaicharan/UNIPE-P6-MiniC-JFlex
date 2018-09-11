

%%

%class ClasseJFlex
%unicode
%line
%column
%type Token

LETRA = [a-zA-Z]
DIGITO = [0-9]
ESCAPE = [\r \t \n \\]
FINAL_LINHA = (\r | \n | \r\n)

ID = ( {LETRA} | _ )( {LETRA} | {DIGITO} | _ )*

LITERAL_CHAR  = '( {LETRA} | {DIGITO} | "\\n" | "\\\\" | "\\t" | "\\r" )?'
LITERAL_STRING = "\"" [^"\""]* "\""
LITERAL_INTEIRO = {DIGITO}+
LITERAL_PONTO_FLUTUANTE = {DIGITO}+("."{DIGITO}+)*

COMENTARIO_LINHA = "//" [^\r\n]* {FINAL_LINHA}?
COMENTARIO_MULTI_LINHAS = "/*"~"*/"

OPERADORES_ARITMETICOS = ( "+" | "-" | "*" | "/" )
OPERADORES_RELACIONAIS = ( "==" | "!=" | "<" | ">" | "<=" | ">=" )
OPERADORES_LOGICOS = ( "&&" | "||" | "!" )
OPERADOR_ATRIBUICAO = "="
SIMBOLOS_PONTUACAO = ( ":" | ";" | "," | "(" | ")" | "{" | "}" | "." | "#" | "&" | "|" )

%%


"char" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"else" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"true" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"false" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"if" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"int" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"float" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"double" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"main" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"printf" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"printint" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"printstr" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"return" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"static" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"void" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"while" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"for" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"do" { return new Token( "PR", yytext(), yyline, yycolumn ); }
"include" { return new Token( "PR", yytext(), yyline, yycolumn ); }


{ID} { return new Token( "ID", yytext(), yyline, yycolumn ); }


{LITERAL_CHAR} { return new Token( "LC", yytext(), yyline, yycolumn ); }
{LITERAL_STRING} { return new Token( "LS", yytext(), yyline, yycolumn ); }
{LITERAL_INTEIRO} { return new Token( "LI", yytext(), yyline, yycolumn ); }
{LITERAL_PONTO_FLUTUANTE} { return new Token( "LPF", yytext(), yyline, yycolumn ); }


{OPERADORES_ARITMETICOS} { return new Token( "OA", yytext(), yyline, yycolumn ); }
{OPERADORES_RELACIONAIS} { return new Token( "OR", yytext(), yyline, yycolumn ); }
{OPERADORES_LOGICOS} { return new Token( "OL", yytext(), yyline, yycolumn ); }
{OPERADOR_ATRIBUICAO} { return new Token( "OATR", yytext(), yyline, yycolumn ); }
{SIMBOLOS_PONTUACAO} { return new Token( "SP", yytext(), yyline, yycolumn ); }

{COMENTARIO_MULTI_LINHAS} {}
{COMENTARIO_LINHA} {}

{ESCAPE} {}

. { throw new Error( "\n Caracter Ilegal: < " + yytext() + ", " + yyline + ", " + yycolumn + " >"); }
