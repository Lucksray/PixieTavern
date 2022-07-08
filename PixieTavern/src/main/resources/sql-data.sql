INSERT INTO `pixietavern`.`customers` (`first_name`, `surname`) VALUES 
	('jordan', 'harrison'),('bob','bob'),('Gemma','Sullen'),('Paige','Barron');

INSERT INTO `pixietavern`.`items` (`name`,`price`) VALUES 
	('Elven Clover Mead',12.00),('Dwarven Bourbon',10.00),
    ('Sunflower Mead',6.00),('Siren\'s Tears',16.00),
    ('Black Whiskey',12.00),('Black Abbey Ale',8.00),
    ('Squalid',5.00),('Glazed Roll',3.00),('Sugared Cheese',10.00),
    ('SpiceCake',16.00),('Deviled Egg',8.00),('Wine Soup',12.00),
    ('Cape of Bees',25.00),('Spyglass',12.00),('Elven Lute',30.00),
    ('Hooded Lantern',10.00),('Apprentice Spellbook',18.00),
    ('Waterskin',15.00),('Lamp Oil',8.00),('giant Eel Scarf',32.00);

INSERT INTO `pixietavern`.`logins` (`username`,`password`,`cusId`) VALUES 
	('jordan','harri',1),('Gemma','sull',3),('Paige','barr',4);
INSERT INTO `pixietavern`.`logins` (`username`,`password`,`cusId`,`privilege`) VALUES 
	('bob','bob',2,'admin');

INSERT INTO `pixietavern`.`orders` (`cusId`,`itemId`,`amount`) VALUES 
	(1,2,2),(3,15,1),(4,9,2);