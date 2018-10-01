

INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (1,'INFORMÁTICA');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (2,'ELETRODOMÉSTICOS');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (3,'CELULARES');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (4,'GAMES');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (5,'LIVROS');


INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (1,'56756841268','LOJAS AMERICANAS');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (2,'98531025467','SUBMARINO');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (3,'56903248568','CASAS BAHIA');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (4,'95302456755','EXTRA');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (5,'56910035489','PONTO FRIO');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (6,'65320246972','CARREFOUR');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (7,'98564532185','SHOPTIME');


INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (1,{ts '2018-01-02 00:00:00.0'},'3',2);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (2,{ts '2018-02-03 00:00:00.0'},'5',4);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (3,{ts '2018-03-20 00:00:00.0'},'1',1);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (4,{ts '2018-05-17 00:00:00.0'},'2',3);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (5,{ts '2018-04-19 00:00:00.0'},'4',5);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (6,{ts '2018-09-15 18:20:14.120'},'ttttttttt',2);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido) VALUES (7,{ts '2018-09-15 18:21:08.259'},'ttttttttt',2);


INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (1,{ts '2018-10-01 00:00:00.0'},2,3,1);
INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (2,{ts '2018-10-01 00:00:00.0'},2,3,2);
INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (3,{ts '2018-10-01 00:00:00.0'},4,4,3);
INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (4,{ts '2018-10-01 00:00:00.0'},2,4,4);
INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (5,{ts '2018-10-01 00:00:00.0'},1,2,3);
INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (6,{ts '2018-10-01 00:00:00.0'},2,1,2);
INSERT INTO "public"."entrega" (identrega,dataentregaprevista,idpedido,codsituacaoentrega,idtransportadora) VALUES (7,{ts '2018-10-01 00:00:00.0'},4,3,1);


INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (1,{ts '2018-01-01 00:00:00.0'},10.00,1,1);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (2,{ts '2018-06-01 00:00:00.0'},10.00,3,5);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (3,{ts '2018-07-01 00:00:00.0'},10.00,5,4);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (4,{ts '2018-04-10 00:00:00.0'},10.00,7,2);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (5,{ts '2018-01-11 00:00:00.0'},10.00,4,3);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (6,{ts '2018-08-01 00:00:00.0'},10.00,6,3);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (7,{ts '2018-07-15 00:00:00.0'},10.00,2,4);
INSERT INTO "public"."pedido" (idpedido,datapedido,valorpedido,idcliente,idproduto) VALUES (8,{ts '2018-01-17 00:00:00.0'},10.00,2,1);


INSERT INTO "public"."produto" (idproduto,descproduto,valorproduto,codcategoria) VALUES (1,'XBOX ONE X',2799.90,4);
INSERT INTO "public"."produto" (idproduto,descproduto,valorproduto,codcategoria) VALUES (2,'NOTEBOOK DELL G3',4799.90,1);
INSERT INTO "public"."produto" (idproduto,descproduto,valorproduto,codcategoria) VALUES (3,'GELADEIRA CONSUL',2099.90,2);
INSERT INTO "public"."produto" (idproduto,descproduto,valorproduto,codcategoria) VALUES (4,'IPHONE 8 PLUS 64GB',3899.90,3);
INSERT INTO "public"."produto" (idproduto,descproduto,valorproduto,codcategoria) VALUES (5,'O MILAGRE DA MANHÃ',29.99,5);


INSERT INTO "public"."situacaoentrega" (codsituacaoentrega,descsituacaoentrega) VALUES (1,'AGUARDANDO COLETA');
INSERT INTO "public"."situacaoentrega" (codsituacaoentrega,descsituacaoentrega) VALUES (2,'EM TRANSPORTE PARA FILIAL');
INSERT INTO "public"."situacaoentrega" (codsituacaoentrega,descsituacaoentrega) VALUES (3,'EM TRANSPORTE PARA CONSUMIDOR');
INSERT INTO "public"."situacaoentrega" (codsituacaoentrega,descsituacaoentrega) VALUES (4,'ENTREGUE');


INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (1,'TAria do Leonardo',26000.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (48,null,null);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (56,'Testando',23.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (57,'Testando',10.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (59,'Pedágio',18.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (60,'Tarifa barata',56.00);


INSERT INTO "public"."transportadora" (idtransportadora,cnpj,nometransportadora) VALUES (1,'156489654723598','TRANS RÁPIDO');
INSERT INTO "public"."transportadora" (idtransportadora,cnpj,nometransportadora) VALUES (2,'5644515624897456','ALMEIDA CORTES TRANSPORTES');
INSERT INTO "public"."transportadora" (idtransportadora,cnpj,nometransportadora) VALUES (3,'156489654723598','DELIVERY FAST');
INSERT INTO "public"."transportadora" (idtransportadora,cnpj,nometransportadora) VALUES (4,'6514859632159','DIRECT');
INSERT INTO "public"."transportadora" (idtransportadora,cnpj,nometransportadora) VALUES (5,'65741896523485','TRANSNORTE');


