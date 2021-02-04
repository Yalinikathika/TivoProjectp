@ProfitManagement

Feature:Profit

  Background: User is logged into the tivo portal
    Given User enters into Tivo login page
    When User enter username "tivo_superuser"
    And User enter the password "tivo_superuser"
    And User click login
    Then The user should be logged into the portal
@CheckProfitPage
    Scenario: The user needs to edit value in the profit management page
      Given The user is on the tivo homepage
      When The user clicks on profit management page and clicks add new
      And The user enters the required data to be edited and clicks activate and clicks save
      Then The margin value should be updated

