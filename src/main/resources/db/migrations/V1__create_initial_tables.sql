-- V1 - Criação das tabelas iniciais

CREATE TABLE tb_personagens (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    desenho VARCHAR(255),
    idade INT,
    genero VARCHAR(50)
);

CREATE TABLE tb_carros (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_carro VARCHAR(255) NOT NULL,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    ano INT,
    personagem_id BIGINT,
    FOREIGN KEY (personagem_id) REFERENCES tb_personagens(id)
);
