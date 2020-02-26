CREATE DATABASE IF NOT EXISTS `equation_directory`;
USE `equation_directory`;

DROP TABLE IF EXISTS `equation`;

CREATE TABLE `equation`
(
    `id`          int  NOT NULL AUTO_INCREMENT,
    `a`           DOUBLE         DEFAULT NULL,
    `b`           DOUBLE        DEFAULT NULL,
    `c`           DOUBLE      DEFAULT NULL,
    `x1`          DOUBLE      DEFAULT NULL,
    `x2`          DOUBLE     DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = latin1;
