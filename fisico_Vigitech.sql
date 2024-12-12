-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema vigitech_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vigitech_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vigitech_db` DEFAULT CHARACTER SET utf8 ;
USE `vigitech_db` ;

-- -----------------------------------------------------
-- Table `vigitech_db`.`Empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vigitech_db`.`Empresa` (
  `CNPJ` VARCHAR(45) NOT NULL,
  `Nome` VARCHAR(45) NULL,
  `Status` VARCHAR(45) NULL,
  `Telefone` VARCHAR(45) NULL,
  `Email` VARCHAR(45) NULL,
  `Responsável` VARCHAR(45) NULL,
  PRIMARY KEY (`CNPJ`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vigitech_db`.`Local`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vigitech_db`.`Local` (
  `idLocal` INT AUTO_INCREMENT NULL,
  `Capacidade` INT NULL,
  `Status_Ativo` VARCHAR(45) NULL,
  `Tipo_Local` VARCHAR(45) NULL,
  `Rua` VARCHAR(45) NULL,
  `Bairro` VARCHAR(45) NULL,
  `Cidade` VARCHAR(45) NULL,
  `CEP` CHAR(8) NULL,
  `Empresa_CNPJ` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idLocal`),
  INDEX `fk_Local_Empresa1_idx` (`Empresa_CNPJ` ASC),
  CONSTRAINT `fk_Local_Empresa1`
    FOREIGN KEY (`Empresa_CNPJ`)
    REFERENCES `vigitech_db`.`Empresa` (`CNPJ`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vigitech_db`.`Funcionário`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vigitech_db`.`Funcionário` (
  `idFuncionário` INT NULL,
  `Nome_Completo` VARCHAR(45) NULL,
  `Cargo` VARCHAR(45) NULL,
  `Acesso_Nível` VARCHAR(45) NULL,
  `Permissões` VARCHAR(45) NULL,
  `Senha` VARCHAR(45) NULL,
  `Email` VARCHAR(45) NULL,
  PRIMARY KEY (`idFuncionário`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vigitech_db`.`Setor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vigitech_db`.`Setor` (
  `idSetor` INT NOT NULL AUTO_INCREMENT, 
  `Nome` VARCHAR(45) NULL,
  `Status_Operacional` VARCHAR(45) NULL,
  `Telefone` CHAR(15) NULL, 
  `Responsável` VARCHAR(45) NULL,
  `Contato` VARCHAR(45) NULL,
  `Descrição` TEXT NULL, 
  `Horario_Funcionamento` VARCHAR(45) NULL,
  `Local_idLocal` INT NOT NULL,
  PRIMARY KEY (`idSetor`, `Local_idLocal`),
  INDEX `fk_Setor_Local1_idx` (`Local_idLocal`),  
  CONSTRAINT `fk_Setor_Local1`
    FOREIGN KEY (`Local_idLocal`)
    REFERENCES `vigitech_db`.`Local` (`idLocal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `vigitech_db`.`Sensor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vigitech_db`.`Sensor` (
  `idSensor` INT NOT NULL AUTO_INCREMENT, 
  `Localização` VARCHAR(45) NULL,
  `Tipo_Equipamento` VARCHAR(45) NULL,
  `Data_Atualização` DATETIME NULL,  
  `Status` VARCHAR(45) NULL,
  `Funcionário_idFuncionário` INT NOT NULL,
  `Empresa_CNPJ` VARCHAR(45) NOT NULL,
  `Setor_idSetor` INT NOT NULL,
  `Setor_Local_idLocal` INT NOT NULL,
  PRIMARY KEY (`idSensor`),
  INDEX `fk_Sensor_Funcionário_idx` (`Funcionário_idFuncionário`), 
  INDEX `fk_Sensor_Empresa1_idx` (`Empresa_CNPJ`), 
  INDEX `fk_Sensor_Setor1_idx` (`Setor_idSetor`, `Setor_Local_idLocal`), 
  CONSTRAINT `fk_Sensor_Funcionário`
    FOREIGN KEY (`Funcionário_idFuncionário`)
    REFERENCES `vigitech_db`.`Funcionário` (`idFuncionário`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sensor_Empresa1`
    FOREIGN KEY (`Empresa_CNPJ`)
    REFERENCES `vigitech_db`.`Empresa` (`CNPJ`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sensor_Setor1`
    FOREIGN KEY (`Setor_idSetor`, `Setor_Local_idLocal`)
    REFERENCES `vigitech_db`.`Setor` (`idSetor`, `Local_idLocal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `vigitech_db`.`Histórico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vigitech_db`.`Histórico` (
  `idHistórico` INT NOT NULL AUTO_INCREMENT,  
  `Valor` VARCHAR(45) NULL,
  `Data` DATE NULL,  
  `Horário` TIME NULL,  
  `Hora_Exata` DATETIME NULL,  
  `Fuso_Horário` VARCHAR(45) NULL,  
  `Sensor_idSensor` INT NOT NULL,
  PRIMARY KEY (`idHistórico`),  
  INDEX `fk_Histórico_Sensor1_idx` (`Sensor_idSensor`),  
  CONSTRAINT `fk_Histórico_Sensor1`
    FOREIGN KEY (`Sensor_idSensor`)
    REFERENCES `vigitech_db`.`Sensor` (`idSensor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
