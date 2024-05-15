-- Active: 1712506431166@@127.0.0.1@3306
DROP DATABASE IF EXISTS elgusanito;
CREATE DATABASE elgusanito CHARSET utf8mb4;
USE elgusanito;
CREATE TABLE usuario (
    IDUsuario INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20),
    nombreUsuario VARCHAR(20),
    contrasenia VARCHAR(100) -- Longitud suficiente para almacenar contraseñas encriptadas
);
CREATE TABLE publicacion (
    IDPublicacion INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    mensajeUsuario TEXT,
    fechaSubida DATE,
    IDUsuario INT UNSIGNED,
    FOREIGN KEY (IDUsuario) REFERENCES usuario(IDUsuario)
);
INSERT INTO usuario (nombreUsuario, contrasenia) VALUES ('admin', 'admin'); 