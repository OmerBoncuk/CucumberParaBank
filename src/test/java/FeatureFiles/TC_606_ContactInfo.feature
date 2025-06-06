Feature: Update Contact functionality

  Background:
    Given Navigate to ParaBank
    When  The user fills in the registration form with valid data
    And   Clicks the "Register" button
    Then  The user should see a message confirming successful registration

  @Contact @Accounts
  Scenario: Update Contact Info
    And Click on the Element
      | updateContactBtn |
      | updateProfileBtn |

    And User should update successfully