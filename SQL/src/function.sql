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
FROM employees;

/* 256자리 : CHAR/VARCHAR
65536자리 : TEXT
*/
CREATE TABLE productFUNC(
NAME CHAR(100),
PRICE DECIMAL(10, 2),
DETAIL TEXT,
IMAGEFILE VARCHAR(100));

INSERT INTO productFUNC VALUES('COMPUTER', 1000.99, '........', 'COM.JPG');

SELECT ASCII('A'), CHAR(65);
-- LENGTH함수 : 바이트길이 
SELECT "ABCDED", "가나다라마바", BIT_LENGTH("ABCDEF"), LENGTH("ABCDEF"),
CHAR_LENGTH("가나다라마바"), BIT_LENGTH("가나다라마바"), LENGTH("가나다라마바"); 

/*mariaDB문자열을 출력ELT, FIELD, FINE_IN_SET,*/
SELECT ELT(2, '일이', '둘', '셋'); 
SELECT FIELD('일이', '일이', '둘', '셋');
SELECT FIND_IN_SET ('일이','일이,삼사,오육');
SELECT INSTR('일이삼사오육', '삼');
SELECT LOCATE('삼', '일이삼사오육');
SELECT SUBSTRING('김상형의 SQL정복', 5, 3);
SELECT SUBSTR('김상형의 SQL정복', 5, 3);
SELECT NOW(); 

SELECT HIRE_DATE 입사시작, SUBSTR(HIRE_DATE, 1, 4) 입사년도, SUBSTR(HIRE_DATE, 6, 2) 입사월 FROM employees;

SELECT @pw = "abc가나다123";
SELECT @pw,  INSERT(@pw, 2, 4, "*");
SELECT repeat("*", CHAR_LENGTH(@pw) );

-- @pw 변수의 모든 값을 *조회
SELECT @pw, INSERT(@pw, 2, CHAR_LENGTH(@pw), repeat("*", CHAR_LENGTH(@pw)));

SELECT "ABCDEF", LEFT("ABCDEF", 3), RIGHT("ABCEDF", 3);
SELECT "mArIa DATABase", UPPER("mArIa DATABase"), LOWER("mArIa DATABase");

-- PAD() : 채우다 
SELECT 'abc', LPAD('abc', 10, "#"), RPAD('abc', 10, "#");
SELECT 'abc', LPAD('abc', 10, " "), RPAD('abc', 10, " ");

-- trim() : 잘라내다
SET @pw = "김상형의 sql정복      ";
SELECT CHAR_length(@pw), CHAR_LENGTH(LTRIM(@pw)), char_length(RTRIM(@pw));

SET @pw = "ㅋㅋㅋㅋㅋ웃겨용ㅋㅋㅋ";
SELECT TRIM(LEADING 'ㅋ' FROM @pw), TRIM(TRAILING 'ㅋ' FROM@PW), TRIM(BOTH 'ㅋ' FROM@pw); -- LEADING :시작시점을알려준다

DESC employees;
DESC emp_copy;

SELECT MIN(employee_id), MAX(employee_id) FROM employees;

INSERT INTO emp_copy VALUES(300, '길동', '최', 10000, NOW(), 200);
INSERT INTO emp_copy VALUES(301, '크롱크롱', '김', 10000, NOW(), 200);
INSERT INTO emp_copy VALUES(302, '희진언냐', '꽉', 10000, NOW(), 200);
INSERT INTO emp_copy VALUES(303, '의석씨', '고', 10000, NOW(), 200);
INSERT INTO emp_copy VALUES(304, '영기', '왕', 10000, NOW(), 200);
INSERT INTO emp_copy VALUES(305, '신입', '조', 10000, NOW(), 200);
INSERT INTO emp_copy VALUES(306, '과장', '김', 10000, date_sub(NOW(), INTERVAL 4 MONTH), 200);
INSERT INTO emp_copy VALUES(307, '부장', '곽', 30000, CURRENT_date, 200);
SELECT * FROM emp_copy ORDER BY employee_id DESC;

SELECT 100 + 200;
SELECT '100' + '200'; -- concat와 다르다. 타입은문자지만 양쪽전부숫자로취급 위와같음  문자열로저장하고싶다면 concat로 
SELECT CONCAT('100', '200');

