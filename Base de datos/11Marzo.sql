create database colegio;
use colegio;

create table faltas(id_falta int auto_increment primary key, id_alumno int, fecha date, cantidad int);
create table alumno(id_alumno int auto_increment primary key, dni int, nombre varchar(50), direccion varchar(50), telefono int, curso varchar(7), fechaNnacimiento date);
create table notas(id_nota int auto_increment primary key, id_alumno int, id_materia int, PrimerTrim int, SegundoTrim int, TerceroTrim int, Diciembre int, marzo int);
create table materias(id_materias int auto_increment primary key, nombre varchar(50), cantHoras int, curso varchar(7), aula int);

-- 1:
delete from alumno where dni = 42845014;

-- 2:
update notas set PrimerTrim = 8 where id_alumno = 25 and id_materia = 8;

-- 3:
select nombre, cantHoras, aula from materias where curso = "3C" order by nombre;

-- 4:
delete from alumno where curso = "6C";

-- 5:
update alumnos set curso = "5C" where curso = "4C";

-- 6:
select dni, nombre, fechaNnacimiento from alumno where curso = "4C" order by fechaNnacimiento;

-- 7:
drop table notas;

-- 8:
select max(PrimerTrim) from notas where id_materia = 2;

-- 9:
select avg(diciembre) from notas where id_materia = 3;

-- 10:
insert into alumno(dni, nombre, direccion, telefono, curso, fechaNnacimiento) values(44277212, "Lola", "Av constituyentes 321", 671612, "2A", "2002-12-09");
