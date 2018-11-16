#Author: Prashant
Feature: Payment
Description: New

Scenario: Verify title of page
Given User is on Payment page
Then check the heading of page

Scenario: Verify card holder name for null inputs
Given User is on Payment page
When User does not enter card holder name
Then prompt user to fill in card holder name

Scenario: Verify debit card number for null inputs
Given User is on Payment page
When User does not enter debit card number
Then prompt user to enter debit card number

Scenario: Verify cvv number for null inputs
Given User is on Payment page
When User does not enter cvv number
Then prompt user to enter cvv number

Scenario: Verify card expiration month for null inputs
Given User is on Payment page
When User does not enter card expiration month
Then prompt user to enter card expiration month

Scenario: Verify card expiration year for null inputs
Given User is on Payment page
When User does not enter card expiration year
Then prompt user to enter card expiration year

Scenario: Verify Make Payment button
Given User is on Payment page
When User clicks on Make Payment button
Then navigate to Payment page
