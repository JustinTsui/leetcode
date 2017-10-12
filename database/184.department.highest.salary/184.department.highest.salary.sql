SELECT
d.Name Department,
e.Name Employee,
e.Salary
FROM Employee e JOIN Department d ON d.Id = e.DepartmentId
WHERE (e.DepartmentId, e.Salary) IN (
SELECT
DepartmentId,
max(Salary)
FROM Employee
GROUP BY DepartmentId
)