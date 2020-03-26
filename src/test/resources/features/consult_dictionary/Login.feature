@LoginFeature
Feature: Stockbit Login

  Background:
    Given [stockbit - Login] user open stockbit login page

  @Positive @SystemTest @Regression @Login
  Scenario: Success login
    When [stockbit - Login] user input username 'anggastika'
    And [stockbit - Login] user input password 'automation87'
    And [stockbit - Login] user click login button
    Then [stockbit - Homepage] user is in homepage

  @Positive @SystemTest @Regression @LoginWithValidEMail
  Scenario: Success login with valid
    When [stockbit - Login] user input username 'anggastika@outlook.co.id'
    And [stockbit - Login] user input password 'automation87'
    And [stockbit - Login] user click login button
    Then [stockbit - Homepage] user is in homepage

  @Negative @SystemTest @Regression @Login @LoginWithInvalidEmail
  Scenario: Fail login With Invalid Email
    When [stockbit - Login] user input username 'anggastika@mailinator.com'
    And [stockbit - Login] user input password 'automation87'
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing error message

  @Negative @SystemTest @Regression @Login @WrongPass
  Scenario: Fail login With Wrong Password
    When [stockbit - Login] user input username 'anggastika'
    And [stockbit - Login] user input password 'automation88'
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing error message

  @Negative @SystemTest @Regression @Login @WrongUsername
  Scenario: Fail login With Wrong Password
    When [stockbit - Login] user input username 'anggastiki'
    And [stockbit - Login] user input password 'automation88'
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing error message

  @Negative @SystemTest @Regression @Login @WrongUsernameAndWrongPass
  Scenario: Fail login With Wrong Username And Wrong Password
    When [stockbit - Login] user input username 'anggastiki'
    And [stockbit - Login] user input password 'automation88'
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing error message

  @Negative @SystemTest @Regression @Login @BlankPassword
  Scenario: Fail login With Blank Password
    When [stockbit - Login] user input username 'anggastika'
    And [stockbit - Login] user input password ''
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing tooltip and button login is still visible

  @Negative @SystemTest @Regression @BlankUsername
  Scenario: Fail login With Blank Username
    When [stockbit - Login] user input username ''
    And [stockbit - Login] user input password 'wrongpass'
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing tooltip and button login is still visible

  @Negative @SystemTest @Regression @BlankUsernameAndPassword
  Scenario: Fail login With Blank Username and Blank Password
    When [stockbit - Login] user input username ''
    And [stockbit - Login] user input password ''
    And [stockbit - Login] user click login button
    Then [stockbit - Login] showing tooltip and button login is still visible