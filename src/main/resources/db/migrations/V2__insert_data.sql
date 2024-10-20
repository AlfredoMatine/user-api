-- V2__insert_data.sql

INSERT INTO "user"."user" (nome, cpf, endereco, email, telefone, data_cadastro)
VALUES 
    ('Nome 1', '123.456.789-00', 'Endereço 1', 'email1@example.com', '123456789', NOW()),
    ('Nome 2', '987.654.321-00', 'Endereço 2', 'email2@example.com', '987654321', NOW());
