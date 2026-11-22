# Write your MySQL query statement below

SELECT w.id
FROM Weather w 
LEFT JOIN Weather d 
ON w.recordDate-INTERVAL 1 DAY=d.recordDate
WHERE w.temperature>d.temperature;