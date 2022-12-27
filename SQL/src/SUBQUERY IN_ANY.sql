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
								