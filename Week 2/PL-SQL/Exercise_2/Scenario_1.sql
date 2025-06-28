CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS 
    BEGIN 
        FOR acc in (SELECT id,balance,account_type FROM bank_data) LOOP 
            IF acc.account_type ='SAVINGS' THEN
                UPDATE bank_data
                SET balance = acc.balance + (acc.balance*0.01)
                WHERE id = acc.id;
            END IF;
            END LOOP;
        COMMIT;
    END;
    /
EXEC ProcessMonthlyInterest;
SELECT id,name,account_type,balance FROM bank_data;
