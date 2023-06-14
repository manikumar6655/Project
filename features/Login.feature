Feature: Login page


  Scenario: Login with valid Credentials
    Given : User Launch the browser
    When : User opens the Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And : User enters email as "admin@yourstore.com" and Password "admin"
    And : Click on login
    Then : page title should be "Dashboard / nopCommerce administration"
    When : User click on logout button
    And : close browser
    
    
    

  Scenario Outline: login data driven
    Given : User Launch the browser
    When : User opens the Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And : User enters email as "<email>" and Password "<password>"
    And : Click on login
    Then : page title should be "Dashboard / nopCommerce administration"
    When : User click on logout button
    And : close browser

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | mani123@.com        | mani     |
