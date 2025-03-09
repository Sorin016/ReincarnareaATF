Feature: Ckeck all the values related to specific rights
@UI @Run
Scenario Outline: The first login
Given User inserts <username>
And User insert <password>
When User click submit
Then User is redirect to the home page
And User navigate to Admin page
And User check save and check all the users inside the table
Examples:
| username | password |
| Admin    | admin123 |