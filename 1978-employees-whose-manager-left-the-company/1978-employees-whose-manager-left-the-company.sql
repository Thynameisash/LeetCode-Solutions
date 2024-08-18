SELECT employee_id  from Employees
WHERE manager_id  NOT IN (SELECT employee_id from Employees)
AND salary<30000
ORDER BY employee_id 
