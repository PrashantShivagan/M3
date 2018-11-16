#Author: Prashant
Feature: ConferenceRegistration
Description: New

Scenario: Verify title of page
Given User is on ConferenceRegistration page
Then check the heading of page

Scenario: Verify firstname for null inputs
Given User is on ConferenceRegistration page
When User does not enter firstname 
Then prompt user to fill firstname in details

Scenario: Verify lastname for null inputs
Given User is on ConferenceRegistration page
When User does not enter lastname 
Then prompt user to fill lastname in details


Scenario: Verify email in correct format
Given User is on ConferenceRegistration page
When User does not enter email in correct format
Then prompt user to write input correctly

Scenario: Verify contact number for null input
Given User is on ConferenceRegistration page
When User does not enter contact number
Then prompt user to enter mobile number

Scenario: Verify valid mobile number
Given User is on ConferenceRegistration page
When User enters  incorrect mobile no format and clicks the button
|0090000000|
|2345678989|
|84321|
|77722005480|
Then display alert msg

Scenario: Verify number of people attending for null inputs
Given User is on ConferenceRegistration page
When User does not select number of people attending
Then prompt user to select the number of people attending

Scenario: Verify address for null inputs
Given User is on ConferenceRegistration page
When User does not enter address
Then prompt user to fill in the address

Scenario: Verify buildingname and room no in correct format
Given User is on ConferenceRegistration page
When User does not enter buildingname and room no
Then prompt user to fill in the buildingname and room no

Scenario: Verify area name for null inputs
Given User is on ConferenceRegistration page
When User does not enter area name
Then prompt user to fill in the area name

Scenario: Verify city for null inputs
Given User is on ConferenceRegistration page
When User does not select city
Then prompt user to select city

Scenario: Verify state for null inputs
Given User is on ConferenceRegistration page
When User does not select state
Then prompt user to select state

Scenario: Verify Conference full access for null inputs
Given User is on ConferenceRegistration page
When User does not select conference full access
Then prompt user to select conference full access

Scenario: Successful in registration on entering all valid details
    Given User is on ConferenceRegistration page
    When User enters all valid details and clicks next
    Then Display Alert Message and clicks OK
    And Navigate to Payment Details page