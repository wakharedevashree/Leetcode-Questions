# Write your MySQL query statement below
update salary
set sex=
   case WHEN sex = 'm' THEN 'f'
              ELSE 'm'
          END;