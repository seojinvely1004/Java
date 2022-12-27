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