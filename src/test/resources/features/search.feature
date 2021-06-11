Feature: jobSearch

  Scenario: user searches for a job
    Given user is on the Primestreet Homepage
    When user clicks on Careers link
    And user clicks on Available Jobs link
    And user clicks on SDET link
    And user clicks on Apply link
    Then user lands on the application page