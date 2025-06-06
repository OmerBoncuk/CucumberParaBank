Feature:  Request Loan (Credit)

  Background:
    Given Navigate to ParaBank
    When  The user fills in the registration form with valid data
    And   Clicks the "Register" button


  @Loan @Accounts @Regression
  Scenario: User applies for a loan and verifies account details

    Given The user clicks the Request Loan link on the ParaBank homepage

    And The user enters "2000" into the 'Loan Amount' field

    And The user enters "400" into the 'Down Payment' field

    And The user selects an account number from the dropdown in the From Account # field

    When The user clicks the Apply Now button

    Then The user verifies the following under the Loan Request Processed heading:
#     https://parabank.parasoft.com/parabank/index.htm
#     Test sitesindeki Kredi sağlayıcı Data'sı sürekli değiştiği için bu kısım güncellenmeli.
      | Jiffy Mortgage Solutions (JMS) |
      | Approved                       |

    And The user verifies the message
      | Congratulations, your loan has been approved. |

    And The user clicks the link for the newly created loan account number

    Then The user verifies the following under the Account Details heading:
      | Loan |
      | 2000 |
      | 2000  |

    And The user verifies the message No Transactions Found under the Account Activity heading

  @Loan @Accounts @Regression
  Scenario: User applies for a loan and verifies account details (Negative)

    Given The user clicks the Request Loan link on the ParaBank homepage

    And The user enters "1000000" into the 'Loan Amount' field

    And The user enters "10000" into the 'Down Payment' field

    And The user selects an account number from the dropdown in the From Account # field

    When The user clicks the Apply Now button

    Then The user verifies the following under the Loan Request Processed heading:
      | Jiffy Mortgage Solutions (JMS) |
      | Denied                         |

    And The user verifies the message
      | You do not have sufficient funds for the given down payment. |

