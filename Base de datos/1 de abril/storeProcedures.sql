use administracion;

DELIMITER //
create procedure datosClientes_Producto()
begin 
select * from clientes;
select * from productos;
end //

DELIMITER ;
call datosClientes();

DELIMITER //
create procedure numeroCliente(IN idC int)
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
