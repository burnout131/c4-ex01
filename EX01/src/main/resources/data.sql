/*DROP table IF EXISTS usuario;
DROP table IF EXISTS juego;
DROP table IF EXISTS party;*/

CREATE TABLE usuario(
id int auto_increment primary key,
nombre varchar(250),
password varchar(250),
email varchar(250)
);

CREATE TABLE juego(
id int auto_increment primary key,
titulo varchar(250),
descripcion varchar(250)
);

CREATE TABLE party(
id int auto_increment primary key,
nombre varchar(250),
descripcion varchar(250),
usuario int,
juego int,
CONSTRAINT usuarios_fk FOREIGN KEY (usuario) REFERENCES usuario (id),
CONSTRAINT juegos_fk FOREIGN KEY (juego) REFERENCES juego (id)
);