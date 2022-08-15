CREATE TABLE `stc2210`.`phones` (
  `id` INT NOT NULL,
  `manufacturer` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `price` INT NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`id`));


INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('1', 'Apple', 'iPhone 13', '100000', '5');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('2', 'Apple', 'iPhone 12', '90000', '4');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('3', 'Apple', 'iPhone XR', '40000', '10');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('4', 'Samsung', 'Galaxy Note S10', '120000', '5');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('5', 'Samsung', 'A310', '30000', '8');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('6', 'Samsung', 'Fold', '200000', '2');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('7', 'Realme', 'X31', '40000', '15');
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('8', 'Motorola', 'E398', '50000', '3');

--
CREATE DEFINER=`root`@`localhost` PROCEDURE `find_all_phones`()
BEGIN
	SELECT * FROM stc2210.phones;
END


-- 
CREATE DEFINER=`root`@`localhost` PROCEDURE `find_the_most_expensive_phone`()
BEGIN
	SELECT * FROM stc2210.phones WHERE price = (SELECT MAX(price) FROM stc2210.phones);
END

--
CREATE DEFINER=`root`@`localhost` PROCEDURE `find_phones_in_range`(IN first_price INTEGER, IN second_price INTEGER)
BEGIN
	IF first_price > second_price
    THEN
		SELECT * FROM stc2210.phones WHERE price BETWEEN second_price AND first_price;
	ELSE
		SELECT * FROM stc2210.phones WHERE price BETWEEN first_price AND second_price;
	END IF;
END

--
CREATE DEFINER=`root`@`localhost` PROCEDURE `add_phone`(IN id INTEGER, IN manufacturer VARCHAR(45), IN model VARCHAR(45), IN price INTEGER, IN quantity INTEGER)
BEGIN
INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`)
VALUES (id, manufacturer, model, price, quantity);
END

--
CREATE DEFINER=`root`@`localhost` FUNCTION `find_max_id`() RETURNS int
    DETERMINISTIC
BEGIN
	DECLARE maxID INT;
    SELECT MAX(id) INTO maxID from stc2210.phones;
	RETURN maxID;
END

--
CREATE DEFINER=`root`@`localhost` PROCEDURE `add_phone_without_id`(IN manufacturer VARCHAR(45), IN model VARCHAR(45), IN price INTEGER, IN quantity INTEGER)
BEGIN
	DECLARE id INT;
    SET id = stc2210.find_max_id() + 1;
    
	INSERT INTO `stc2210`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`)
	VALUES (id, manufacturer, model, price, quantity);
END

--
CREATE DEFINER=`root`@`localhost` PROCEDURE `make_discount`()
BEGIN
	UPDATE stc2210.phones
    SET price = price * 0.9
	WHERE quantity > 0 AND quantity < 5;
END