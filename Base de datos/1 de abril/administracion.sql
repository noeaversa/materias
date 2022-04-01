use administracion;

-- 1:
select pedidos.id_pedido, pedidos.descripcion, pedidos.fecha_entrega, detallespedidos.codigo_producto from pedidos, detallespedidos where pedidos.id_cliente in(select id_cliente from clientes);

-- 2:
select pedidos.*, clientes.nombre, clientes.apellido from pedidos, clientes;

-- 3:
select clientes.id_cliente, clientes.nombre, clientes.apellido, pedidos.id_pedido, pedidos.descripcion, detallespedidos.codigo_producto, detallespedidos.cantidad from detallespedidos, pedidos, clientes;

-- 4.
select * from clientes where id_cliente not in(select id_cliente from pedidos);

-- 5:
select * from clientes where id_cliente in(select id_cliente from pedidos where id_pedido in(select id_pedido from detallespedidos where cantidad < 5));

-- 6:
select * from detallespedidos where id_pedido in(select id_pedido from pedidos where descuento = 5);

-- 7.
 select * from pedidos where descuento in(select max(descuento) from pedidos);
 
 -- 8:
  select * from pedidos where descuento in(select min(descuento) from pedidos);
  
  -- 9:
  select * from clientes where id_cliente in(select id_cliente from pedidos);
  
  -- 10:

-- 11:
select * from pedidos where id_pedido in(select id_pedido from detallespedidos where cantidad > 3);

-- 12:
select *, datediff(fecha_compra, fecha_entrega) from pedidos group by id_pedido;

-- 13:
select * from clientes where id_cliente in(select id_cliente from pedidos where datediff(fecha_compra, fecha_entrega) > 3650);

-- 14:
select sum(precio_compra) from productos group by producto; 

-- 15:
select * from pedidos where id_pedido in(select id_pedido from detallespedidos where precio_venta > 3500);

-- 16:
select * from detallespedidos group by codigo_producto;

-- 17:
select codigo from productos where precio_compra in(select max(precio_compra) from productos);

-- 18 a:
select max(cantidad), min(cantidad), avg(cantidad) from detallespedidos group by id_pedido;

-- 18 b:
select max(cantidad), min(cantidad), avg(cantidad) from detallespedidos group by codigo_producto;

-- 19:
select nombre from clientes where id_cliente in(select id_cliente from pedidos where id_pedido in(select id_pedido from detallespedidos where precio_venta > 3000));
