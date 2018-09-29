Feature: FreeCRM Application Test

Scenario: Validate FreeCRM Homepage test

Given user opens browser
When user is on required loginpage
Then user logs in
Then validate title of home page
Then validate logged in user