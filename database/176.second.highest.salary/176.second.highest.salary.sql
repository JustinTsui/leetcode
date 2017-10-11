select ifnull((
    SELECT DISTINCT Salary
    FROM Employee
    GROUP BY Salary
    ORDER BY 1 DESC
    LIMIT 1, 1
  )
, null) SecondHighestSalary