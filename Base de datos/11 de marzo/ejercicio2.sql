create database empredimiento;
use empredimiento;

create table clientes(id_cliente int auto_increment primary key, nombre varchar(50), apellido varchar(50), direccion varchar(50), telefono int, email varchar(50), fecha_alta date);
create table productos(codigo int, producto varchar(30), descripcion varchar(255), precio_compra float);
create table pedidos(id_pedido int auto_increment primary key, descripcion varchar(100), id_cliente int, fecha_compra date, fecha_entrega date, descuento float);
create table detallePedidos(id_pedido int, codigo_producto int, cantidad int, precioVenta float);

SET SQL_SAFE_UPDATES = 0;

-- 1:
select id_pedido, id_cliente, fecha_compra, descuento from pedidos where fecha_entrega between "2017-07-01" and "2017-07-31" order by id_cliente and fecha_compra;

-- 2:
select * from productos where codigo in(select codigo_producto from detallePedidos);

-- 3:
select * from pedidos where descuento > 10;

-- 4:
select count(producto) as UnidadesVendidas, codigo from productos group by codigo; 

-- 5:
update clientes set email = "juan@gmail" and telefono = 45224556 where id_cliente = 1;

-- 6:
select id_pedido, cantidad from detallePedidos where cantidad > 3;

-- 7:
select id_pedido, descripcion, id_cliente from pedidos where descuento = 5 and descuento = 10 and descuento = 15;

-- 8:
delete from clientes where fecha_alta = "1999-01-23";

-- 9:
insert into clientes(nombre, apellido, direccion, telefono, email, fecha_alta) values("Noelia", "Aversa", "Av mosconi 212", 1891821, "noeaversa@yahoo.com", "2019-09-17");

-- 10:
select sum(precio_compra) as precioTotal from productos where codigo in(select codigo_producto from detallePedidos where id_pedido = 1);