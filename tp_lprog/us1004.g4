grammar us1004;

regra: regra catalogo NL
|
;

catalogo: catalogoErro
| catalogoFinancas
| catalogoRh
;

catalogoErro: CATALOGOERRO NL SERROCOMUNICACAO NL sErroComunicacao
| CATALOGOERRO NL SERROEQUIPAMENTO NL sErroEquipamento
| CATALOGOERRO NL SERROAPLICACAO NL sErroAplicacao
;

sErroEquipamento: PALAVRA SEP PALAVRA SEP INTEIRO SEP PALAVRA SEP anexoAnomalia #validoEquipAnomalia
| PALAVRA SEP PALAVRA SEP INTEIRO SEP PALAVRA #validoEquip
| PALAVRA SEP INTEIRO SEP PALAVRA #faltaTipoAnomalia
| PALAVRA SEP PALAVRA SEP PALAVRA #faltaNumEquipamento
;

sErroComunicacao: PALAVRA SEP PALAVRA #validoErroComunicacao
| PALAVRA #invalidoErroComunicacao
;

sErroAplicacao: PALAVRA SEP PALAVRA #validoErroAplicacao
| PALAVRA #invalidoErroAplicacao
;

anexoAnomalia: anexoAnomalia ',' IMAGEM
| IMAGEM
;

catalogoFinancas: CATALOGOFINANCA NL SVENDA NL sVenda
| CATALOGOFINANCA NL SDESCONTO NL sDesconto
;

sVenda: PALAVRA SEP PALAVRA #validoSVenda
| PALAVRA #invalidoSVenda
;

sDesconto: PALAVRA SEP PALAVRA #validoSDesconto
| PALAVRA #invalidoSDesconto
;

catalogoRh: CATALOGORH NL CATALOGODADOS NL catalogoDados
| CATALOGORH NL CATALOGOFERIAS NL catalogoFerias
;

catalogoDados: SNIB NL sNIB
| SRESIDENCIA NL sResidencia
| SESTADOCIVIL NL sEstadoCivil
| SHABILITACOESLITERARIAS NL sHabilitacoesLiterarias
;

sNIB: NIB SEP IMAGEM #validoNIB
| NIB #faltaFicheiroComprovativo
| IMAGEM #faltaNIB
;

sResidencia: PALAVRA SEP IMAGEM #validoSResidencia
| PALAVRA #faltaFicheiroSResidencia
| IMAGEM #invalidoSResidencia
;

sEstadoCivil: PALAVRA SEP IMAGEM #validoSEstadoCivil
| PALAVRA #faltaFicheiroSEstadoCivil
| IMAGEM #invalidoSEstadoCivil
;

sHabilitacoesLiterarias: PALAVRA SEP IMAGEM #validoSHabilitacoesLiterarias
| PALAVRA #faltaFicheiroSHabilitacoesLiterarias
| IMAGEM #invalidoSHabilitacoesLiterarias
;

catalogoFerias: SFERIAS NL sFerias
| SFALTAPASSADA NL sFaltaPassada
| SFALTAFUTURA NL sFaltaFutura
;

sFerias: PALAVRA SEP PALAVRA #validoSFerias
| PALAVRA #invalidoSFerias
;

sFaltaPassada: PALAVRA SEP PALAVRA #validoSFaltaPassado
| PALAVRA #invalidoSFaltaPassado
;

sFaltaFutura: PALAVRA SEP PALAVRA #validoSFaltaFutura
| PALAVRA #invalidoSFaltaFutura
;

CATALOGOERRO: 'Reportar Erro/Falha';
SERROCOMUNICACAO: 'Reportar anomalia de comunicacao';
SERROEQUIPAMENTO: 'Anomalia de equipamento';
SERROAPLICACAO: 'Reportar anomalia em aplicacao';

CATALOGOFINANCA: 'Cotacoes e Descontos';
SVENDA: 'Requerer cotacao para venda por grosso';
SDESCONTO: 'sDesconto';

CATALOGORH: 'Pedidos aos Recursos Humanos';

CATALOGODADOS: 'Alteracao de Dados Pessoais';
SNIB: 'Alteracao de NIB';
SRESIDENCIA: 'Alteracao de Residencias';
SESTADOCIVIL: 'Alteracao de Estado Civil para efeitos de IRS';
SHABILITACOESLITERARIAS: 'Alteracao de Habilitacoes Literarias';

CATALOGOFERIAS: 'Ferias e Justificacoes';
SFERIAS: 'Marcar Ferias';
SFALTAPASSADA: 'Justificar falta ocorrida';
SFALTAFUTURA: 'Informar ausencia futura';

NIB: 'PT'[0-9]+;
IMAGEM: [A-Za-z ]+'.jpg';

INTEIRO: [0-9]+;
PALAVRA: [a-zA-Z0-9_ ]*;

SEP: '-';
NL: [\n];
WS: [ \t\r]+->skip; // ignora espaços, tabs e mudanças de linha