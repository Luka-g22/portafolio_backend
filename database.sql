-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`persona` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `fechaNac` DATE NULL,
  `telefono` VARCHAR(15) NULL,
  `email` VARCHAR(45) NULL,
  `sobreMi` VARCHAR(200) NULL,
  `fotoUrl` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`experiencia_laboral`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`experiencia_laboral` (
  `id` INT NOT NULL,
  `nombreEmpresa` VARCHAR(45) NULL,
  `fechaInicio` DATE NULL,
  `esTrabajoActual` TINYINT NULL,
  `fechaFin` DATE NULL,
  `descripcion` VARCHAR(200) NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`),
  INDEX `fk_experiencia_laboral_persona1_idx` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `fk_experiencia_laboral_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `mydb`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`certificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`certificacion` (
  `id` INT NOT NULL,
  `certificacion` VARCHAR(200) NULL,
  `fechaInicio` DATE NULL,
  `enCurso` TINYINT NULL,
  `fechaFin` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`habilidades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`habilidades` (
  `id` INT NOT NULL,
  `lenguaje` VARCHAR(45) NULL,
  `herramienta` VARCHAR(45) NULL,
  `framework` VARCHAR(45) NULL,
  `habilidadBlanda` VARCHAR(45) NULL,
  `persona_id` INT NOT NULL,
  `certificacion_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`, `certificacion_id`),
  INDEX `fk_habilidades_persona1_idx` (`persona_id` ASC) VISIBLE,
  INDEX `fk_habilidades_certificacion1_idx` (`certificacion_id` ASC) VISIBLE,
  CONSTRAINT `fk_habilidades_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `mydb`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_habilidades_certificacion1`
    FOREIGN KEY (`certificacion_id`)
    REFERENCES `mydb`.`certificacion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Educacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Educacion` (
  `id` INT NOT NULL,
  `establecimiento` VARCHAR(45) NULL,
  `fechaInicio` DATE NULL,
  `enCurso` TINYINT NULL,
  `fechaFin` DATE NULL,
  `descripcion` VARCHAR(200) NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`),
  INDEX `fk_Educacion_persona1_idx` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `fk_Educacion_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `mydb`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
