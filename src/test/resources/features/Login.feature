Feature: Login Validation for HRMs Portal


@Errortext @id
  Scenario Outline: attempts to log in with an empty username field
    When user only enters "<password>" or "<login>" name or both but incorrect
    And user clicks on login button
    Then user can see proper "<error>" message and user can correct their input
  Examples:
       |login     | password    |  error   |
       |    null      | Hum@nhrm123 |  error   |
       |   admin  |       null      |  error   |
       |   admi   | Hum@nhrm12  |  error   |





























































