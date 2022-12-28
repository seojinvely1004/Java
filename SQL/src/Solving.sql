USE EMPDB;

-- Q1. 80번부서의 평균급여보다 많은 급여를 받는 직원의 이름, 부서id, 급여를 조회하시오.--27개
SHOW TABLES;
employees

SELECT first_name, department_id, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees WHERE department_id=80); -- 집계함수는 무조건 하나만결과가나온다