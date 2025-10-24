DROP DATABASE IF EXISTS Life_database;
CREATE DATABASE Life_database
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_0900_ai_ci;

USE Life_database;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255) NOT NULL UNIQUE,
  full_name VARCHAR(255) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Seed data (example users)
INSERT INTO users (email, full_name) VALUES
('alice@example.com','Alice Adams'),
('bob@example.com','Bob Brown');