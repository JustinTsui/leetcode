select Name Employee from (
  select
    Name,
    Salary,
    (select Salary from Employee ie where ie.Id = e.ManagerId) manager_salary
  from Employee e
) t
where Salary > manager_salary