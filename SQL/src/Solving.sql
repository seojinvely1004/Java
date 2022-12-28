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

-- Q3-1.각 직급별(job_title) 인원수를 조회하되 사용되지 않은 직급이 있다면 
--해당 직급도 출력결과에 포함시키시오.  JOBS테이블에는 있는데 EMPLOYEES에서 사용하지않는 job_id
/*jobs - job_id(IT) job_title
employees - job_id(PROGRAMMER)
*/
SELECT * FROM jobs;
SELECT * FROM employees;

SELECT JOB_TITLE, COUNT(*)
FROM jobs j LEFT OUTER JOIN employees e ON e.job_id=j.job_id
GROUP BY job_title;
HAVING COUNT(*) >= 10;

-- Q3-1.각 직급별(job_title) 인원수를 조회하되 사용되지 않은 직급이 있다면 
--해당 직급도 출력결과에 포함시키시오.  JOBS테이블에는 있는데 EMPLOYEES에서 사용하지않는 job_id
/*jobs - job_id(IT) job_title
employees - job_id(PROGRAMMER)
*/
SELECT * FROM jobs;
SELECT * FROM employees;

SELECT JOB_TITLE, COUNT(JOB_TITLE)
FROM jobs j LEFT OUTER JOIN employees e ON e.job_id=j.job_id
GROUP BY job_title;
HAVING COUNT(*) >= 10;


-- 3-2. 직급별 인원수가 10명 이상인 직급만 출력결과에 포함시키시오.

SELECT JOB_TITLE, COUNT(*)
FROM jobs j LEFT OUTER JOIN employees e ON e.job_id=j.job_id
GROUP BY job_title;
HAVING COUNT(*) >= 10;

-- 4. 각 부서별 최대급여를 받는 직원의 이름, 부서명, 급여를 조회하시오.
SELECT * FROM employees;
SELECT * FROM departments;

SELECT FIRST_NAME, DEPARTMENT_NAME, SALARY 
FROM employees e JOIN departments d ON d.department_id=e.department_id
WHERE (e.department_id, salary) = any 
( SELECT department_id , MAX(salary) FROM employees GROUP BY department_id );



-- 5. 직원의 이름, 부서id, 급여를 조회하시오. 
-- 그리고 직원이 속한 해당 부서의 최소급여를 마지막에 포함시켜 출력 하시오.
SELECT FIRST_NAME "직원 이름", DEPARTMENT_id 부서코드, SALARY 내급여,
( SELECT MIN(salary) FROM employees WHERE e.department_id=department_id) 
"내 부서의 최소급여"
FROM employees e; 