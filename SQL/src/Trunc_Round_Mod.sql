/* 11장 함수 19장 트랜잭션

-- 함수 : 주어진 언어내부 연산자 제공되지 않은 구현
-- 결과 1개 = 이름(매개변수)
-- mariaDB 내장함수
-- 집계함수(GROUPT) > 여러개레코드를 모아서 1개로 
-- SCALAR 함수 > 1개레코드는 결과 1개
-- 문자 날짜 숫자 변환 조건 NULL 처리
*/


-- 1. ROUND : 반올림
SELECT 1234.5678 , ROUND(1234.5678), ROUND(1234.5678,1);
-- 2. REPLACE : 문자열을 변형
SELECT PHONE_NUMBER , REPLACE(PHONE_NUMBER, '.', '-') FROM employees;
-- 3. TRIM , || (불필요한 공백을 잘라낸다, 이어준다)
SELECT CONCAT("성 - " , LAST_NAME, ",이름 - ", FIRST_NAME) FROM employees;

-- 자바 CHAR('') String("")
-- datatbase : char/varchar - 문자열표현('')
-- mariadb : char/varchar 256글자 X 256바이트(한글3바이트) - 문자열표현('',"")
-- mariadb : test 65536문자 - 문자열표현('',"")

-- 숫자함수
-- 숫자형데이터타입
-- 정수 tinyint(1) smallint(2) int(4) long(8) 상품코드
-- 실수 float(4) double(8)
-- 사용자구성 decimal(10, 0) , decimal(8, 2)

-- 수치함수
-- round() 반올림, truncate() round와 같되 반올림이 아니라 잘라내기만 한다
-- round는 많이 쓰여서 몇자리를 자르는지 0이면 생략할 수 있지만 truncate는 써줘야한다
SELECT AVG(salary), ROUND( AVG(salary)), TRUNCATE( AVG(salary),0) from employees;
SELECT 123.5678, ROUND( 123.5678, 0 ), ROUND( 123.5678, -1 ), ROUND( 123.5678, -2 ), from employees;
-- MOD(A,B) > mariaDB : %연산자 > A를 B로 나눈 나머지 
SELECT 1234, MOD(1234, 3) , MOD(1234, 7);
-- MOD 사용하여 EMPLOYEES "짝수사번"의  사번, 이름 조회 
SELECT employee_id, FIRST_name
FROM employees
WHERE  MOD(Employee_id,2)=0;
-- "모든 사원"의 대상으로 짝수 사번인지 홀수 사번인지 나타내기 
SELECT employee_id, FIRST_name,
CASE
WHEN MOD(Employee_id,2)=0 THEN '짝수사번'
ELSE '홀수사번'
END "사번의 성격"
FROM EMPLOYEES;