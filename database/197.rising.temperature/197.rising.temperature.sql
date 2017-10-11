select Id
from (
       select
         Id,
         `Date`,
         adddate(`Date`, -1),
         Temperature,
         (
           select Temperature
           from Weather iw
           where iw.`Date` = adddate(w.Date, -1)
         ) yesterday_temperature
       from Weather w
     ) t
where Temperature > yesterday_temperature
