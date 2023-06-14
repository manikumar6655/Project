Feature: Customer

  Background: Common steps for each Scenarios
    Given : User Launch the browser
    When :User opens the Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And :User enters email as "admin@yourstore.com" and Password "admin"
    And :Click on login
    Then :User can view dashboard
    When :User click on customers menu
    And :click customer item

  Scenario: Add a customer
    And :click on add new button
    Then :User can view add new customer page
    When :user enters customer info
    And :click on save button
    Then :User can view confirmation message "The new customer has been added succesfully."

  Scenario: Search customer by email id
    And : Enter customer email
    When :click on search button
    Then : user should found email in the Search table
    And : Close browser
