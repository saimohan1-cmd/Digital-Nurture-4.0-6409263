CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dep_id in NUMBER,
    bonus_percentage in NUMBER
) IS
BEGIN 
    UPDATE bank_data
    SET salary = salary + (salary *(bonus_percentage/100))
    WHERE department_id = dep_id;
    COMMIT;
END;
/
SELECT name,salary FROM bank_data WHERE account_type = 'EMPLOYEE';
EXECUTE updateemployeebonus(10,5);
SELECT name,salary FROM bank_data WHERE account_type ='EMPLOYEE'