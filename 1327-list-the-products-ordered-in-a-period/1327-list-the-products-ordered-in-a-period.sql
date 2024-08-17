SELECT product_name, SUM(unit) AS unit
FROM Products 
LEFT JOIN Orders 
ON Products.product_id = Orders.product_id 
WHERE Orders.order_date >= '2020-02-01' 
AND Orders.order_date <= '2020-02-29'
GROUP BY product_name
HAVING unit>=100;
