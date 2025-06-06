Feature: Login functionality
  Background:
    Given Navigate to ParaBank


  @Accounts @SmokeTest @Regression
  Scenario Outline: Login test with different username and password combinations

    When Enter username "<username>" and password "<password>" and click login button
    Then Login should be "<status>"

    Examples:
      | username | password | status       |
      | Leyla    | leyla    | successful   |
      | Team2    | Team2    | unsuccessful |



