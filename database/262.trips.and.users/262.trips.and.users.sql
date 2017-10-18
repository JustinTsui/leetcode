SELECT
  total.Request_at                               AS 'Day',
  round(ifnull(cancelled.cnt / total.cnt, 0), 2) AS 'Cancellation Rate'
FROM
  (SELECT
     count(1) cnt,
     t.`Request_at`
   FROM Trips t JOIN Users drivers ON t.Driver_id = drivers.`Users_Id` AND drivers.`Banned` = 'No'
     JOIN
     Users clients ON t.Client_Id = clients.`Users_Id` AND clients.`Banned` = 'No'
   WHERE Status != 'completed'
   GROUP BY t.`Request_at`) cancelled
  RIGHT JOIN
  (SELECT
     count(1) cnt,
     t.`Request_at`
   FROM Trips t JOIN Users drivers ON t.Driver_id = drivers.`Users_Id` AND drivers.`Banned` = 'No'
     JOIN
     Users clients ON t.Client_Id = clients.`Users_Id` AND clients.`Banned` = 'No'
   GROUP BY t.`Request_at`) total
    ON cancelled.Request_at = total.Request_at
WHERE total.Request_at >= '2013-10-01' AND total.Request_at <= '2013-10-03'