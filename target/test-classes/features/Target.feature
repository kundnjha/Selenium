Feature: Test Target module functionality
Background: User is on dashboard page
When User hover on marketing button
And  Clicks Targets module
Then Verify user is on targets screen

Scenario: Verify Create Target functionality working fine or not
When User clicks on create target button
Then User verifiy target screen
When User enter below target information
|john|Smith|9800123456|1717 South College Street, Auburn AL 36830|
And User clicks on save button
Then User should be able to see newly created target's detail view opened

Scenario: Verify User should be able to edit existing targets
When User clicks on view targets 
Then User should be able to see list of targets
When User clicks on pencil button of target record
Then User should be able to view edit target record screen
And User Clicks on the save button
Then Targets should be updated

Scenario: Verify import functionality of target module
When User clicks import targets button
Then User should be able to see upload import file screen
When User clicks on choose file button
And User uploads file
And Check create new records and update existing checkbock
And User clicks on next button
And User accept alert
And User confirm import file properties by selecting next btn
And User confirm import mapping default fields
And User click on Import now btn
Then user should be on view import results screen
And User click on exit button 

Scenario: User should be able to delete target record
When User clicks on view targets 
Then User should be able to see list of targets
When User clicks on pencil button of target record
And User clicks on bulk action 
And User clicks on delete button
And User accept delete alert pop
Then Selected target should be get deleted

Scenario: Check whether all links are working fine on target page
When User check all anchor links present on page should not be broken
Then User gets positive response

Scenario: Check whether all select/Deselect target list button on view target page working fine
When User clicks on view targets 
Then User should be able to see list of targets
When User clicks on select all checkbox
Then User should be able to validate all targets checkboxes are enbled
When User clicks on all deselct button 
Then User should be able to validate all targets checkboxes are disabled

Scenario: Check whether filter targets functionality working fine 
When User clicks on view targets
And User clicks on filter button
And User enter filter item
And User clicks on search filter
Then User should be able to see filtered records present on screen


 





