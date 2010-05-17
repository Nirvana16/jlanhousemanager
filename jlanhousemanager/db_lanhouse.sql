/*
Created		9/5/2010
Modified		14/5/2010
Project		
Model			
Company		
Author		
Version		
Database		PostgreSQL 8.1 
*/


/* Create Domains */



/* Create Tables */


Create table "Fornecedor"
(
	"idFornecedor" Serial NOT NULL,
	"nome" Varchar(50) NOT NULL,
	"cpnj" Char(15) NOT NULL,
	"telefone" Char(10) NOT NULL,
	"endRua" Varchar NOT NULL,
	"endBairro" Varchar NOT NULL,
	"endNumero" Integer NOT NULL,
	"endCidade" Varchar NOT NULL,
	"endEstado" Char(2) NOT NULL,
	"endCEP" Char(8) NOT NULL,
 primary key ("idFornecedor")
) Without Oids;


Create table "Aquisicao"
(
	"idAquisicao" Serial NOT NULL,
	"idFornecedor" Integer NOT NULL,
	"data" Date NOT NULL,
	"valor" Numeric(15,2) NOT NULL,
 primary key ("idAquisicao")
) Without Oids;


Create table "DespesaVariavel"
(
	"idDespesaVariavel" Serial NOT NULL,
	"data" Date NOT NULL,
	"valor" Numeric(15,2) NOT NULL,
	"descricao" Varchar NOT NULL,
 primary key ("idDespesaVariavel")
) Without Oids;


Create table "DespesaFixa"
(
	"idDespesaFixa" Serial NOT NULL,
	"data" Date NOT NULL,
	"valor" Numeric(15,2) NOT NULL,
	"mesReferencia" Integer NOT NULL,
	"idTipoDespesa" Integer NOT NULL,
 primary key ("idDespesaFixa")
) Without Oids;


Create table "ItemAquisicao"
(
	"idItemAquisicao" Serial NOT NULL,
	"idAquisicao" Integer NOT NULL,
	"idProduto" Integer NOT NULL,
	"quantidade" Integer NOT NULL,
	"preco" Numeric(15,2) NOT NULL,
 primary key ("idItemAquisicao","idAquisicao")
) Without Oids;


Create table "Produto"
(
	"idProduto" Serial NOT NULL,
	"descricao" Varchar NOT NULL,
	"qtdEstoque" Integer NOT NULL,
	"preco" Numeric(15,2) NOT NULL,
 primary key ("idProduto")
) Without Oids;


Create table "CompraDeProduto"
(
	"idCompraDeProduto" Serial NOT NULL,
	"quantidade" Integer NOT NULL,
	"idProduto" Integer NOT NULL,
	"idItemDaConta" Bigint NOT NULL,
	"idConta" Integer NOT NULL,
 primary key ("idCompraDeProduto")
) Without Oids;


Create table "ItemDaConta"
(
	"idItemDaConta" BigSerial NOT NULL,
	"idConta" Integer NOT NULL,
 primary key ("idItemDaConta","idConta")
) Without Oids;


Create table "UsoDoComputador"
(
	"idUsoDoComputador" Serial NOT NULL,
	"horaInicial" Timestamp NOT NULL,
	"horaFim" Timestamp NOT NULL,
	"horaEncerrada" Timestamp NOT NULL,
	"idItemDaConta" Bigint NOT NULL,
	"idConta" Integer NOT NULL,
	"numeroPC" Integer NOT NULL,
 primary key ("idUsoDoComputador")
) Without Oids;


Create table "ExecucaoDeServico"
(
	"idExecucaoDeServico" Serial NOT NULL,
	"quantidade" Integer NOT NULL,
	"idEspecificacaoServico" Integer NOT NULL,
	"idItemDaConta" Bigint NOT NULL,
	"idConta" Integer NOT NULL,
 primary key ("idExecucaoDeServico")
) Without Oids;


Create table "EspecificacaoServico"
(
	"idEspecificacaoServico" Serial NOT NULL,
	"descricao" Varchar NOT NULL,
	"preco" Numeric(15,2) NOT NULL,
	"unidade" Integer NOT NULL,
 primary key ("idEspecificacaoServico")
) Without Oids;


Create table "Funcionario"
(
	"idFuncionario" Serial NOT NULL,
	"nome" Varchar NOT NULL,
	"cpf" Char(11) NOT NULL,
	"email" Varchar,
	"telResidencial" Char(10),
	"telCelular" Char(10),
	"endRua" Varchar NOT NULL,
	"endBairro" Varchar NOT NULL,
	"endNumero" Integer NOT NULL,
	"endCidade" Varchar NOT NULL,
	"endEstado" Char(2) NOT NULL,
	"endCEP" Char(8) NOT NULL,
 primary key ("idFuncionario")
) Without Oids;


