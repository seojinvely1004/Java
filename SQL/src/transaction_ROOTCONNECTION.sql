SHOW VARIABLES LIKE '%auto%';
SET autocommit = FALSE;
SHOW VARIABLES LIKE '%auto%';

SELECT * FROM emp_copy WHERE employee_id=300;
COMMIT; --다시
SELECT * FROM emp_copy WHERE employee_id=301;