Feature: Transfer Funds

  Background:
    Given Navigate to ParaBank
    When  The user fills in the registration form with valid data
    And   Clicks the "Register" button
    Then  The user should see a message confirming successful registration

  @Payment @Regression
  Scenario: Money transfer between Accounts
    Given Navigate to TransferFunds
    Then Money transfer between Accounts
    And Success message should be displayed

  @Payment @Regression
  Scenario: Money transfer between my accounts
    Given Navigate to TransferFunds
    Then Money transfer between Accounts
    And Success message should be displayed
    And Navigate to TransferFunds2
    When Money transfer between Accounts2
    Then Navigate to Accounts Overview
    And Accounts Overview

