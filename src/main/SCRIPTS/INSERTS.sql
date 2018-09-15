

INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (1,'INFORM�TICA');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (2,'ELETRODOM�STICOS');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (3,'CELULARES');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (4,'GAMES');
INSERT INTO "public"."categoria" (codcategoria,desccategoria) VALUES (5,'LIVROS');


INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (1,'56756841268','GILBERTO DA SILVA MOURA');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (2,'98531025467','MARIA DE F�TIMA');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (3,'56903248568','ALESSANDRA DE S�');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (4,'95302456755','JO�O VICTOR VASCONCELOS');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (5,'56910035489','FERNANDO GON�ALVES DE LIMA');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (6,'65320246972','ALEXANDRE TOMAZ FERNANDES');
INSERT INTO "public"."cliente" (idcliente,cpfcnpj,nomecliente) VALUES (7,'98564532185','ROBERTA MARTINS PEREIRA');


INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido,idproduto) VALUES (1,{ts '2018-01-02 00:00:00.0'},'3',2,1);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido,idproduto) VALUES (2,{ts '2018-02-03 00:00:00.0'},'5',4,5);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido,idproduto) VALUES (3,{ts '2018-03-20 00:00:00.0'},'1',1,4);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido,idproduto) VALUES (4,{ts '2018-05-17 00:00:00.0'},'2',3,5);
INSERT INTO "public"."devolucao" (iddevolucao,datadevolucao,motivo,idpedido,idproduto) VALUES (5,{ts '2018-04-19 00:00:00.0'},'4',5,2);


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
INSERT INTO "public"."produto" (idproduto,descproduto,valorproduto,codcategoria) VALUES (5,'O MILAGRE DA MANH�',29.99,5);


INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (48,null,null);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (56,'Testando',23.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (57,'Testando',10.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (59,'Ped�gio',18.00);
INSERT INTO "public"."tarifa" (idtarifa,desctarifa,valortarifa) VALUES (60,'Tarifa barata',56.00);


