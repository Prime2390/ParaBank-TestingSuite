# Test scenarios

| Id | Name | Description | Preparatory activities | Final actions |
| --- | --- | --- | --- | --- |
| 1 | Registration | Cases concerning registration | Clearing the database | Registration verification |
|  | Logging | Logging cases  | The user has an account | Login verification |
| 3 | Forgot login info |  Cases concerning forgot login info | The user has an account | Verification of Forgot login info |
| 4 | Loan application on ParaBank website | Checking the accuracy of the loan application form | 1. the user is logged into his/her account.
2. The “Apply for a Loan” page is accessed and loaded correctly.
3. the user's account is selected in the “From account #” field. | Verification of loan application |
| 5 | **Updating User Contact Information** | **Updating contact information in the “Update Contact Info” section** | 1.	The user has an active account.
2.	The user is logged into the system.
3.	The user is on the **“Update Contact Info”** page. | Verification of the correctness of the messages that appear |

# Test cases

| Scenario Id | Test Case Id | Test Case | Case Description | Test Steps | Step description | Test data | Expected result  | The actual result | Status |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 1 | Registration correct | User registers with correct data | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | The page opens correctly | The page opens correctly | PASS |
|  |  |  |  | Step 2 | Click the 'register' button |  | We are redirected to the registration page | We are redirected to the registration page | PASS |
|  |  |  |  | Step 3 | We fill in all the fields | We use arbitrary data (Exploratory tests will show possible validation errors) | No errors are displayed | No errors are displayed | PASS |
|  |  |  |  | Step 4 | Click the 'Register' button |  | We get a message about successful registration | We get a message about successful registration | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 1 | 2 | Registration without data | User registers without providing any data | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | The page opens correctly | The page opens correctly | PASS |
|  |  |  |  | Step 2 | Click the 'register' button |  | We are redirected to the registration page | We are redirected to the registration page | PASS |
|  |  |  |  | Step 3 | Click the 'Register' button |  | Next to the fields where the data has not been entered, an appropriate message is displayed | Next to the fields where the data has not been entered, an appropriate message is displayed | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 1 | 3 | Registration with used account name | User registers a second account with the same name | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | The page opens correctly | The page opens correctly | PASS |
|  |  |  |  | Step 2 | Click the 'register' button |  | We are redirected to the registration page | We are redirected to the registration page | PASS |
|  |  |  |  | Step 3 | We fill in all the fields   | FirstName - ‘Dominik’ 
LastName - ‘Tester’ 
Address - ‘Uznania’
City - ‘Zawiercie’
State - ‘Śląsk’
ZipCode - ‘65-200’
Phone - ‘650940245’
SSN - ‘12423631213’
Username - ‘Tester2390’
Password - ‘Testerpass2390’
Confirm - ‘Testerpass2390’ | No errors are displayed | No errors are displayed | PASS |
|  |  |  |  | Step 4 | Click the 'Register' button |  | We get a message about successful registration | We get a message about successful registration | PASS |
|  |  |  |  | Step 5 | Click the 'logout' button |  | We are redirected to the home page | We are redirected to the home page | PASS |
|  |  |  |  | Step 6 | Click the 'register' button |  | We are redirected to the registration page | We are redirected to the registration page | PASS |
|  |  |  |  | Step 7 | We fill in the fields with the data used in the first registration  | FirstName - ‘Dominik’ LastName - ‘Tester’ 
Address - ‘Uznania’
City - ‘Zawiercie’
State - ‘Śląsk’
ZipCode - ‘65-200’
Phone - ‘650940245’
SSN - ‘12423631213’
Username - ‘Tester2390’
Password - ‘Testerpass2390’
Confirm - ‘Testerpass2390’ | No errors are displayed | No errors are displayed | PASS |
|  |  |  |  | Step 8 | Click the 'Register' button |  | A message about the occupied account name is displayed | A message about the occupied account name is displayed | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 1 | 4 | Registration with incompatible passwords | User enters different passwords | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | The page opens correctly | The page opens correctly | PASS |
|  |  |  |  | Step 2 | Click the 'register' button |  | We are redirected to the registration page | We are redirected to the registration page | PASS |
|  |  |  |  | Step 3 | Fill in all fields, the 'password' and 'confirm' fields are to be different  | Freedom to fill in the fields  | No errors are displayed | No errors are displayed | PASS |
|  |  |  |  | Step 4 | Click the 'Register' button |  | The system informs us that passwords do not match  | The system informs us that passwords do not match  | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 2 | 1 | Logging in with correct data | The user logs in with a valid username and password. | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | Enter correct login information | Username = “Tester2390”
Password = “Testerpass2390” | Data is correctly entered without errors | Data is correctly entered without errors | PASS |
|  |  |  |  | Step 3 | Click the “LOG IN” button. |  | The user is logged in and redirected to the main panel. | The user is logged in and redirected to the main panel. | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 2 | 2 | Logging in without entering data | The user tries to log in without entering a username and password. | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | Click the “LOG IN” button. |  | An error message is displayed: “Please enter a username and password. | An error message is displayed: “Please enter a username and password. | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 2 | 3 | Logging in with incorrect data  | A user tries to log in using a non-existent username. | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | Enter a non-existent username |  | Data is correctly entered without errors | Data is correctly entered without errors | PASS |
|  |  |  |  | Step 3 | Enter a non-existent password |  | Data is correctly entered without errors | Data is correctly entered without errors | PASS |
|  |  |  |  | Step 4 | Click the “LOG IN” button. |  | An error message is displayed : “Username or password incorrect”. | An error message is displayed : “Username or password incorrect”. | FAIL |
|  |  |  |  |  |  |  |  |  |  |
| 3 | 1 | Recall of login data with correct details  | User tries to retrieve username and password using correct data | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | Click on ‘Forgot login info’. |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | We provide the correct data | FirstName - ‘Dominik’ 
LastName - ‘Tester’ 
Address - ‘Uznania’
City - ‘Zawiercie’
State - ‘Śląsk’
ZipCode - ‘65-200’
Phone - ‘650940245’
SSN - ‘12423631213’ | Data is correctly entered without errors | Data is correctly entered without errors | PASS |
|  |  |  |  | Step 4 | Click the “Find My Login Info” button. |  | We get your account information (Username and Password) | We get your account information (Username and Password) | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 3 | 2 | Recall login credentials without providing data | The user tries to recover the username and password without entering the data. | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We click “Forgot login info” |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | Click the “Find My Login Info” button. |  | We get information about not filling in mandatory fields | We get information about not filling in mandatory fields | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 3 | 3 | Recall login credentials with incorrect data | User tries to retrieve username and password by entering incorrect data | Step 1 |  Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We click “Forgot login info” |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | We provide data using a random content generator |  | Data is correctly entered without errors | Data is correctly entered without errors | PASS |
|  |  |  |  | Step 4 | Click the “Find My Login Info” button. |  | We get an Error with tre “The specified client information cannot be found.
 | We get an Error with tre “The specified client information cannot be found.
 | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 4 | 1 | Filling out the form with correct data | The user fills out the loan form using correct data | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We log into the account | Username: Tester2390
