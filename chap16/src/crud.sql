

SELECT * FROM employees;

-- 6장 데이터관리 dml
-- employees 테이블 사번, 이름, 성, 급여, 입사일, 부서코드 컬럼 복사

DESC employees; -- = describe employees; 

-- 6개의 컬럼만 테이블을 복사
CREATE TABLE emp_copy
(SELECT employee_id, first_name, last_name, salary, hire_date, department_id FROM employees);

DESC emp_copy;

SELECT count(*) FROM emp_copy; -- 107

-- 1 이사원 15000 2022-12-26 10 삽입
/* insert into 테이블명(속성명1, ...) values (데이터1,...)*/

INSERT INTO emp_copy (employee_id, first_name, last_name, salary, hire_date, department_id)
VALUES (1, "사원", "이", 15000, '2022-12-26', 10);
SELECT * FROM emp_copy ORDER BY employee_id;

-- 2 최사원 15000 2022-12-26 80 삽입
INSERT INTO emp_copy
VALUES (2, "사원", "최", 15000, '2022-12-26', 80);
SELECT * FROM emp_copy ORDER BY employee_id;

-- 3 홍길동 null null null(emp_copy 이미 입사일 not null 조건설정)
INSERT INTO emp_copy
VALUES(3, "길동", "홍", NULL, '2022-12-26', NULL);
SELECT * FROM emp_copy ORDER BY employee_id;

-- 4 김길동 null null null(emp_copyt 이미 입사일 not null 조건설정)
INSERT INTO emp_copy (employee_id, first_name, last_name, hire_date)
VALUES(4, "길동", "김홍", '2022-12-26');
SELECT * FROM emp_copy ORDER BY employee_id; 

-- 여러개 insert
INSERT INTO emp_copy VALUES 
(5, "길동", "홍", 7000, '2012-11-26', NULL),
(6, "길동", "홍", NULL, '2012-10-26', NULL),
(7, "길동", "홍", NULL, '2002-09-26', 50);
SELECT * FROM emp_copy ORDER BY employee_id;

-- 오류
INSERT INTO emp_copy VALUES 
(8, "길동", "홍", 7000, '2012', NULL);
-- 년도4자리 - 월2 일2 마리아디비 기본형식임
-- datetime(date, time)

-- 오류가 있어도 일단 삽입 하겠다 "ignore"키워드
INSERT ignore INTO emp_copy VALUES 
(8, "길동", "홍", 7000, '2012', NULL);

-- emp_copy 테이블 생성 _ 데이터 복사 
CREATE TABLE emp_copy
(SELECT employee_id, first_name, last_name, salary, hire_date, department_id FROM employees);

-- emp_copy테이블 생성하지 말고 + 데이터 복사
INSERT INTO emp_copy
SELECT employee_id, first_name, last_name, salary, hire_date, department_id FROM employees;


-- /////////////////DCL (Control)
-- 커밋 상태 확인하기
SHOW VARIABLES LIKE 'auto%';
-- 마리아디비 autocommit기본이다. 

-- 1번 사번 사원의 급여10% 인상
UPDATE emp_copy
SET salary = salary * 1.1
WHERE employee_id = 1;

SELECT * FROM emp_copy ORDER BY employee_id;

-- 입사월이 6월인 사원의 부서를 20번으로 배정하고 급여 20%인상한다.
-- 1. 조건에 해당하는 사람 조회하기 
SELECT hire_date, first_name, department_id, salary 
FROM emp_copy
WHERE hire_date LIKE '_____06%';
-- 2. update,set,where + like 조건절
UPDATE emp_copy
SET department_id = 20, salary = salary * 1.2
WHERE hire_date LIKE '_____06%';


-- //////////ch.7 제약조건
DESC emp_copy;
SELECT * FROM information_schema.table_constraints
WHERE TABLE_NAME = 'employees';
DESC employees;
--오류
INSERT INTO emp_copy VALUES (9, "이름", "성", NULL, NULL, NULL);
SELECT * FROM information_schema.table_constraints
WHERE TABLE_NAME = 'emp_copy';

-- primary : not null + unique
CREATE TABLE product
(
CODE INT PRIMARY KEY,
NAME CHAR(30) NOT NULL,
price DECIMAL,
balance SMALLINT CHECK (balance >= 0)
);
-- primary key, not null정보
DESC product;
-- not null정보 제외한 제약조건 정보를  보여줌
SELECT * FROM information_schema.table_constraints
WHERE TABLE_NAME = 'product';

-- USE information_schema;
-- SELECT * FROM table_constraints
-- WHERE TABLE_NAME = 'product';

INSERT INTO product VALUES(100, '냉장고', 1000000, 10);
INSERT INTO product VALUES(101, '키보드', 10000, -10); -- 제약조건위배 / ERROR
INSERT INTO product VALUES(102, '마우스', 10000, 5);
INSERT INTO product VALUES(103, '컴퓨터', 1000000, 0);
SELECT * FROM product;

-- p_code - 정수, 자동숫자증가
-- auto increment(컬럼 이미 존재 primary key 설정)


INSERT INTO product(CODE, NAME, price, balance) VALUES(104, '컴퓨터2', 1000000, 50);
SELECT * FROM product;

CREATE TABLE USERS(
user_id CHAR(10) PRIMARY KEY, -- 중복X, NULL허용X
user_pw CHAR(5) NOT NULL,
user_name CHAR(30),
user_email CHAR(30)UNIQUE, -- 중복X
user_phone CHAR(12) CHECK (user_phone LIKE '010-%'),
address CHAR(100)
);
DROP TABLE USER;
DESC USERS; -- 컬럼명타입 NOT NULL, PRIMARY, UNIQUE정보 

-- CHECK포함 ( NOT NULL제외 ) 정보
SELECT * FROM table_constraints WHERE TABLE_NAME='users';
-- check내용
SELECT TABLE_NAME,CONSTRAINT_NAME, check_clause
FROM information_schema.check_constraints;

-- 효력 발생 - DML
INSERT INTO users VALUES('MARIA', 'DB', '홍길동', 'HONG@A.COM', '010-23456789', '서울시 용산구');
SELECT * FROM users;