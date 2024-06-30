Feature: Login
    Scenario: Login com sucesso
        Given User is on Login Page
        When User enters tomsmith on username field
        And User enters SuperSecretPassword! on password field
        Then User should be logged
    Scenario: Login com username em branco
        Given User is on Login Page
        When User enters a password on password field
        Then User should get an username error message
    Scenario: Login com senha em branco
        Given User is on Login Page
        When User enters an username on username field
        Then User should get a password error message