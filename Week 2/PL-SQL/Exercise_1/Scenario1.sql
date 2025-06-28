BEGIN 
FOR  cust in (SELECT CUSTOMER_ID,AGE FROM customers) LOOP
    IF cust.AGE>60 THEN
        UPDATE customers
        SET interest_rate = interest_rate - 1
        WHERE CUSTOMER_ID = cust.CUSTOMER_ID;
    END IF;
    END LOOP;
    COMMIT;
END;
/
SELECT CUSTOMER_ID, NAME, AGE, INTEREST_RATE
FROM CUSTOMERS;

