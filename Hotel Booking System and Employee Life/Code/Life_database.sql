DROP DATABASE IF EXISTS Life_database;
CREATE DATABASE Life_database
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_0900_ai_ci;

USE Life_database;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  full_name VARCHAR(255) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Seed data (example users)
INSERT INTO users(full_name) VALUES  
('Alice Adams'),
('Bob Brown'),
('John Doe'),
('Jane Smith'),
('Michael Johnson'),
('Emily Davis');