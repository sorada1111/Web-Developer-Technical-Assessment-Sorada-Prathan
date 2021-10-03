CREATE TABLE `user` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `first_name` VARCHAR(100) NULL,
  `last_name` VARCHAR(100) NULL,
  `username` VARCHAR(100) NULL,
  `photo` mediumblob,
  PRIMARY KEY (`id`)
  );
  
INSERT INTO user VALUES(1,'Gary','Klein','ArkinHeeler',LOAD_FILE('C:\img\img1.jpeg'));
INSERT INTO user VALUES(2,'Mitchell','Le','Theomachy',LOAD_FILE('C:\img\img2.jpeg'));
INSERT INTO user VALUES(3,'Liza','Schaefer','ParitOose',LOAD_FILE('C:\img\img3.jpeg'));
INSERT INTO user VALUES(4,'Ammaar','Walmsley','Imbrute',LOAD_FILE('C:\img\img4.jpeg'));
INSERT INTO user VALUES(5,'Deborah','Hayes','Heterochrony',LOAD_FILE('C:\img\img5.jpeg'));
INSERT INTO user VALUES(6,'Ada','Macdonald','Satisfice',LOAD_FILE('C:\img\img6.jpeg'));
INSERT INTO user VALUES(7,'Brianna','Best','Aardwolf',LOAD_FILE('C:\img\img7.jpeg'));
INSERT INTO user VALUES(8,'Marlene','Clayton','Punctule',LOAD_FILE('C:\img\img8.jpeg'));
INSERT INTO user VALUES(9,'Corinne','Gray','Epiphora',LOAD_FILE('C:\img\img9.jpeg'));
INSERT INTO user VALUES(10,'Nikki','Hubbard','Astrogeology',LOAD_FILE('C:\img\img10.jpeg'));




