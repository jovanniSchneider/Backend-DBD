INSERT INTO Carrito(id_carrito, Total) 
VALUES 
(1,22000),
(3,40000),
(4,8000),
(6,2000);
INSERT INTO Direccion(id_direccion, calle, numero, comuna, region) 
VALUES 
(12,'Florencia',328,'San Joaquin','Metropolitana'),
(28,'Mirador',6312,'San Ramon','Metropolitana'),
(5,'Colo colo',325,'Pucon','Araucania'),
(21,'Pablo Neruda',1212,'Rancagua','OHiggins');
INSERT INTO User_table(id_user,username,email,password,edad,id_carrito,id_direccion)
VALUES
(2,'Diegoo','diego.molina@gmail.com','1223',20,1,28),
(0,'admin','admin@debede.cl','admin',0,null,null),
(4,'Nicoox','nicolas.sanchez@gmail.com','3221',21,3,12),
(5,'Jova','jovanni.schn@gmail.com','12345',20,6,5),
(1,'Martiny','martin.sal@gmail.com','1223',21,4,21);
INSERT INTO Pyme(id_pyme,nombre,id_user)
VALUES
(1,'Verduras diegito',2),
(7,'Digames',4),
(15,'Sportiny',1);
INSERT INTO Producto(codigo_pr, name, tipo_de_producto, restriccion)
VALUES
(110, 'lechuga','Verduras','N'),
(111,'Godofbat','Videojuego','Y'),
(112,'AnimalCross','Videojuego','N'),
(113,'Mancuerna','Deportes','N');
INSERT INTO Stock(id_stock, cantidad, precio, producto_codigo_pr,id_pyme)
VALUES
(31,10,40000,111,7),
(32,15,1500,110,1),
(21,5,50000,112,7),
(22,12,22000,113,15);
INSERT INTO Carrito_Stock(codigo_carrito_stock,id_carrito,id_stock)
VALUES
(1,1,22),
(2,3,31),
(3,4,32),
(4,6,32);
INSERT INTO Medio_de_pago(codigo_pago,tipo)
VALUES
(76,'Efectivo'),
(78,'Debito'),
(80,'Cuotas'),
(82,'Credito');
INSERT INTO Rol(id_rol,tipo_rol ,id_user)
VALUES
(0,'Admin',0),
(1,'Empresa',2),
(2,'Cliente',5),
(3,'Empresa',1),
(4,'Empresa',4);
INSERT INTO Transaccion(id_transaccion, Fecha,user_id_user,pyme_id_pyme,mediodepago_codigo_pago)
VALUES
(101,'2022-08-12',4,1,76),
(110,'2020-12-10',4,7,80),
(111,'2021-10-28',4,15,78);
INSERT INTO Valoracion(id_valoracion,puntaje,comentario, id_user,id_pyme)
VALUES
(700,9.0,'La lechuga venia fresca',4,1),
(701,7.5,'El juego quedo flojo',4,7),
(702,9.0,'De maravilla el pedido',4,15);
INSERT INTO Transaccion_producto(transaccion_producto, transaccion_id_transaccion, producto_codigo_pr)
VALUES
(12,101,110),
(13,110,111),
(14,111,113);