BEGIN 
FOR  cust in (SELECT CUSTOMER_ID,balance,isvip FROM customers) LOOP
    IF cust.balance>10000 THEN
        UPDATE customers
        SET isvip = 'True'
        WHERE CUSTOMER_ID = cust.CUSTOMER_ID;
    END IF;
    END LOOP;
    COMMIT;
END;
/
SELECT *
FROM CUSTOMERS;

