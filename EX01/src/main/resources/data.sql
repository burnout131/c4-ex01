DROP table IF EXISTS party;
DROP table IF EXISTS usuario;
DROP table IF EXISTS juego;

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
CONSTRAINT usuarios_fk FOREIGN KEY (usuario) REFERENCES usuario (id) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT juegos_fk FOREIGN KEY (juego) REFERENCES juego (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO usuario(nombre, password, email) VALUES ('burnout131', 'R3dF0rce', 'burnout131@gmail.com');
INSERT INTO usuario(nombre, password, email) VALUES ('Francisco', 'M3gustaPr0gramar', 'francisco@gmail.com');
INSERT INTO usuario(nombre, password, email) VALUES ('Marc', '@TiT3l0v0yAdecir', 'mark@yahoo.com');

INSERT INTO juego(titulo, descripcion) VALUES ('Minecraft', 'A game just to build things');
INSERT INTO juego(titulo, descripcion) VALUES ('Need for Speed', 'A racing cars game');
INSERT INTO juego(titulo, descripcion) VALUES ('Battlefield 1', 'a FPS game');

INSERT INTO party(nombre, descripcion, usuario, juego) VALUES ('The killers', 'Pos eso, los matadores', 1, 3);
INSERT INTO party(nombre, descripcion, usuario, juego) VALUES ('The night drivers', 'For those who love cars', 2, 2);
INSERT INTO party(nombre, descripcion, usuario, juego) VALUES ('Constructores a la fuga', 'Aficionados al Minecraft', 3, 1);
