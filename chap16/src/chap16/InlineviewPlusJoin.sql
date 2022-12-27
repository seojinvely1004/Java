-- Q ) seattle에서 근무하는 사원의 이름, 부서명, 국가, 대륙을 조회한다.
DESC countries;
DESC regions;

SELECT first_name, department_name, country_name, region_name
FROM employees e
JOIN departments d ON e.department_id=d.department_id
JOIN locations l ON d.location_id=l.location_id
JOIN countries c ON l.country_id=c.country_id
JOIN regions r ON c.region_id=r.region_id;

--위 코드와 같다. 인라인뷰로 조인하기.
SELECT inform.emp, depart, coun, re
FROM (
	SELECT first_name emp, department_name depart, country_name coun, region_name re
	FROM employees e
	JOIN departments d ON e.department_id=d.department_id
	JOIN locations l ON d.location_id=l.location_id		
	JOIN countries c ON l.country_id=c.country_id
	JOIN regions r ON c.region_id=r.region_id
) inform;

-- A) 위 코드에 + "seattle에서 근무하는" 을 출력하기 위해 city 추가
SELECT inform.emp, depart, city, coun, re
FROM (
	SELECT first_name emp, department_name depart, city, country_name coun, region_name re
	FROM employees e
	JOIN departments d ON e.department_id=d.department_id
	JOIN locations l ON d.location_id=l.location_id		
	JOIN countries c ON l.country_id=c.country_id
	JOIN regions r ON c.region_id=r.region_id
) inform
WHERE city = 'seattle';

-- A_2 (방2) 
SELECT inform.emp, depart, coun, re
FROM (
	SELECT first_name emp, department_name depart, country_name coun, region_name re
	FROM employees e
	JOIN departments d ON e.department_id=d.department_id
	JOIN locations l ON d.location_id=l.location_id		
	JOIN countries c ON l.country_id=c.country_id
	JOIN regions r ON c.region_id=r.region_id
	WHERE l.city = 'seattle'

) inform;
