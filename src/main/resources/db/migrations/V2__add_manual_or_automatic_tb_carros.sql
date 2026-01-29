-- V2 - Migration para adicionar manual ou automatico na tabela tb_carros

ALTER TABLE tb_carros
ADD COLUMN cambio VARCHAR(255);