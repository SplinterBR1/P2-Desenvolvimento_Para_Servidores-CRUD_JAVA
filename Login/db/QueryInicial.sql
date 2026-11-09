CREATE DATABASE bd_Login;

Use bd_Login;

CREATE TABLE Usuario(
    usuario varchar(10) primary key,
    nome varchar(30) default '',
    senha char(32) default ''
);
