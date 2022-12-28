USE EMPDB;

-- Q1. 80번부서의 평균급여보다 많은 급여를 받는 직원의 이름, 부서id, 급여를 조회하시오.--27개
SHOW TABLES;
employees

SELECT first_name, department_id, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees WHERE department_id=80); -- 집계함수는 무조건 하나만결과가나온다

-- Q2. 'South San Francisco'에 근무하는 직원의 최소급여보다 급여를 많이 받으면서 
-- 50 번부서의 평균급여보다 많은 급여를 받는 직원의 이름, 급여, 부서명, 부서id를 조회하시오.
/*SELECT first_name, salary, department_name, department_id
FROM employees e JOIN departments d ON e.department_id=d.department_id;
WHERE salary > 'South San Francisco'에 근무하는 직원의 최소급여
 >> locations - location_id, city
    departments - department_id, ...location_id
    employees - salary, department_id
AND SALARY > 50번 부서의 평균 급여;*/

SELECT first_name, salary, department_name, department_id
FROM employees e JOIN departments d ON e.department_id=d.department_id;
WHERE salary > (SELECT MIN(salary)
					FROM locations l 
					JOIN departments d ON l.location_id=d.location_id
					JOIN employees e ON d.department_id=e.department_id
					WHERE city = "South San Francisco"; 
AND salary > (SELECT AVG(salary) FROM employees WHERE department_id=50);