-- cast, convert, format
SELECT AVG(salary), CAST(AVG(salary) AS SIGNED INTEGER),
CONVERT(AVG(salary), SIGNED INTEGER),
FORMAT(AVG(salary), 0) FROM employees;

-- 입사년도 조회
SELECT hire_date FROM employees ORDER BY 1;

SELECT FIRST_NAME 이름, SALARY 급여, 
CASE
WHEN SALARY >= 20000 THEN SALARY+5000
WHEN SALARY >= 15000 THEN SALARY+10000
WHEN SALARY >= 10000 THEN SALARY+20000
ELSE SALARY+30000
END 연말보너스
FROM employees;

-- 2002년 이전까지입사자 30000
-- 2005년 이전까지 입사자 20000
-- 나머지 10000
SELECT FIRST_NAME 이름, SALARY 급여, HIRE_DATE 입사일, 
CASE SUBSTR(HIRE_DATE, 1, 4)
WHEN '2001' THEN SALARY+30000
WHEN '2002' THEN SALARY+30000
WHEN '2003' THEN SALARY+20000
WHEN '2004' THEN SALARY+20000
WHEN '2005' THEN SALARY+20000
ELSE SALARY+10000
END 연말보너스
FROM employees;

SELECT FIRST_NAME 이름, SALARY 급여, HIRE_DATE 입사일, 
CASE 
WHEN SUBSTR(HIRE_DATE, 1, 4) IN('2001','2002') THEN SALARY+30000
WHEN SUBSTR(HIRE_DATE, 1, 4) IN('2003','2004','2005') THEN SALARY+30000
ELSE SALARY+10000
END 연말보너스
FROM employees;

-- mariaDB DECODE없다 
-- 날짜함수
-- 현재 시각 날짜
SELECT CURDATE(), CURRENT_DATE, CURTIME(), NOW(), SYSDATE();
-- CAST CONVERT FORMAT + DATE_FORMAT(쉽다)  
SELECT NOW(), DATE_FORMAT(NOW(), '%Y/%m/%d');
SELECT NOW(), DATE_FORMAT(NOW(), '%Y/%m/%d'), DATE_FORMAT(NOW(), '%y/%M/%D');

SELECT NOW(), DATE_FORMAT(NOW(), '%Y/%M/%D %W %T %a %H:%I:%S');
/*
%Y, %y - 4/2자리년도
%m, %M, %c - 2자리 / 영문월이름/ 1,2자리 월
%d, %e - 2/1, 2자리 일
%w - 영문요일(Wednesday)
%a - 영문3글자 요일(Wedn)

%H, %h - 24/12시간 
%i - 분
%s - 초
*/

-- 2006년도 입사자 급여 조회
SELECT hire_date, salary FROM employees
WHERE hire_date >= '2006-01-01 00:00:00'
AND hire_date < '2007-01-01 00:00:00'

SELECT hire_date, salary FROM employees WHERE hire_date LIKE '2006%';
SELECT hire_date, salary FROM employees WHERE SUBSTR(hire_date, 1, 4) = '2006';
SELECT hire_date, salary FROM employees WHERE INSTR(hire_date, '2006') = 1;
SELECT hire_date, salary FROM employees WHERE DATE_FORMAT(hire_date, '%Y') = '2006';

-- 06월 입사자 급여 조회
SELECT hire_date, salary FROM employees WHERE hire_date LIKE '_____06%';
SELECT hire_date, salary FROM employees WHERE SUBSTR(hire_date, 6, 2) = '06';
SELECT hire_date, salary FROM employees WHERE INSTR(hire_date, '06') = 6;
SELECT hire_date, salary FROM employees WHERE DATE_FORMAT(hire_date, '%m') = '06';

-- 2006년 이후 입사자 - 2006,7,8
SELECT hire_date, salary FROM employees WHERE hire_date >= '2006-01-01 00:00:00'
ORDER BY hire_date; 
SELECT hire_date, salary FROM employees WHERE substr(hire_date, 1, 4) >= '2006'
ORDER BY hire_date;
SELECT hire_date, salary FROM employees WHERE date_format(hire_date, '%Y') >= '2006'
ORDER BY hire_date;
SELECT hire_date, salary FROM employees WHERE year(hire_date) >= '2006'
ORDER BY hire_date;



