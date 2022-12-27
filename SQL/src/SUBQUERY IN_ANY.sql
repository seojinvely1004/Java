USE EMPDB;

-- KELLY 급여 같은 사원의 이름, 급여 조회
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY =(SELECT SALARY FROM employees WHERE FIRST_NAME='SUSAN');

-- KELLY보다 급여를 더 많은 사원의 이름, 급여 조회
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY > ALL (SELECT SALARY FROM employees WHERE FIRST_NAME='KELLY');

-- WILLIAM 중 1명보다  급여를 더 많은 사원의 이름, 급여 조회
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY > ANY (SELECT SALARY FROM employees WHERE FIRST_NAME='WILLIAM');
-- WILLIAM 급여와 같은 급여를 받는 사원의 이름, 조회 
SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY = ANY (SELECT SALARY FROM employees WHERE FIRST_NAME='WILLIAM');

-- 변수 사용
SET @NAME = 'PETER';

SELECT FIRST_NAME, SALARY
FROM employees
WHERE SALARY > (SELECT SALARY FROM employees WHERE FIRST_NAME=@NAME );

-- 다중열 다중행 subQuery : where(a,b,c) in (select x,y,z...)
SELECT FIRST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE (DEPartment_id, SALARY) IN (SELECT DEPARTMENT_ID, MAX(SALARY) FROM employees GROUP BY DEPARTMENT_ID)
ORDER BY DEPARTMENT_ID;

-- /////////subquery중첩 - 테이블 여러개 필요////
-- locations 테이블 : 부서 위치 도시 정보
-- departments 테이블 : 부서이름 부서장 도서코드(location에서찾아)
-- employees 테이블 : 사원정보 
-- 런던 도시 근무 사원명 조회
-- 1. 런던 도시코드 조회(2400)
SELECT location_id FROM locations WHERE city = 'london';  -- 24000
-- 2. 런던 도시코드(2400)과 같은 도시코드 부서코드를 조회(40)
SELECT * FROM departments;
SELECT department_id FROM departments WHERE location_id = 2400; -- 40

-- 3.
SELECT first_name, department_id FROM employees
WHERE department_id =
							(SELECT department_id FROM departments WHERE location_id=
								(SELECT location_id FROM locations WHERE city = 'south san francisco' )
								);
								
-- 각 부서별 '최대급여' 이름 ,급여,부서번호를 조회
SELECT first_name, salary, department_id
FROM employees
WHERE (departmen_id, salary) IN
(SELECT department_id, MAX(salary) FROM employees GROUP BY department_id)
ORDER BY department_id;
-- // 연관커리, 상관형서브쿼리
-- 내가 속한 부서의 평균급여보다 더 많이 받는 사원의  급여,부서번호를 조회 /테이블에도 alias(별명)을 줄 수 있다.
SELECT salary, department_id,
(SELECT AVG(salary) FROM employees WHERE e.department_id = department_id)
FROM employees e
WHERE salary > ANY (SELECT AVG(salary) FROM employees GROUP BY department_id);	

-- alias AVG_SAL, SAL_TBL
-- 1000 이상 급여 평균
SELECT AVG(SALARY)
FROM employees
WHERE SALARY >= 10000; -- 12,632.~

-- 회사 DB 부서별 권한 다르게
SELECT SAL_TBL.AVG_SAL AS 고액월급평균
FROM (SELECT AVG(SALARY) AVG_SAL FROM employees WHERE SALARY >= 10000) SAL_TBL;  -- 12,632.~

-- 급여 수준에 따른 직급 조회
-- EMPLOYEES 테이블 급여컬럼O , 직급컬럼 X
-- 직급만들기 )  20000이상  임원, 15000 이상 부장, 10000이상 과장 , 5000이상 대리, 이하는 사원
-- 급여 SALARY + SALARY * commition_pct
SELECT MAX(SALARY), MIN(SALARY) FROM employees;


SELECT first_name,
CASE
WHEN SALARY + SALARY * COMMISSION_PCT >= 20000 THEN '임원'
WHEN SALARY + SALARY * COMMISSION_PCT >= 15000 THEN '부장'
WHEN SALARY + SALARY * COMMISSION_PCT >= 10000 THEN '과장'
WHEN SALARY + SALARY * COMMISSION_PCT >= 5000 THEN '대리'
ELSE '사원'
END 직급 
FROM employees;

SELECT first_name, salary, commission_pct FROM employees;
								
								