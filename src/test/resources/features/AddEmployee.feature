Feature: Add employee for HRMs portal

  Background:
    #Given user is able to access HRMS application
    When user enters correct credentials
    And user clicks on login button
    Then user is navigated to dashboard page
    When user clicks on PIM button
    And user clicks on AddEmploee
    Then user can see AddEmployee option

  @withoutID @id
   Scenario: Add employee without id system should generate ID automatically
 When user adds Employee firsname, middlename and lastname
 And user see id was generated automatically
 And user clicks on save button
 Then user is able to add new employee

    @withId @id
   Scenario: Add employee with Id number
      When user adds Employee firsname, middlename and lastname
      And user clear an adds id number
      And user clicks on save button
      Then user is able to add new employee

      @emptyFields @id
Scenario Outline:
        Given user adds Employee "<firsname>", "<middlename>" and "<lastname>"
        And user clicks on save button
        Then user see can see error message in missing field
        Examples:
          | firsname | middlename | lastname |
          |  adam    | ms         |          |
          |          | ms         | george   |
          |          | ms         | george   |


        @existingID @id
        Scenario: existing Id log in
          When user adds Employee firsname, middlename and lastname
          And user adds existing ID number "15258329"
          And user clicks on save button
          Then user can see existing id error