Create table "Conta"
(
	"idConta" Serial NOT NULL,
	"idFuncionario" Integer NOT NULL,
	"idCliente" Integer NOT NULL,
	"data" Date NOT NULL,
	"situacao" Varchar NOT NULL,
 primary key ("idConta")
) Without Oids;


Create table "Cliente"
(
	"idCliente" Serial NOT NULL,
	"nome" Varchar NOT NULL,
	"cpf" Char(11) NOT NULL,
	"dataNascimento" Date NOT NULL,
	"email" Varchar,
	"telResidencial" Char(10),
	"telCelular" Char(10),
	"endRua" Varchar NOT NULL,
	"endBairro" Varchar NOT NULL,
	"endNumero" Integer NOT NULL,
	"endCidade" Varchar NOT NULL,
	"endEstado" Char(2) NOT NULL,
	"endCEP" Char(8) NOT NULL,
 primary key ("idCliente")
) Without Oids;


Create table "TipoDespesa"
(
	"idTipoDespesa" Serial NOT NULL,
	"descricao" Varchar NOT NULL,
 primary key ("idTipoDespesa")
) Without Oids;


Create table "Computador"
(
	"numeroPC" Integer NOT NULL,
	"descSO" Varchar NOT NULL,
	"descPlacaMae" Varchar NOT NULL,
	"descProcessador" Varchar NOT NULL,
	"descMemoria" Varchar NOT NULL,
	"clockProcessador" Double precision NOT NULL,
	"tamMemoria" Integer NOT NULL,
	"tamHD" Integer NOT NULL,
 primary key ("numeroPC")
) Without Oids;



/* Create Tab 'Others' for Selected Tables */


/* Create Indexes */
Create index "indice_nome_fornecedor" on "Fornecedor" using btree ("nome");
Create unique index "indice_cpnj_fornecedor" on "Fornecedor" using btree ("cpnj");
Create index "indice_nome_funcionario" on "Funcionario" using btree ("nome");
Create index "indice_cpf_funcionario" on "Funcionario" using btree ("cpf");
Create index "indice_situacao" on "Conta" using btree ("situacao");
Create index "indice_nome_cliente" on "Cliente" using btree ("nome");
Create index "indice_cpf_cliente" on "Cliente" using btree ("cpf");
Create index "index_tipodespesa_descricao" on "TipoDespesa" using btree ("descricao");



/* Create Foreign Keys */

Alter table "Aquisicao" add  foreign key ("idFornecedor") references "Fornecedor" ("idFornecedor") on update restrict on delete restrict;

Alter table "ItemAquisicao" add  foreign key ("idAquisicao") references "Aquisicao" ("idAquisicao") on update restrict on delete restrict;

Alter table "ItemAquisicao" add  foreign key ("idProduto") references "Produto" ("idProduto") on update restrict on delete restrict;

Alter table "CompraDeProduto" add  foreign key ("idProduto") references "Produto" ("idProduto") on update restrict on delete restrict;

Alter table "CompraDeProduto" add  foreign key ("idItemDaConta","idConta") references "ItemDaConta" ("idItemDaConta","idConta") on update restrict on delete restrict;

Alter table "ExecucaoDeServico" add  foreign key ("idItemDaConta","idConta") references "ItemDaConta" ("idItemDaConta","idConta") on update restrict on delete restrict;

Alter table "UsoDoComputador" add  foreign key ("idItemDaConta","idConta") references "ItemDaConta" ("idItemDaConta","idConta") on update restrict on delete restrict;

Alter table "ExecucaoDeServico" add  foreign key ("idEspecificacaoServico") references "EspecificacaoServico" ("idEspecificacaoServico") on update restrict on delete restrict;

Alter table "Conta" add  foreign key ("idFuncionario") references "Funcionario" ("idFuncionario") on update restrict on delete restrict;

Alter table "ItemDaConta" add  foreign key ("idConta") references "Conta" ("idConta") on update restrict on delete restrict;

Alter table "Conta" add  foreign key ("idCliente") references "Cliente" ("idCliente") on update restrict on delete restrict;

Alter table "DespesaFixa" add  foreign key ("idTipoDespesa") references "TipoDespesa" ("idTipoDespesa") on update restrict on delete restrict;

Alter table "UsoDoComputador" add  foreign key ("numeroPC") references "Computador" ("numeroPC") on update restrict on delete restrict;





