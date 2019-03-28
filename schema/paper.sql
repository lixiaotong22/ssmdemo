DROP DATABASE IF EXISTS papersystem;
CREATE DATABASE papersystem DEFAULT CHARACTER SET utf8;
USE papersystem;

##创建paper表
CREATE TABLE paper (
   paper_id   INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(30),
   number INT,
   detail  VARCHAR(23)
)ENGINE=InnoDB; 

##插入初始化数据
INSERT INTO paper (name,number,detail) 
             VALUES('机器学习',2,'mlmlmlml');
INSERT INTO paper (name,number,detail) 
             VALUES('深度学习',3,'dldldl');
INSERT INTO paper (name,number,detail) 
             VALUES('大数据',4,'bdbdbd');
COMMIT;