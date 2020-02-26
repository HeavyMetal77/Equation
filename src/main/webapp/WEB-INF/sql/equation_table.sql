CREATE DATABASE IF NOT EXISTS `equation_directory`;
USE `equation_directory`;

DROP TABLE IF EXISTS `equation`;

CREATE TABLE `equation`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `a`           int(11) DEFAULT NULL,
    `b`           int(11) DEFAULT NULL,
    `c`           int(11) DEFAULT NULL,
    `x1`           int(11) DEFAULT NULL,
    `x2`           int(11) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = latin1;
