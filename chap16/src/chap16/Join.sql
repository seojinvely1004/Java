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
