Feature: Create account page
  As a user i can create account successfully

@Smoke @Regression
  Scenario Outline: verify that user should create account successfully
    Given I am on home page
    When I click on sign in link
    And I enter email  "<email>"
    And I click on create new account button
    And I enter first name "<name>"
    And I enter last name "<lastname>"
    And I enter register password "<password>"
    And I enter address "<address>"
    And I enter city "<city>"
    And I select state "<state>"
    And I enter postal code "<postal>"
    And I select country "<country>"
    And I enter phone number "<phone>"
    And I click on register button





    Examples:
      | email              | name  | lastname | password | address | city   | state | postal  | country | phone       |
      | xyz12860@gmail.com | Kavan | Patel   | abcd123  | 13      | London | 3     | 12345 | 21      | 07453456771 |
