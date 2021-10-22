CREATE DATABASE avaliacao;
USE avaliacao;
CREATE TABLE PRODUTO (
id INT auto_increment, 
nome  varchar(50) not null, 
descricao varchar(300) not null, 
descuento decimal not null, 
datainicio date not null, 
datafin date, 
primary key (id)) 
Engine = InnoDB;