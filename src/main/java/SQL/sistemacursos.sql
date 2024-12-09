CREATE DATABASE sistema_cursos;
USE sistema_cursos;

CREATE TABLE tb_usuarios (
codigo int auto_increment primary key,
nomeusu varchar(200) not null,
emailusu varchar(200),
usuario varchar(50) not null,
senha varchar(200) not null,
admusu bool default false
);

select * from tb_usuarios;

insert into tb_usuarios
(nomeusu, emailusu, usuario, senha) values
("aluno", "aluno@gams.com", "aluno", "senhaA");

select * from tb_usuarios;

insert into tb_usuarios
(nomeusu, emailusu, usuario, senha) values
("professor", "prof@gams.com", "professor", "senhaP");

SELECT * FROM tb_usuarios;