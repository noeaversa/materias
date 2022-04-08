use colegio;

delimiter //
-- 1:
create procedure areaRectangulo(in base int, in altura int)
begin
	declare area int;
    set area = base * altura;
    select area;
end //

-- 2:
create procedure es_positivoYMayor100 (in numero int)
begin
	declare texto varchar(50);
		if(numero > 100) then 
			set texto = "es positivo y mayor a 100";
		elseif(numero > 0) then
			set texto = "es positivo, pero menor a 100";
		end if;
	select texto;
end //

-- 3:
create procedure calculo_promedio(in n1 int, in n2 int, in n3 int)
begin
	declare promedio int;
    set promedio = (n1 + n2 + n3) / 3;
    select promedio;
end //
delimiter ;
	
    
    