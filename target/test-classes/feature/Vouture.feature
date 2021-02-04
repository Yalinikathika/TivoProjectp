@VoutureManagement

Feature:Vouture

  Background: User is logged into the tivo portal
    Given User enters into Tivo login page
    When User enter username "tivo_superuser"
    And User enter the password "tivo_superuser"
    And User click login
    Then The user should be logged into the portal

    Scenario:  The user needs to update the vouture management
      Given The user enters into the voucher managemnet page
      When The user clicks on inventory management and clicks vouture
      And The user needs to enter the id and click search
      And The user clicks the drop down and chooses value,types the batchid and then downloads the data
      Then the user should be able to download the data

      Scenario: The user needs to upload the voucher management
        Given The user enters into the voucher managemnet page
        When The user clicks on inventory management and clicks vouture and enter the id and click search
        And The user clicks upload  data and clicks save
        Then Then user should be able to upload the data


