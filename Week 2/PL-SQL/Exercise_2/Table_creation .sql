CREATE TABLE Bank_data (
    id      NUMBER PRIMARY KEY,
    name   VARCHAR2(100),
    balance         NUMBER(10, 2),
    account_type    VARCHAR2(20),      
    department_id   NUMBER,           
    salary          NUMBER(10, 2)     
);
INSERT INTO Bank_data VALUES (101, 'Rajesh', 5000, 'SAVINGS', NULL, NULL);
INSERT INTO Bank_data VALUES (102, 'Suresh', 7000, 'SAVINGS', NULL, NULL);
INSERT INTO Bank_data VALUES (103, 'Ramesh', NULL, 'EMPLOYEE', 10, 3150);
INSERT INTO Bank_data VALUES (104, 'Divya', NULL, 'EMPLOYEE', 10, 3360);
INSERT INTO Bank_data VALUES (105, 'Gukesh', 10000, 'CHECKING', NULL, NULL);
INSERT INTO Bank_data VALUES (106, 'Mounica', 8000, 'CHECKING', NULL, NULL);
COMMIT;
