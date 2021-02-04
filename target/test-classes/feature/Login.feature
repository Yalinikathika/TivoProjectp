@LoginFeature

Feature: Logging into the tivo portal
  Scenario: The user needs to login to tivo portal
    Given User enters into Tivo login page
    When User enter username "tivo_superuser"
    And User enter the password "tivo_superuser"
    And User click login
    Then The user should be logged into the portal