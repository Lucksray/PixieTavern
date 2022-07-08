INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison'),('bob','bob'),('Gary','Garciea');

INSERT INTO `items` (`name`,`price`) VALUES ('Dwarven Bourbon',10.00),('Sugared Cheese',9.00);

INSERT INTO `logins` (`username`,`password`,`cusId`,`privilege`) VALUES 
	('jordan','harri',1,'custo'),('bob','bob',2,'admin');

INSERT INTO `orders` (`cusId`,`itemId`,`amount`) VALUES (1,2,2);