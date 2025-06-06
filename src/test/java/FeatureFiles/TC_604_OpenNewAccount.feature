Feature: Open New Account functionality


  Background:
    Given Navigate to ParaBank
    When  Fill out the registration form with valid information
    And   Click the "Register" button
    Then  Check a message confirming successful registration

  @SmokeTest @Regression
  Scenario: Open New Account (Checking)

    Given Click the Open New Account button
    When Select checking account type
    And Select an existing account
    Then Click the Open New Account
    And Check the message that Account Opened

  @SmokeTest @Regression
  Scenario: Open New Account (Saving)

    Given Click the Open New Account button
    When Select saving account type
    And Select an existing account
    Then Click the Open New Account
    And Check the message that Account Opened