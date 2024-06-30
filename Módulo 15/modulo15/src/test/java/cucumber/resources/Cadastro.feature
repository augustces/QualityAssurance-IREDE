Feature: Sign Up
    Scenario: Happy Day
        Given User is on Homepage
        And User clicks on the login button
        When User enters a name on name field
        And User enters an email on email field
        Then User should be redirectioned to Sign Up Page

    Scenario: Sign Up with exiting email
        Given User is on Homepage
        And User clicks on the login button
        When User enters a name on name field
        And User enters an exiting email on email field
        Then User should get an error message