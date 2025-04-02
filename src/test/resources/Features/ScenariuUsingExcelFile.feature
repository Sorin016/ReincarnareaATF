Feature: Ckeck all the values related to specific rights
#@UI @Excel @Run
Scenario: The first login using Excel file
Given User take username from Excel
And User take password from Excel
When User click submit
Then User is redirect to the home page
And User navigate to Admin page
And User check save and check all the users inside the table
