CREATE DATABASE IF NOT EXISTS dbpontoeletronicospring
	CHARACTER SET utf8mb4
	COLLATE utf8mb4_0900_ai_ci;

USE dbpontoeletronicospring;

CREATE TABLE departamento(
	departamento_id INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(departamento_id),
	nome VARCHAR(255)
);
	
CREATE TABLE funcionario(
	funcionario_id INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(funcionario_id),
	nome VARCHAR(255),
	cpf VARCHAR(255),
	email VARCHAR(255),
	senha VARCHAR(255),
	departamento_id INT NOT NULL,
	
	CONSTRAINT fk_departamento_id
	FOREIGN KEY (departamento_id)
	REFERENCES departamento (departamento_id)
);

INSERT INTO departamento (nome)
	VALUES ("Recursos humanos"),
	("Relacionamento com cliente"),
	("Desenvolvimento"),
	("Marketing");
INSERT INTO funcionario (nome, cpf, email, senha, departamento_id)
	VALUES ("Elo","12312312312","elo@gmail.com","123",1),
	("Joao","32132132132","joao@gmail.com","123",2),
	("Marcio","11122233344","marcio@gmail.com","123",3);

