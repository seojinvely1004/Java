
CREATE TABLE regions
    ( region_id      DOUBLE NOT NULL , 
      region_name    VARCHAR(25) ,
      CONSTRAINT PRIMARY KEY (region_id)
    );

CREATE TABLE countries 
    ( country_id      CHAR(2) NOT NULL ,
    country_name    VARCHAR(40)     , 
    region_id       DOUBLE ,
    CONSTRAINT   PRIMARY KEY (country_id) ,
    CONSTRAINT countr_reg_fk FOREIGN KEY (region_id)
          	  REFERENCES regions(region_id)              
    ) ;

CREATE TABLE locations
    ( location_id    SMALLINT,
     street_address VARCHAR(40),
     postal_code    VARCHAR(12),
     city       VARCHAR(30) NOT NULL    , 
     state_province VARCHAR(25)  , 
     country_id     CHAR(2),
     CONSTRAINT PRIMARY KEY (location_id) , 
	CONSTRAINT loc_c_id_fk
       		 FOREIGN KEY (country_id)
        	  REFERENCES countries(country_id) 
    ) ;
 
CREATE TABLE departments
    ( department_id    SMALLINT,
    department_name  VARCHAR(30),
    manager_id       INT,
    location_id      SMALLINT,
   CONSTRAINT  PRIMARY KEY (department_id),
   CONSTRAINT dept_loc_fk
       		 FOREIGN KEY (location_id)
        	  REFERENCES locations (location_id) 
    ) ;

CREATE TABLE jobs
    ( job_id         VARCHAR(10)
    , job_title      VARCHAR(35) NOT NULL
    , min_salary     INT
    , max_salary     INT
, CONSTRAINT  PRIMARY KEY(job_id)
    ) ;

CREATE TABLE employees
    ( employee_id    INT
    , first_name     VARCHAR(20)
    , last_name      VARCHAR(25) NOT NULL
    , email          VARCHAR(25) NOT NULL
    , phone_number   VARCHAR(20)
    , hire_date      DATETIME NOT NULL
    , job_id         VARCHAR(10)NOT NULL
    , salary         DECIMAL(8,2)
    , commission_pct DECIMAL(2,2)
    , manager_id     INT
    , department_id  SMALLINT
    , CONSTRAINT     emp_salary_min
                     CHECK (salary > 0) 
    , CONSTRAINT     emp_email_uk
                     UNIQUE (email)
    ,CONSTRAINT     PRIMARY KEY (employee_id)
    ) ;
