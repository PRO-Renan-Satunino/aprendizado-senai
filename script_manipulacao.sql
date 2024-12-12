USE vigitech_db;

INSERT INTO Empresa (CNPJ, Nome, Status, Telefone, Email, Responsável)
VALUES ('12.345.678/0001-90', 'Vigitech Ltda.', 'Ativa', '(11) 1234-5678', 'contato@vigitech.com', 'João da Silva');

INSERT INTO funcionario (idFuncionario, Nome_Completo, Cargo, Acesso_Nível, Permissões, Senha, Email)
VALUES ('1', 'João da Silva', 'Engenheiro', 'Administrador', 'Todas', '1234', 'joaobrabo@gmail.com');

INSERT INTO sensor (idSensor, Localização, Tipo_Equipamento, Data_Atualização, Status, Funcionário_idFuncionário, Empresa_CNPJ, Setor_idSetor, Setor_Local_idLocal)
VALUES ('1', 'Interna', 'Sensor de Temperatura', '2024-06-11', 'Ativo', 1, '12.223.443.12-44', 1, 1);

INSERT INTO setor (idSetor, Nome, Status_Operacional, Telefone, Responsável, Descrição, Horario_Funcionamento, Local_idLocal)
VALUES ('1', 'Quimico', 'Ativo', '(71) 91234-1234', 'Walter White', 'Processos com produtos quimicos', '24 horas', '1');

INSERT INTO histórico (Valor, Fuso_Horário, Sensor_idSensor)
VALUES ('20.000', 'Brasilia', 'Completo');

INSERT INTO funcionario (idFuncionario, Nome_Completo, Cargo, Acesso_Nível, Permissões, Senha, Email)
VALUES ('2', 'Maicon Silva', 'Engenheiro Quimico', 'Administrador', 'Todas', '1234', 'maiconlorenz@gmail.com');

INSERT INTO funcionario (idFuncionario, Nome_Completo, Cargo, Acesso_Nível, Permissões, Senha, Email)
VALUES ('3', 'João Junior', 'Operador de Maquinas', 'Operacional', 'Minimas', '1234', 'jaojr@gmail.com');

INSERT INTO local (idLocal, Capacidade, Status_Ativo, Tipo_Local, Rua, Bairro, Cidade, CEP, Empresa_CNPJ)
VALUES ('1', '500', 'Ativo', 'N/A', 'Rua 2 de Julho', 'Liberdade', 'Salvador', '40.335-460', '12.222.334.44-4');

CREATE VIEW vw_Empresas AS
SELECT CNPJ, Nome, Telefone, Email, Responsável, Status
FROM Empresa;

CREATE VIEW vw_Local AS
SELECT idLocal, Capacidade, Status_Ativo, Tipo_Local, Rua, Bairro, Cidade, CEP, Empresa_CNPJ
FROM Local;

CREATE VIEW vw_SensorAtivo AS
SELECT Localização, Tipo_Equipamento, Data_Atualização, Status, Funcionário_idFuncionário, Empresa_CNPJ, Setor_idSetor, Setor_Local_idLocal
FROM sensor;

CREATE VIEW vw_setor AS
SELECT idSetor, Nome, Status_Operacional, Telefone, Responsável, Descrição, Horario_Funcionamento, Local_idLocal
FROM setor;

CREATE VIEW vw_Funcionarios AS
SELECT idFuncionario, Nome_Completo, Cargo, Acesso_Nível, Permissões, Email
FROM funcionario;

SELECT * FROM vw_funcionarios;
SELECT * FROM vw_empresas;
SELECT * FROM vw_sensorativo;
SELECT * FROM vw_setor;

INSERT INTO Empresa (CNPJ, Nome, Status, Telefone, Email, Responsável)
VALUES ('12.365.333/0001-91', 'Ford', 'Inativa', '(11) 1234-5622', 'contato@ford.com', 'João da Silva');

DELETE FROM Empresa WHERE Status = 'Inativa';
