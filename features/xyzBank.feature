Feature: XYZ Bank login

  Scenario: XYZ Bank name presence of HomePage
    Given I launch the chrome browser
    When I open xyz home page
    Then I verify that the Name present on page
    And close the browser
