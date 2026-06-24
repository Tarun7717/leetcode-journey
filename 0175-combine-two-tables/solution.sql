# Write your MySQL query statement below
SELECT firstName,lastName,City,State from Person p left join Address a on p.PersonId=a.PersonId;
