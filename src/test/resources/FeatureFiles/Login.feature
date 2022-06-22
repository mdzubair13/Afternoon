@loginfuncion
Feature: To Check login Fuctions

  Background: 
    Given To Open Chrome Browser
@sanity @regression
  Scenario: To pass valid username and valid Password
    When To pass  valid username and  password
      #1D -Map
      | 1234 | blue     |
      
    Then To Click login button
@regression @smoke 
  Scenario: To pass invalid username and invalid password
    When To pass invalid username and valid password
      #2D Map
      | user   | pass       | numbers |
      | red    | red@123    |     123 |
      | blue   | blue@456   |     456 |
      | orange | orange@789 |     789 |
    Then To Click login button
