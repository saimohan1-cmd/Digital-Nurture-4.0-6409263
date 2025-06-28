BEGIN 
    FOR cust in (SELECT name,loan_id,due_date from customers) LOOP
        IF cust.due_date BETWEEN SYSDATE AND SYSDATE+30 THEN
                DBMS_OUTPUT.PUT_LINE('Reminder: Greetings! ' || cust.NAME ||
                     ', your loan (ID: ' || cust.LOAN_ID || ') is due soon.');
        END IF;
        END LOOP;
        
    END;
    /