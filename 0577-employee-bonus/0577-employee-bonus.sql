# Write your MySQL query statement below
# select Employee.name, Bonus.bonus from Employee inner join  Bonus
# on Employee.empId=Bonus.empId 
# where Bonus.bonus is null or Bonus.bonus<1000

select e.name, b.bonus
from Employee as e
left join Bonus as b
on e.empId=b.empId 
where b.bonus<1000 or b.bonus is null