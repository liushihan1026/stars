DROP TABLE IF EXISTS TEST.USERS;

CREATE TABLE IF NOT EXISTS TEST.USERS(
  `ID` VARCHAR(256) ,
  `NAME` VARCHAR(256),
  `PASSWORD` VARCHAR(256),
  `AGE` VARCHAR(256),
  `ADDRESS` VARCHAR(256),
  PRIMARY KEY ( `ID` )
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO USERS (ID, NAME, PASSWORD, AGE, ADDRESS) VALUES (uuid(), 'San Francisco', '88888888', '26', 'US');