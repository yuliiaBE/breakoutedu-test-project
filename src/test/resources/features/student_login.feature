@smoke
Feature: Student Login with Breakout account

  Background:
    Given student is on the Student Login Page

  @done
  Scenario: Student Login successfully
    When student clicks on Log In with Breakout EDU
    And enters valid Email and Password
    And clicks on Log In
    Then verifies Student Home Page in displayed

  @done
  Scenario: Student Login with invalid credentials
    When student clicks on Log In with Breakout EDU
    And enters invalid email and password
    And clicks on Log In
    Then verifies Username or password is invalid message is displayed


  Scenario: Student Login with Google Classroom successfully
    When student clicks on Log In With Google Classroom
    ##And clicks on Use Another Account
    And enters valid Classroom Email and clicks Next
   ## And enters valid Classroom password and clicks Next
    Then verifies Student Home Page in displayed