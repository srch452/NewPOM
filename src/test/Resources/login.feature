Feature: login feature

  @login
  Scenario: Admin can login with valid details
    Given Admin is on the homepage
    When Admin enter username
    And Admin enter password
    And Admin click login button
    Then Admin can enter employment management system
