CREATE DATABASE  IF NOT EXISTS `proyecto-integrador`;
USE `proyecto-integrador`;

CREATE TABLE `categorias` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idCategoria`)
);

CREATE TABLE `habitaciones` (
  `idHabitacion` int(11) NOT NULL,
  `precioPorDia` double NOT NULL,
  `capacidad` int(11) NOT NULL,
 `disponibilidad` tinyint(4) NOT NULL,
  PRIMARY KEY (`idHabitacion`)
);

CREATE TABLE `huespedes` (
  `dni` varchar(50) NOT NULL,
  `nombre` varchar(45) NOT NULL,
 `apellido` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL
);

CREATE TABLE `reservas` (
  `habitacion` varchar(3) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaEgreso` date NOT NULL,
  `cantPersonas` int(11) NOT NULL
);



CREATE TABLE `usuarios` (
  `dni` varchar(50) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(45) NOT NULL,
   PRIMARY KEY (`dni`)
);

CREATE TABLE servicios
(   idServicios int unsigned auto_increment not null,
    descripcion varchar(50) not null,
    precio double not null,
    PRIMARY KEY(idServicios)
);

 