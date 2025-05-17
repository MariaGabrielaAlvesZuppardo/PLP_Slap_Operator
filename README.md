# Projeto – Programação Funcional 03 com Operador Splat (`*`)

Este repositório contém a implementação do **operador splat (`*`)**, inspirado na linguagem **Ruby**, na **Linguagem Funcional 3**, desenvolvida no contexto da disciplina _IN1007 – Paradigmas de Linguagens de Programação_, ministrada pelo **Prof. Dr. Augusto Sampaio**, no Programa de Pós-Graduação em Ciência da Computação (PPGCC) do **Centro de Informática da Universidade Federal de Pernambuco (CIn-UFPE)**.

---

## 👥 Integrantes do Projeto

- Letícia Rose de Santana Lopes — [lrsl@cin.ufpe.br](mailto:lrsl@cin.ufpe.br)  
- Maria Gabriela Alves Zuppardo — [mgaz@cin.ufpe.br](mailto:mgaz@cin.ufpe.br)

---

## 📌 Descrição do Projeto

### 🔹 O que é o Operador Splat (`*`)?

O **operador splat**, proveniente da linguagem Ruby, é utilizado para **empacotar** ou **desempacotar** coleções de elementos (como arrays) de maneira flexível:

- Em **chamadas de função**, permite **expandir listas em múltiplos argumentos**.
- Em **definições de função**, permite **capturar argumentos variáveis** como uma lista.
- Também é útil para **desestruturação de arrays** e **manipulação de listas** em geral.

> Inspirado por [Thoughtbot - Ruby Splat Operator](https://thoughtbot.com/blog/ruby-splat-operator).

---

## 🎯 Objetivo

Estender a **Linguagem Funcional 3** (abordada anteriormente na disciplina), adicionando:
- **Integração do operador splat (`*`)**, permitindo desempacotamento de listas em chamadas de função

Essa extensão visa enriquecer o paradigma funcional com **maior expressividade**, promovendo **argumentos dinâmicos e manipulação flexível de listas**.

##  Motivador: 

Não achamos outra linguagem de programação que possui esse tipo de operador, se tornando uma questão de interesse ao ver o que ele pode fazer dentro da nossa linguagem.

## 💻 BNF do Projeto: 


[Programa](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional3/Programa.java) ::= [Expressao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/master/Funcional3/src/lf3/plp/expressions2/expression/Expressao.java)

Expressao ::= [Valor](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/Valor.java) <br />

>	| [ExpUnaria](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ExpUnaria.java) <br />

>	| [ExpBinaria](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ExpBinaria.java) <br />

>	| [ExpDeclaracao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional2/expression/ExpDeclaracao.java) <br />

>	| [Id](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/Id.java) <br />

>	| [Aplicacao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional2/expression/Aplicacao.java) <br />

>	| [IfThenElse](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional1/expression/IfThenElse.java) <br />

Valor ::= [ValorConcreto](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ValorConcreto.java) 
| [ValorAbstrato](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional2/expression/ValorAbstrato.java)

ValorAbstrato ::= [ValorFuncao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional2/expression/ValorFuncao.java) 


ValorConcreto ::= [ValorInteiro](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ValorInteiro.java) 

>| [ValorBooleano](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ValorBooleano.java) 

>| [ValorString](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ValorString.java) 

>| [ValorLista](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional3/expression/ValorLista.java) <br />

ValorFuncao ::= "fn" Id Id "." Expressao

ExpUnaria ::= ["-" Expressao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ExpMenos.java) <br />

>	| ["not" Expressao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ExpNot.java) <br />

>	| ["length" Expressao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/expressions2/expression/ExpLength.java) <br />

>	| [head(Expressao)](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional3/expression/ExpHead.java) <br />

>	| [tail(Expressao)](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional3/expression/ExpTail.java) <br />

>	| [ExpCompreensaoLista](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional3/expression/ExpCompreensaoLista.java) <br />

ExpBinaria ::= Expressao "+" Expressao
> | Expressao "-" Expressao
> | Expressao "*" Expressao
> | Expressao ">" Expressao
> | Expressao "<" Expressao
> | Expressao "and" Expressao
> | Expressao "or" Expressao
> | Expressao "==" Expressao
> | Expressao "++" Expressao
> | Expressao ".." Expressao
> | Expressao ":" Expressao
> | Expressao "^^" Expressao

ExpDeclaracao ::= "let" [DeclaracaoFuncional](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional1/declaration/DeclaracaoFuncional.java) "in" Expressao


DeclaracaoFuncional ::= [DecVariavel](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional1/declaration/DecVariavel.java) <br />

>	| [DecFuncao](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional2/declaration/DecFuncao.java) <br />

>	| [DecComposta](https://github.com/MariaGabrielaAlvesZuppardo/PLP_Slap_Operator/blob/fdf427892742c93d0591440dfb95bc12fc985353/Funcional3/src/lf3/plp/functional3/declaration/DecComposta.java)

DecVariavel ::= "var" Id "=" Expressao

DecFuncao ::= "fun" ListId "=" Expressao

DecComposta ::= DeclaracaoFuncional "," DeclaracaoFuncional

ListId ::= Id  |  Id, ListId

Aplicacao:= Expressao"(" ListExp ")"

ListExp ::= Expressao  |  Expressao, ListExp

Esta BNF ilustra apenas a estrutura básica do que será possível utilizar na linguagem.

## Extensões realizadas em LF3
1. 

## Slides da apresentação

Disponível [aqui]()

# Paradigmas de Linguagens de Programação

Repositório do projeto da disciplina Paradigmas de Linguagens de Programação ([in1007](https://www.cin.ufpe.br/~in1007/)) da pós-graduação em Ciência da Computação da UFPE, ministrada pelo Prof.Dr. Augusto Sampaio.

## Créditos

Baseado no projeto da equipe:

* Luana Martins (lms7@cin.ufpe.br)
* Marcel Rebouças (mscr@cin.ufpe.br)
* Renato Oliveira (ros3@cin.ufpe.br)
