package br.com.minic.analisadorlexico;
import br.com.minic.analisadorsintatico.sym;

import java_cup.runtime.*;

%%

%class AnalisadorLexico
%unicode
%cup
%line
%column
%type Symbol
%public

LETRA = [a-zA-Z]
DIGITO = [0-9]
FINAL_LINHA = (\r | \n | \r\n | \t)
ESPACO_EM_BRANCO = [ ]

ID = ( {LETRA} | _ )( {LETRA} | {DIGITO} | _ )*

LITERAL_CHAR  = '( {LETRA} | {DIGITO} | "\\n" | "\\\\" | "\\t" | "\\r" )?'
LITERAL_STRING = "\"" [^"\""]* "\""
LITERAL_INTEIRO = {DIGITO}+
LITERAL_PONTO_FLUTUANTE = {DIGITO}+("."{DIGITO}+)*

COMENTARIO_LINHA = "//" [^\r\n]* {FINAL_LINHA}?
COMENTARIO_MULTI_LINHAS = "/*"~"*/"

%%


"char" { return new Symbol( sym.CHAR, yyline, yycolumn, yytext() ); }
"else" { return new Symbol( sym.ELSE, yyline, yycolumn, yytext() ); }
"if"	{ return new Symbol( sym.IF, yyline, yycolumn, yytext() ); }
"int" { return new Symbol( sym.INT, yyline, yycolumn, yytext() ); }
"double" { return new Symbol( sym.DOUBLE, yyline, yycolumn, yytext() ); }
"main" { return new Symbol( sym.MAIN, yyline, yycolumn, yytext() ); }
"float" { return new Symbol( sym.FLOAT, yyline, yycolumn, yytext() ); }
"printf" { return new Symbol( sym.PRINTF, yyline, yycolumn, yytext() ); }
"printint" { return new Symbol( sym.PRINTINT, yyline, yycolumn, yytext() ); }
"printstr" { return new Symbol( sym.PRINTSTR, yyline, yycolumn, yytext() ); }
"return" { return new Symbol( sym.RETORNO, yyline, yycolumn, yytext() ); }
"while" { return new Symbol( sym.WHILE, yyline, yycolumn, yytext() ); }
"include" { return new Symbol( sym.INCLUDE, yyline, yycolumn, yytext() ); }

"h" { return new Symbol( sym.LETRA_H, yyline, yycolumn, yytext() ); }
{ID} { return new Symbol( sym.IDENTIFICADOR, yyline, yycolumn, yytext() ); }


"!" { return new Symbol( sym.EXCLAMA, yyline, yycolumn, yytext() ); }
"=" { return new Symbol( sym.IGUAL, yyline, yycolumn, yytext() ); }
"<" { return new Symbol( sym.MENOR, yyline, yycolumn, yytext() ); }
">" { return new Symbol( sym.MAIOR, yyline, yycolumn, yytext() ); }
">=" { return new Symbol( sym.MAIOR_IGUAL, yyline, yycolumn, yytext() ); }
"<=" { return new Symbol( sym.MENOR_IGUAL, yyline, yycolumn, yytext() ); }
"==" { return new Symbol( sym.IGUAL_IGUAL, yyline, yycolumn, yytext() ); }
"!=" { return new Symbol( sym.DIFERENTE_IGUAL, yyline, yycolumn, yytext() ); }

"#" { return new Symbol( sym.JOGO_DA_VELHA, yyline, yycolumn, yytext() ); }
"." { return new Symbol( sym.PONTO, yyline, yycolumn, yytext() ); }
"{" { return new Symbol( sym.ABRE_CHAVE, yyline, yycolumn, yytext() ); }
"}" { return new Symbol( sym.FECHA_CHAVE, yyline, yycolumn, yytext() ); }
"(" { return new Symbol( sym.ABRE_PARENTESES, yyline, yycolumn, yytext() ); }
")" { return new Symbol( sym.FECHA_PARENTESES, yyline, yycolumn, yytext() ); }
";" { return new Symbol( sym.PONTO_VIRGULA, yyline, yycolumn, yytext() ); }
"," { return new Symbol( sym.VIRGULA, yyline, yycolumn, yytext() ); }

"+" { return new Symbol( sym.SOMA, yyline, yycolumn, yytext() ); }
"-" { return new Symbol( sym.MENOS, yyline, yycolumn, yytext() ); }
"*" { return new Symbol( sym.VEZES, yyline, yycolumn, yytext() ); }
"/" { return new Symbol( sym.DIVIDE, yyline, yycolumn, yytext() ); }


{LITERAL_CHAR} { return new Symbol( sym.LITERAL_CHAR, yyline, yycolumn, yytext() ); }
{LITERAL_STRING} { return new Symbol( sym.LITERAL_STRING, yyline, yycolumn, yytext() ); }
{LITERAL_INTEIRO} { return new Symbol( sym.LITERAL_INTEIRO,  yyline, yycolumn, yytext() ); }
{LITERAL_PONTO_FLUTUANTE} { return new Symbol( sym.LITERAL_PONTO_FLUTUANTE,  yyline, yycolumn, yytext() ); }

{COMENTARIO_MULTI_LINHAS} {}
{COMENTARIO_LINHA} {}

{FINAL_LINHA} {}
{ESPACO_EM_BRANCO} {}

. { throw new Error( "\n Caracter Ilegal: < " + yytext() + ", " + yyline + ", " + yycolumn + " >"); }
