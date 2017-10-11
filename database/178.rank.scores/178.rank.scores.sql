SELECT s.Score, t.rank FROM Scores s,
(
  SELECT
    score_distinct.Score,
    @row_no := @row_no + 1 as rank
  FROM (
    SELECT DISTINCT Score
    FROM Scores
    ORDER BY 1 DESC
  ) score_distinct, (select @row_no := 0) rank
) t
WHERE t.Score = s.Score
ORDER BY 1 DESC