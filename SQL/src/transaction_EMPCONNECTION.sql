-- 19.트랜잭션
/*
all or nothing
tcl - transaction control lang.
commit/rollback

원자성 - 트랜잭션은 1개 단일 작업
격리성 - 현재 트랜잭션 수행중에 다른 트랜잭션 개입하지 못한다
일관성 - 실패 : 원상복구
영속성 - 트랜잭션 성공 - 영구DB저장
*/

SHOW VARIABLES LIKE '%auto%';
SET autocommit = FALSE;
SHOW VARIABLES LIKE '%auto%';

-- 사용자 commit / rollback
-- dml(insert/update/delete/select)commit/rollback
-- ddl(auto commit) 

-- 커낵션이 여러개 있어야한다. 
-- empconnection
SELECT * FROM emp_copy WHERE employee_id=300;
DELETE FROM emp_copy WHERE employee_id=300;
SELECT * FROM emp_copy WHERE employee_id=300;
ROLLBACK;
SELECT * FROM emp_copy WHERE employee_id=300;


SELECT * FROM emp_copy WHERE employee_id=301;
DELETE FROM emp_copy WHERE employee_id=301;
SELECT * FROM emp_copy WHERE employee_id=301;
COMMIT; -- EMP버퍼 --DB반영
SELECT * FROM emp_copy WHERE employee_id=301;

-- 계좌이체
DROP TABLE account_tbl;
CREATE TABLE account_tbl
(account_number CHAR(10) PRIMARY KEY,
account_pw INT,
balance DECIMAL(10, 2)
);

INSERT INTO account_tbl
VALUES('A', 1111, 10000);
INSERT INTO ACCOUNT_TBL
VALUES('B', 2222, 0);

COMMIT;
SELECT * FROM account_tbl;
-- 계좌이체 1
SET autocommit = TRUE;
UPDATE account_tbl
SET balance = balance - 5000
WHERE account_number = 'A';

UPDATE account_tbl
SET balance = balance + 5000
WHERE account_number = 'BB'; -- B를 BB로 임의설정

ROLLBACK;
SELECT * FROM account_tbl;

-- 2.
SET autocommit = FALSE;
UPDATE account_tbl
SET balance = balance - 5000
WHERE account_number = 'A';

UPDATE account_tbl
SET balance = balance + 5000
WHERE account_number = 'BB'; -- B를 BB로 임의설정

ROLLBACK;
SELECT * FROM account_tbl;

-- JDBC 다양한 DB 접속 _자바 언어 제어