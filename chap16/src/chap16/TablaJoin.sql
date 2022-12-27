- /////////// /////////// 테이블 조합  :  컬럼 갯수 타입 순서 일치
-- UNION / UNION ALL (합집합) / INTERSERCT(교집합) / MINUS( mariaDB : except )

-- [1] 합집합 UNION / UNION ALL 
-- 1. 50번 부서의 모든 부서원을 복사하야 emp_dept_50 테이블 생성
CREATE TABLE emp_dept_50
(SELECT * FROM employees WHERE department_id = 50);

-- 2. manager 계열 직종 사원들을 emp_job_man 테이블 생성
-- job_id가 IT_prog, st_man, it_man
CREATE table emp_job_man
(SELECT * FROM employees WHERE job_id LIKE '%man%');

-- 1.2 조회
SELECT * FROM emp_dept_50; -- 45명
SELECT * FROM emp_job_man; -- 12명

-- 재난지원금을 지원하려고 한다. 대상 : 50번 부서원이거나 manager직종으로 한정
SELECT employee_id, first_name, department_id, job_id
FROM emp_dept_50
UNION
SELECT employee_id, first_name, department_id, job_id
FROM emp_job_man
-- ㄴ UNION : 중복을 제거하고 합집합 = > 52명

SELECT employee_id, first_name, department_id, job_id
FROM emp_dept_50
UNION ALL
SELECT employee_id, first_name, department_id, job_id
FROM emp_job_man
-- ㄴ UNION ALL : 중복을 제거하지 않고 합집합 = > 57명

-- [2] 교집합 intersect > 대상:50번부서원이면서 MANAGER직종
SELECT employee_id, first_name, department_id, job_id
FROM emp_dept_50
INTERSECT
SELECT employee_id, first_name, department_id, job_id
FROM emp_job_man