select e2.name as Employee 
from Employee as e1 join Employee as e2
on e1.id = e2.managerId
where e1.salary<e2.salary;