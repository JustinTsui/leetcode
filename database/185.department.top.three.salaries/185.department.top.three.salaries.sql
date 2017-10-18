SELECT
  d.Name AS 'Department',
  e.Name AS 'Employee',
  e.Salary
FROM Employee e JOIN Department d ON e.`DepartmentId` = d.`Id`
WHERE
  (SELECT count(DISTINCT ie.Salary)
   FROM Employee ie
   WHERE ie.DepartmentId = e.DepartmentId AND ie.Salary > e.Salary) < 3