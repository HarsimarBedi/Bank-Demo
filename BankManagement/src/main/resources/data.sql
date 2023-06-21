CREATE TABLE userAccounts ( account_number VARCHAR(20) NOT NULL, account_name VARCHAR(100) NOT NULL, account_type VARCHAR(50) NOT NULL, balance_date VARCHAR(100), currency VARCHAR(10) NOT NULL, opening_available_balance DECIMAL(10, 2) NOT NULL, user_id INT NOT NULL ); 

CREATE TABLE AccountTransaction( account_number VARCHAR(100) NOT NULL, account_name VARCHAR(100) NOT NULL, value_date VARCHAR(100) NOT NULL, currency VARCHAR(100) NOT NULL, debit_amount DECIMAL(10, 2) NOT NULL, credit_amount DECIMAL(10, 2) NOT NULL, debit_credit VARCHAR(100) NOT NULL, transaction_narrative VARCHAR(255) NOT NULL );

INSERT INTO userAccounts (account_number, account_name, account_type, balance_date, currency, opening_available_balance, user_id) VALUES ('4567789012349876','SGSavings726','Savings','2023-06-12','SGD',84327.51,1201); 

INSERT INTO userAccounts (account_number, account_name, account_type, balance_date, currency, opening_available_balance, user_id) VALUES ('5369064259623806','AUSavings933','Savings','2023-06-12','AUD',14327.51,1201);

 INSERT INTO userAccounts (account_number, account_name, account_type, balance_date, currency, opening_available_balance, user_id) VALUES ('8251954367963268','AUCurrent433','Current','2023-06-12','AUD',88327.51,1201);

INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('4567789012349876','Savings Account','11/06/2023','SGD',235.3,1911.65,'Credit','Yes');
 INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('4567789012349876','Savings Account','11/06/2023','SGD',836.7,5911.53,'Credit','Yes'); INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('4567789012349876','Savings Account','11/06/2023','SGD',332.67,6423.82,'Credit','Yes'); INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('4567789012349876','Savings Account','11/06/2023','SGD',752.72,8742.12,'Credit','Yes'); INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('5369064259623806','Savings Account','10/06/2023','AUD',4279.24,725.2,'Debit','Yes'); INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('5369064259623806','Savings Account','10/06/2023','AUD',3223.22,573.3,'Debit','Yes'); INSERT INTO AccountTransaction(account_number,account_name,value_date,currency,debit_amount,credit_amount,debit_credit,transaction_narrative) VALUES('5369064259623806','Savings Account','10/06/2023','AUD',2392.22,752.2,'Debit','Yes');