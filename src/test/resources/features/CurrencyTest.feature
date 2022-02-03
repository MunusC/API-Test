
Feature: Check the currency conversion service availability and verify the presence of GBP  
Scenario: Verify service availability and presence of GBP from the list of currencies

Given the end point is up with status code 200 for Get request
When I count the number of currencies returned in the response
Then I am able to verify currency "GBP" is shown within the response
