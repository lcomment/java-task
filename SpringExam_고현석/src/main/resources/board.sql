CREATE TABLE board (
	id				INT PRIMARY KEY AUTO_INCREMENT,
	title			VARCHAR(30),
	author		VARCHAR(10),
	content		VARCHAR(100),
	createdAt	DATE DEFAULT NOW(),
	readCount	INT DEFAULT 0
);