@ForgotPasswordFeature
Feature: Stockbit Forgot Password

  Background:
    Given [stockbit - Login] user open stockbit login page
    When  [stockbit - Login] user click link forgot password

  @Positive @SystemTest @Regression @ValidEmail
  Scenario: Send link reset with valid email
    And [stockbit - Forgot] user input valid email 'anggastika@outlook.co.id'
    And [stockbit - Forgot] user click submit
    Then [stockbit - Forgot] user get info to check email

  @Negative @SystemTest @Regression @InvalidEmail
  Scenario: Send link reset with invalid email
    And [stockbit - Forgot] user input valid email 'anggastika@mailinator.com'
    And [stockbit - Forgot] user click submit
    Then [stockbit - Login] showing error message

  @Negative @SystemTest @Regression @WrongEmailFormat
  Scenario: Send link reset with invalid email format
    And [stockbit - Forgot] user input valid email 'acink'
    And [stockbit - Forgot] user click submit
    Then [stockbit - Login] showing error message