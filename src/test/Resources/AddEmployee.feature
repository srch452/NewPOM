@Employee
Feature: Add employee
  Scenario: Admin can add an employee with valid details

    Given Admin should be in the EMS homepage
    And Logged in with valid details
    When Admin select EIM module
    And Admin click Employee Master
    And Click add button
    And Add all employee details
    And Click save
    Then Admin should be able to see the message "<Message>"
    And  Admin select EIM module
    And Admin click view employee additional information
    When Click employee select button
    And Select an employee
    Then Admin should able to see employee additional information

