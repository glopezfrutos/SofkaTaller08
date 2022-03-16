-- -----------------------------------------------------
-- Schema contact_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `contact_db` DEFAULT CHARACTER SET utf8 ;
USE `contact_db` ;

-- -----------------------------------------------------
-- Table `contact_db`.`contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `contact_db`.`contact` (
  `cont_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `cont_first_name` VARCHAR(25) NOT NULL,
  `cont_last_name` VARCHAR(25) NOT NULL,
  `cont_email` VARCHAR(45) NOT NULL,
  `cont_date_of_birth` DATE NOT NULL,
  `cont_is_deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`cont_id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Data input into `contact` table
-- -----------------------------------------------------
INSERT INTO `contact` (cont_first_name, cont_last_name, cont_email, cont_date_of_birth)
VALUES
  ('Catherine','Pittman','proin@aol.edu','1991-01-09'),
  ('Xantha','Cortez','tellus@yahoo.ca','1996-06-24'),
  ('Maris','Fitzgerald','ultrices.duis@protonmail.edu','1968-04-12'),
  ('Leigh','Alston','condimentum.donec.at@hotmail.net','1985-02-21'),
  ('Yuri','Cantrell','congue.a@icloud.com','1968-02-21'),
  ('McKenzie','Massey','nunc@aol.org','2002-07-04'),
  ('Mollie','Nieves','cras.convallis.convallis@yahoo.net','1982-05-11'),
  ('Laurel','Moses','lacus.nulla.tincidunt@protonmail.net','1975-02-24'),
  ('Wilma','Estes','consectetuer.adipiscing@icloud.net','1949-02-03'),
  ('Nerea','Pacheco','faucibus.leo@protonmail.edu','1969-08-13');

INSERT INTO `contact` (cont_first_name, cont_last_name, cont_email, cont_date_of_birth)
VALUES
  ('Kasper','Gilbert','orci.quis@protonmail.couk','1979-01-28'),
  ('Akeem','Frank','imperdiet.nec.leo@google.com','1929-03-30'),
  ('Libby','Yang','vitae.erat@google.net','1975-12-23'),
  ('Marvin','Owens','urna@aol.com','1924-02-29'),
  ('Hedley','Knapp','duis.cursus.diam@yahoo.net','1964-10-06'),
  ('Wyoming','Bentley','integer.in@icloud.net','1995-04-15'),
  ('Jamal','Shields','sed.tortor.integer@icloud.com','1930-09-11'),
  ('Yoshi','Kirkland','sodales.mauris@hotmail.edu','1990-09-23'),
  ('Donovan','Adkins','magnis.dis@protonmail.org','1999-05-08'),
  ('Judah','Mcleod','phasellus@hotmail.com','1930-06-10');
INSERT INTO `contact` (cont_first_name, cont_last_name, cont_email, cont_date_of_birth)
VALUES
  ('Cherokee','English','pellentesque@protonmail.edu','1935-07-05'),
  ('Lilah','Pollard','metus@outlook.org','1929-02-17'),
  ('Rose','Spencer','est.mauris@outlook.org','1968-04-23'),
  ('Diana','Chang','pellentesque.eget.dictum@hotmail.org','1977-08-28'),
  ('Karleigh','Duffy','cubilia@protonmail.ca','1931-07-03'),
  ('Gray','Ross','elit.a@icloud.org','1948-09-25'),
  ('Mufutau','Galloway','in@yahoo.org','1982-10-12'),
  ('Melyssa','Rodriquez','ornare.sagittis.felis@google.ca','1993-03-31'),
  ('Xander','Hopkins','ultrices@aol.couk','1921-04-05'),
  ('Thor','Noble','urna.nec.luctus@outlook.couk','1934-03-29');
INSERT INTO `contact` (cont_first_name, cont_last_name, cont_email, cont_date_of_birth)
VALUES
  ('Jena','Marshall','rhoncus.donec@icloud.edu','1993-11-09'),
  ('Forrest','Savage','sit.amet@yahoo.net','1987-02-22'),
  ('Zeph','Leach','velit.quisque.varius@aol.net','1966-05-03'),
  ('Maya','Shepherd','ut.molestie.in@hotmail.couk','1952-02-17'),
  ('Kaseem','Carr','tortor@outlook.edu','1954-10-13'),
  ('Gannon','Barber','neque@outlook.org','1991-12-22'),
  ('Jeremy','Bolton','montes.nascetur@icloud.net','1994-01-15'),
  ('Asher','Spencer','lectus@outlook.net','1920-09-05'),
  ('Rosalyn','Vaughan','nibh.quisque.nonummy@outlook.edu','1988-12-01'),
  ('Brennan','Parsons','eget.massa@yahoo.org','1938-06-03');
INSERT INTO `contact` (cont_first_name, cont_last_name, cont_email, cont_date_of_birth)
VALUES
  ('Paloma','Johns','ipsum@yahoo.org','1927-12-12'),
  ('Sean','Mejia','mi.tempor@yahoo.ca','1934-06-24'),
  ('Myra','Carroll','elit.pede@outlook.ca','1948-08-31'),
  ('Cain','Sexton','cras@outlook.com','1966-01-15'),
  ('Olga','Ward','lorem.ipsum@yahoo.ca','1967-03-06'),
  ('Lucius','Hardin','arcu.sed.et@hotmail.couk','1958-04-03'),
  ('Jayme','Bean','interdum.ligula.eu@outlook.edu','1976-08-20'),
  ('Hadassah','Garza','elit.a.feugiat@hotmail.ca','1942-10-18'),
  ('Frances','Mueller','nulla.donec.non@outlook.com','1998-03-08'),
  ('Libby','Cotton','proin.non@outlook.ca','1981-07-22');