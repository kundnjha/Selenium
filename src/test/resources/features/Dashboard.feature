Feature: Dashboard test cases

Background: 
Given User has opened the site
Then user logs in to the site

@12
Scenario: Verify user is logged in successfully
Given User is on dashboard page 
Then User verify page title as "title"
When User hover on profile dropdown
Then USer should be able to see logged in user name