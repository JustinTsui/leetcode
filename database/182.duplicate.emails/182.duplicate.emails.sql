select Email from (
    SELECT Email, count(1) cnt
      FROM Person
    GROUP BY Email
) t
where cnt > 1