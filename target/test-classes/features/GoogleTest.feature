Feature: google test
Background: 
Given User has opened the site
Then user logs in to the site
Scenario: Open google.com in browser
Given Browser is opened
When User puts url and hit enters 
Then It opens