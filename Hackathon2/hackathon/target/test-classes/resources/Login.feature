Feature: Login
    Scenario: Login com campo senha em branco
        Given User is on Login Page
        When User enters a email on email field
        Then User should get an error message