Password: Testerpass2390 | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | Click the “Request Loan” tab. |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 4 | We enter the correct values: | Loan Amount: 500
Down Payment: 100
From account : actual | Data is entered without hindrance  | Data is entered without hindrance  | PASS |
|  |  |  |  | Step 5 | We click the “APPLY NOW” button |  | The application is correctly submitted | The application is correctly submitted | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 4 | 2 | No required fields | User submits a blank loan form | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We log into the account | Username: Tester2390
Password: Testerpass2390 | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | Click the “Request Loan” tab. |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 4 | Leave the fields blank: “Loan Amount” and ‘Down Payment’. |  | Data is entered without hindrance  | Data is entered without hindrance  | PASS |
|  |  |  |  | Step 5 | Click the button: “APPLY NOW”. |  | The application is not sent and an Error appears due to failure to fill in the required fields  | The application is not sent and an Error appears due to failure to fill in the required fields  | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 4 | 3 | Introduction of negative values | User enters negative values in “Down Payment” “Loan Amount” fields. | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We log into the account | Username: Tester2390
Password: Testerpass2390 | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | Click the “Request Loan” tab. |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 4 | We enter negative values: | Loan Amount: -5000
Down Payment: -1000
From account : actual | Data is entered without hindrance  | Data is entered without hindrance  | PASS |
|  |  |  |  | Step 5 | We click the “APPLY NOW” button |  | Request is not sent and Error related to invalid values appears | Request is not sent and Error related to invalid values appears | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 4 | 4 | Entering a value greater than the available balance | User enters larger value in “Down Payment” than account balance | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We log into the account | Username: Tester2390
Password: Testerpass2390 | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | Click the “Request Loan” tab. |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 4 | We enter negative values: | Loan Amount: 5000000
Down Payment: 1000000
 From account : actual | Data is entered without hindrance  | Data is entered without hindrance  | PASS |
