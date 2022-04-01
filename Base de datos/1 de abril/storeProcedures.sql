use administracion;

DELIMITER //
create procedure datosClientes()
begin 
select * from clientes;
end //

DELIMITER ;
call datosClientes();

DELIMITER //
create procedure datosProductos()
begin 
select * from productos;
end //

DELIMITER ;
call datosProductos();

DELIMITER //
create procedure numeroCliente(IN idC int, OUT idOut int)
begin
select * from cliente where id_cliente = idC;
end //

DELIMITER ;
call numeroCliente(12);

DELIMITER // 
create procedure clientesConfiguracion(in clientesIn int)
begin
select * from clientes where clientesIn = id_cliente and id_cliente in(select id_cliente from pedidos);
end //

DELIMITER ;
call clientesConfiguracion(56);
