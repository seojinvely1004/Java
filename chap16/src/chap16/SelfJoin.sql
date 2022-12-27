SELECT * FROM employees;
-- /////////SELF JOIN (자체조인) _ 내부 조인 문법 사용하고  조인 대상 테이블이 자신 테이블
-- Q) 각 사원의 정보 중에서 상사 사번 컬럼을 포함하여 내 상사의 이름, 급여를 조회
SELECT EMPLOYEE_ID, MANAGER_ID FROM employees;
SELECT MANAGER_ID FROM employees WHERE EMPLOYEE_ID=150; -- 145
SELECT FIRST_NAME, SALARY, EMPLOYEE_ID FROM employees WHERE EMPLOYEE_ID=145;

-- A1) 서브쿼리
SELECT FIRST_NAME, SALARY, EMPLOYEE_ID FROM employees
WHERE EMPLOYEE_ID IN (SELECT MANAGER_ID FROM employees);

-- A2) INNER JOIN
SELECT FIRST_NAME, DEPARTMENT_NAME
FROM employees INNER JOIN departments ON employees.department_id=departments.department_id;

-- A3) SELF JOIN > 테이블에 대한 ALIAS 필수로 있어야 한다. 
SELECT ME.employee_id 내사번, ME.FIRST_NAME 내이름, 
MAN.manager_id 상사사번, MAN.employee_id 상사사번2, MAN.first_name 상사이름
FROM employees ME JOIN employees MAN
ON ME.MANAGER_ID = MAN.EMPLOYEE_ID;

-- 내사번, 내이름, 상사의 사번, 상사의이름을 조회하되 상사가 없는 사원을 포함하여 조회한다. > outer join 사용하기 
SELECT ME.employee_id 내사번, ME.FIRST_NAME 내이름, 
MAN.manager_id 상사사번,MAN.first_name 상사이름
FROM employees ME
LEFT OUTER JOIN employees MAN
ON ME.MANAGER_ID = MAN.EMPLOYEE_ID;