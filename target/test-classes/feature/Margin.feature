@MarginManagement
Feature:Margin

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
@CheckMarginValue
  Scenario: User needs to edit the margin value
    Given The user is on tivo homepage and user want to edit margin
    When the user clicks on margin and updates margin
    And  The user enters margin value
    And the user saves the margin
    Then the toast message should appear
    And the margin value gets updated