@ScheduleManagement
Feature:ScheduleManagement

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
    @CheckSchedulePage
  Scenario: User needs to edit the description in the the schedule
    Given The user is in homepage and navigates to schedule page
    When The user clicks edit the option
    And The user changes the description and click save
    Then The description is saved




