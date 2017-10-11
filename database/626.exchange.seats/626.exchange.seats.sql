select s1.id, COALESCE(s2.student, s1.student) AS student
from seat s1 left join seat s2 on (s2.id + 1) ^ 1 - 1 = s1.id
order by 1