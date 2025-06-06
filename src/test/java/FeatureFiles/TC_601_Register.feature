Feature: Register functionality

  @SmokeTest @Regression
  Scenario: Create a user

    Given Navigate to ParaBank
    When  The user fills in the registration form with valid data
    And   Clicks the "Register" button
    Then  The user should see a message confirming successful registration