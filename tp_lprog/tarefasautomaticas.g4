grammar tarefasautomaticas;

regraTA: regraTA tarefaAutomatica NL
|
;

tarefaAutomatica: NCLIENTE '-' NPRODUTO '-' QUANTIDADE #runScript
;

NCLIENTE: 'C'[0-9]+;
NPRODUTO: 'P'[0-9]+;
//PRECO: [0-9]+'.'[0-9]+;
QUANTIDADE: [0-9]+;
//REMETENTE: [a-zA-Z0-9]+'@'[a-z]+'.'[a-z]+;
//PALAVRA: [ a-zA-Z0-9]+;
NL: [\n];
WS: [ \t\r]+->skip; // ignora espaços, tabs e mudanças de linha