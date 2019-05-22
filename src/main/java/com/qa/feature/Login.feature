Feature: CRMPRO Login Page

Scenario: A Valid User is successful in logging into the CRMPRO Application

Given The User is already on Login Page
When The Login Page is displayed 
Then The User enters the valid credentials


#Scenario: An Invalid User in unsuccessful in logging into the CRMPRO Application

#Given The User is already on Login Page
#When The Login Page is displayed
#Then The User enters invalid credentials
#Then The User clicks on the Login Button
#Then The User is directed back to the Login Page