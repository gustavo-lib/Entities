INSERT INTO producto (id,nombre,descripcion) VALUES(1,'producto 1', 'descripcion 1')
INSERT INTO producto (id,nombre,descripcion) VALUES(2,'producto 2', 'descripcion 2')
INSERT INTO producto (id,nombre,descripcion) VALUES(3,'producto 3', 'descripcion 3')

INSERT INTO cliente (nombre) VALUES('gustavo')
INSERT INTO cliente (nombre) VALUES('gabriel')
INSERT INTO factura (fecha,cliente_fk) VALUES('2000-10-11',1)
INSERT INTO factura (fecha,cliente_fk) VALUES('2004-10-11',2)
INSERT INTO linea_factura (precio,nombre_producto,total,fk_factura,producto_fk) VALUES(255,'F1 nombre producto 1',65652,1,1)
INSERT INTO linea_factura (precio,nombre_producto,total,fk_factura,producto_fk) VALUES(5,'F1 nombre producto 2',3658,1,2)
INSERT INTO linea_factura (precio,nombre_producto,total,fk_factura,producto_fk) VALUES(6,'F1 nombre producto 3',90,1,2,3)

INSERT INTO linea_factura (precio,nombre_producto,total,fk_factura) VALUES(43,'F2 nombre producto 1',75,2)