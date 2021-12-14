Feature: SignIn Page
  As a user I should navigate to sign in page successful
@Smoke @Regression
  Scenario: User should navigate to sign in page successfully
    Given I am on home page
    When  I click on sign in link
    Then  I navigate to sign in page successfully with authentication message
@Smoke @Regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on home page
    When  I click on sign in link
    And   I enter username "<username>"
    And   I enter password "<password>"
    And   I click on signin button
    Then I should see the error message"<errorMessage>"

    Examples:
      | username       | password | errorMessage               |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

@Smoke @Sanity @Regression
  Scenario: Verify user should login successfully with valid credentials
    Given I am on home page
    When I click on sign in link
    And  I enter username "xyz12890@gmail.com"
    And  I enter password "abcd123"
    And  I click on signin button
    Then I can see signout link



@Smoke @Sanity @Regression
  Scenario Outline: Verify user should Logout successfully
    Given I am on home page
    When I click on sign in link
    And  I enter username "<username>"
    And  I enter password "<password>"
    And  I click on signin button
    And  I click on signout button
    Then I can see sign in link again

    Examples:
      | username               | password   |
      | xyz12890@gmail.com | abcd123 |