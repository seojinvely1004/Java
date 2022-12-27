-- //////////////////////////////////////////////////////////JOIN
-- 집합연산자 - 테이블의 행 갯수 합병 . 행갯수 변화(ch9)
-- JOIN       - 테이블의 열 갯수 합병 . 열갯수 변화(ch10)
SELECT * FROM employees;
SELECT * FROM departments;

-- 위의 2개 테이블에서 동일한 값의 컬럼이 존재 (department_id)
SELECT first_name, department_id FROM employees;
SELECT department_name, department_id FROM departments;
-- cross join
SELECT first_name, department_name  -- 각 테이블에서 각열을 합친 것
FROM employees
CROSS JOIN departments
;

-- inner join > ON절 필수. inner생략가능(조인의default값임)
SELECT first_name, department_name  -- 각 테이블에서 각열을 합친 것
FROM employees
INNER JOIN departments
ON employees.department_id = departments.department_id
;
--위의 코드에서 select절의 각 열 앞에 테이블을 정확히 명시해 줘도 된다. 
SELECT employees.first_name, departments.department_name  -- 각 테이블에서 각열을 합친 것
FROM employees
INNER JOIN departments
ON employees.department_id = departments.department_id
;
--위의 코드는 너무 길다. table에 alias를  줘서 줄이기
SELECT e.first_name, e.department_id, d.department_id, d.department_name  -- 각 테이블에서 각열을 합친 것 + e.d_id
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id
;
-- jobs 테이블 : JOB_ID , JOB_TITLE ..
-- employees 테이블 : job_id REFERNECES jobs(job_id)
SELECT * FROM jobs;
SELECT * FROM employees;
SELECT * FROM departments;
-- 사원이름, 직종이름(job_title), 급여 조회. 
SELECT first_name, job_title, salary
FROM employees e
JOIN jobs j
ON e.job_id = j.job_id;
-- 사원이름, 직종이름, 부서이름 조회. 단, 급여 10000 이상인 사원만 대상
SELECT first_name, job_title, department_name, salary
FROM employees e
JOIN jobs j ON e.job_id=j.job_id
JOIN departments d ON e.department_id=d.department_id
WHERE salary >= 10000;

-- seattle 도시 근무 사원의 사원명, 부서명, 도시명(city_locations테이블) 조회
SELECT * FROM locations;
SELECT * FROM employees;
SELECT * FROM departments;

-- SELECT location_id FROM locations WHERE city = 'seattle'; -- 17000

SELECT first_name, department_name, city
FROM locations l 
JOIN departments d ON d.location_id=l.location_id
JOIN employees e ON e.department_id=d.department_id
WHERE city='seattle';