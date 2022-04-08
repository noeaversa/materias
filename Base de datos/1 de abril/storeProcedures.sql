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
create procedure clientesConfiguracion()
begin
select * from clientes where id_cliente > 2 and id_cliente in(select id_cliente from pedidos); 
/* otra manera de hacerlo: 
select * from clientes where id_cliente in(select id_cliente from(select id_cliente from pedidos group by id_cliente having id_cliente > 2 as ids_pedidos);
*/
end //

DELIMITER ;
call clientesConfiguracion();
