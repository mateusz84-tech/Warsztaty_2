CREATE DATABASE workspace;
USE workspace;
CREATE TABLE user(
                     id INT AUTO_INCREMENT,
                     userName VARCHAR(255),
                     email VARCHAR(255) UNIQUE ,
                     password VARCHAR(60),
                     PRIMARY KEY (id)
);