CREATE OR REPLACE PROCEDURE TransferFunds(
    from_id IN NUMBER,
    to_id IN NUMBER,
    amount IN NUMBER
) IS
    v_balance NUMBER;
    BEGIN 
        SELECT balance into v_balance
        FROM bank_data
        WHERE account_type ='CHECKING' and id = from_id;
        IF v_balance >= amount THEN
            UPDATE bank_data
            SET balance = balance - amount
            WHERE id = from_id;
            UPDATE bank_data
            SET balance = balance + amount 
            WHERE id = to_id;
            COMMIT;
        ELSE
            DBMS_OUTPUT.PUT_LINE('Insufficient balance transfer failed!');
        END IF;
    END;
    /
    SELECT id,Name,balance from bank_data
    WHERE account_type = 'CHECKING';
    EXECUTE TransferFunds(105,106,2000);
    SELECT id,Name,balance from bank_data
    WHERE account_type = 'CHECKING';
    