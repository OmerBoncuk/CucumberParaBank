Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank
    When  The user fills in the registration form with valid data
    And   Clicks the "Register" button
    Then  The user should see a message confirming successful registration

  @Payment @SmokeTest @Regression
  Scenario: Pay electricity bill
    And Click on the Element
      | billPayBtn |
      | payeeName  |

    And Fill the form for pay electricity bill

    And Click on the Element
      | sendPaymentBtn |

    And User should pay successfully

  @Payment @SmokeTest @Regression
  Scenario: Pay electricity bill negative

    And Click on the Element
      | billPayBtn |
      | payeeName  |

    And Fill the form for pay electricity bill negative

    And Click on the Element
      | sendPaymentBtn |

    And User should not make the payment successfully
