-- 
SELECT * FROM phones

--
SELECT manufacturer, model, price FROM phones

--
SELECT *, price * quantity AS total FROM phones

-- Сортировка
SELECT * FROM phones 
ORDER BY price
DESC
LIMIT 5

-- Фильтрация
SELECT * FROM phones WHERE price >= 50000

SELECT * FROM phones WHERE manufacturer = 'Apple'

SELECT * FROM phones WHERE manufacturer = 'Apple' AND price > 100000

SELECT * FROM phones WHERE manufacturer = 'Apple' OR manufacturer = 'Samsung' OR manufacturer = 'Xiaomi'
SELECT * FROM phones WHERE manufacturer IN ('Apple', 'Xiaomi', 'Samsung') 

-- Вывести все телефоны от 50000 до 100000
SELECT * FROM phones WHERE price >= 50000 AND price <= 100000
SELECT * FROM phones WHERE price BETWEEN 50000 AND 100000

-- Сортировка и фильтрация
SELECT * FROM phones WHERE price BETWEEN 50000 AND 100000
ORDER BY price
DESC
LIMIT 5