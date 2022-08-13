-- Вывести среднюю цену за телефоны
SELECT AVG(price) FROM phones

-- Агрегатные функции
SELECT MIN(price) FROM phones
SELECT MAX(price) FROM phones
SELECT SUM(price) FROM phones
SELECT COUNT(price) FROM phones

-- Нахождение максимальной цены
SELECT price FROM phones
ORDER BY price
DESC
LIMIT 1

SELECT MAX(price) FROM phones

-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones WHERE price = (SELECT MAX(price) FROM phones)

-- 1) SELECT MAX(price) FROM phones == 140000
-- 2) SELECT * FROM phones WHERE price = 140000

-- Вывести информацию телефонах с ценой выше средней
SELECT * FROM phones WHERE price >= (SELECT AVG(price) FROM phones)

-- Вывести "настоящую" среднюю цену
SELECT SUM(price * quantity)/SUM(quantity) AS median FROM phones

-- Вывести список производителей
SELECT DISTINCT(manufacturer) FROM phones

-- Вывести количество производителей
SELECT COUNT(DISTINCT(manufacturer)) FROM phones

-- Вывести среднее значение цены по производителям
SELECT manufacturer, ROUND(AVG(price),2) FROM phones
GROUP BY manufacturer

-- Вывести среднее значение цены по производителям телефонов. Вывести только тех, у кого AVG(price) больше 50000
SELECT manufacturer, ROUND(AVG(price),2) FROM phones
GROUP BY manufacturer
HAVING AVG(price) > 50000
ORDER BY ROUND(AVG(price),2)
DESC

-- Вывести информацию о телефонах "красиво" :)
SELECT CONCAT(manufacturer, ' ' , model), price, quantity FROM phones

-- JOIN
SELECT * FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
	
-- Вывести имя товара, информацию о цене и производителе
SELECT pd.name, pc.value, pc.discount, mn.name, mn.location FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
	

-- LEFT/RIGHT JOIN
SELECT * FROM products pd 
	RIGHT JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	
SELECT * FROM manufacturers mn 
	LEFT JOIN products pd ON mn.id = pd.manufacturer_id
	
SELECT * FROM products pd 
	LEFT JOIN prices pc ON pd.id = pc.product_id

-- Вывести только товары производителей из Москвы и с ценой больше 7000
SELECT pd.name, pc.value, pc.discount, mn.name, mn.location FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
WHERE mn.location = 'Moscow' AND pc.value > 7000

SELECT pd.name, pc.value, pc.discount, mn.name, mn.location FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id AND mn.location = 'Moscow'
	JOIN prices pc ON pc.product_id = pd.id AND pc.value > 7000
	
-- Вывести среднюю цену по производителям
SELECT mn.name, ROUND(AVG(pc.value),2) FROM products pd
	JOIN manufacturers mn ON mn.id = pd.manufacturer_id
	JOIN prices pc ON pc.product_id = pd.id
GROUP BY mn.name
ORDER BY mn.name

-- Вывести информацию о производителях без товаров
SELECT * FROM manufacturers mn 
	LEFT JOIN products pd ON mn.id = pd.manufacturer_id
WHERE pd.id IS null
	