@EventFeature
Feature: The user is the event page

  Background: User is logged into the tivo portal
    Given User enters into Tivo login page
    When User enter username "tivo_superuser"
    And User enter the password "tivo_superuser"
    And User click login
    And The user should be logged into the portal
    And The user is in homepage
    And The user click on catalogue management
    And The user clicks on live management
    And  The user click on event id
    Then The user is in event page

@LiveProductFeature
  Scenario: As a user, I want to see live product page
    Given The user is in homepage
    When The user click on catalogue management
    And The user click on live product
    And The user clicks on live management
    And  The user click on event id
    Then The user is in event page
@Searchable
  Scenario:
    Given The User is in the event page
    When The user clicks searchable
    And the user clicks yes
    Then The searchable should be changed
@EditDescription
  Scenario:
    Given The user is in event page
    When The user click edit
    And The user changes the description as "NEW PROJECT" and clicks save
    Then The toast should be displayed as "Additional description edited successfully"
    And The description should be added successfully
