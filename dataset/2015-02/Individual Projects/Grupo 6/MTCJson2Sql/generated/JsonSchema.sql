   
CREATE DATABASE databaseTest;
 
 
CREATE TABLE puntajes (
  _id int PRIMARY KEY AUTO_INCREMENT
    ,
  type varchar(1000) 
   ,
  puntaje tinyint(1) 
   ,
  student_id int 
 
);


CREATE TABLE student (
  _id int PRIMARY KEY AUTO_INCREMENT
    ,
  nombre varchar(1000) 
 
);


ALTER TABLE puntajes
 ADD CONSTRAINT `fk_puntajes_student`
  FOREIGN KEY (student_id)
    REFERENCES student(_id)
      ON DELETE CASCADE;
