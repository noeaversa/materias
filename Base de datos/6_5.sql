create database compras;
use compras;

DELIMITER //

-- 1:
create procedure PrecioMayorAlPromedio(out cantidadProductos int)
Begin
    select * from products where buyPrice > avg(buyPrice);
    select buyPrice into cantidadProductos from products where buyPrice > avg(buyPrice);
    
end //

-- 2:
create procedure existeElOrdenNumber(in orderNumberIn int, out filasOrderNumber int)
Begin
    select count(orderNumber) into filasOrderNumber from orders where orderNumberIn = orderNumber;
    delete from orders where orderNumber = orderNumberIn;
end //

-- 3:
create procedure borrarLinea()
Begin
end //

DELIMITER ;