|  |  |  |  | Step 5 | We click the “APPLY NOW” button |  | The request is not sent and Error related to insufficient balance appears | The request is not sent and Error related to insufficient balance appears | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 4 | 5 | Entry of non-numerical values | The user fills out the form by entering the letters | Step 1 | Go to [https://parabank.parasoft.com/parabank/index.htm](https://parabank.parasoft.com/parabank/index.htm) |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 2 | We log into the account | Username: Tester2390
Password: Testerpass2390 | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 3 | Click the “Request Loan” tab. |  | Website opens correctly | Website opens correctly | PASS |
|  |  |  |  | Step 4 | Enter the letters | Loan Amount: abc
Down Payment: xyz
 From account : actual | Data is entered without hindrance  | Data is entered without hindrance  | PASS |
|  |  |  |  | Step 5 | We click the “APPLY NOW” button |  | The request is not sent and Error related to invalid values appears | The request is not sent and Error related to invalid values appears | PASS |
|  |  |  |  |  |  |  |  |  |  |
| 5 | 1 | Updating contact information with valid values | User update their profile information using valid data   | Step 1 | Fill in all fields with valid data | •**First Name - Andrzej**
•**Last Name - Nowak**
•**Address - Powstania 12**
•**City - Warszawa**
•**State - Małopolska**
•**Zip Code 42-204**
•**Phone # - 690690690** | Data is entered without any problems | Data is entered without any problems |  |
|  |  |  |  | Step 2  | Click “UPDATE PROFILE” |  | Your details are changed and the message "Your updated address and phone number have been added to the system." is displayed. | Your details are changed and the message "Your updated address and phone number have been added to the system." is displayed. |  |
|  |  |  |  |  |  |  |  |  |  |
| 5 | 2 | Leaving fields empty | User leaves blank fields in form | Step 1 | Delete data from all fields |  | Data is entered without any problems | Data is entered without any problems |  |
|  |  |  |  | Step 2  | Click “UPDATE PROFILE” |  | The application is not sent and an error related to incomplete fields appears | The application is not sent and an error related to incomplete fields appears |  |
|  |  |  |  |  |  |  |  |  |  |
| 5 | 3 | Entering invalid characters in text fields | Enter numbers in “First Name” and “Last Name” fields | Step 1 | Fill in “First Name” and “Last Name” **with numbers** | •**First Name - 1234**
•**Last Name - 7890** | Data is entered without any problems | Data is entered without any problems |  |
|  |  |  |  | Step 2  | Click “UPDATE PROFILE” |  | An error message appears | The data has been changed | FAILD |
|  |  |  |  |  |  |  |  |  |  |
| 5 | 4 | Entering an invalid ZIP code | Enter letters instead of numbers in the “Zip Code” field | Step 1 | Enter letters in the “Zip Code” file | •**Zip Code - rabarbar** | Data is entered without any problems | Data is entered without any problems |  |
|  |  |  |  | Step 2  | Click “UPDATE PROFILE” |  | An error message appears | The data has been changed |  |
|  |  |  |  |  |  |  |  |  |  |
| 5 | 5 | Entering an invalid phone number | Enter letters instead of numbers in the “Phone #” field | Step 1  | Enter letters in “Phone #” field | •Phone# - Argentyna | Data is entered without any problems | Data is entered without any problems |  |
|  |  |  |  | Step 2  | Click “UPDATE PROFILE” |  | An error message appears | The data has been changed |  |
|  |  |  |  |  |  |  |  |  |  |
|  |  |  |  |  |  |  |  |  |  |
|  |  |  |  |  |  |  |  |  |  |
|  |  |  |  |  |  |  |  |  |  |

# Zgłaszanie Niepoprawnego działania aplikacji

[Errors](https://www.notion.so/Errors-1ab6b4dee23e80519330d84e8894c4a7?pvs=21)