create database animales;
use animales;

create table mascotas(id_mascota int auto_increment primary key, edad int, peso int, id_vet int);
create table veterenarios(id_vet int auto_increment primary key, telefono int);
create table dueños(id_dueño int auto_increment primary key, id_mascota int, nombre varchar(50));

-- 1:
select * from mascotas where edad in(select edad from mascotas group by edad);

-- 2:
select * from mascotas where peso in(select peso from mascotas group by peso);

-- 3:
select count(id_mascota) from mascotas where edad in(select edad from mascotas group by edad);

-- 4:
select count(id_mascota) from mascotas where peso in(select peso from mascotas group by peso);

-- 5:
select sum(peso) from mascotas where edad > 5 and edad < 10;

-- 6:
select avg(peso) from mascotas; 

delimiter //

-- 7:
create procedure cantidadMascotas(in id_amo int, out cantidad int)
	begin
	    select count(id_mascota) into cantidad from dueño where id_dueño = id_amo;
	end //

-- 8:
create procedure pesaMasDe15KG(in id_masc int)
    begin
        declare peso_mascota int;
        declare texto varchar(189);
        select peso into peso_mascota from mascotas where id_masc = id_mascota;
        
        if(peso_mascota > 15) then
            set texto = 'pesa mas de 15KG';
        else 
            set texto = 'no pesa mas de 15KG';
        end if;
        
        select texto;
    end //

-- 9:
create procedure datosVeterinario(in id_veterinario int)
    begin
        select * from veterenarios where id_vet = id_veterinario;
    end //

-- 10:
create procedure pesoMayorOIgual(in pesoIngresado int)
    begin
        select * from mascotas where pesoIngresado >= peso;
    end //
delimiter ;

call pesoMayorOIgual(6);




