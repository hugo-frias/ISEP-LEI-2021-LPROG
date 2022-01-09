grammar us2003;

regra: servico NL
|
;

servico: PALAVRA '-' PALAVRA '-' PALAVRA '-' PALAVRA '-' ICONE '-' palavrasChave '-' CATALOGO
;

palavrasChave: PALAVRA ';' palavrasChave
| PALAVRA
;

PALAVRA: [ a-zA-Z0-9]+;
ICONE: 'icone.png';
CATALOGO: 'Reportar Erro/Falha' | 'Cotações e Descontos' | 'Pedidos aos Recursos Humanos' | 'Alteração de Dados Pessoais' | 'Férias e Justificações';

NL: [\n];
WS: [ \t\r]+->skip; // ignora espaços, tabs e mudanças de linha