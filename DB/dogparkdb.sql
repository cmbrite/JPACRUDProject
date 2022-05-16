-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dogparkdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `dogparkdb` ;

-- -----------------------------------------------------
-- Schema dogparkdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dogparkdb` DEFAULT CHARACTER SET utf8 ;
USE `dogparkdb` ;

-- -----------------------------------------------------
-- Table `dog_park`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dog_park` ;

CREATE TABLE IF NOT EXISTS `dog_park` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(2) NULL,
  `size` INT NULL,
  `open` INT NULL,
  `close` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE = '';
DROP USER IF EXISTS dogparkuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'dogparkuser'@'localhost' IDENTIFIED BY 'dogparkuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'dogparkuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
