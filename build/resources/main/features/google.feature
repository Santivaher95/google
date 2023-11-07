Feature: Google Search

  Scenario: User searches on Google
    Given I open the Google website
    When I click the search box
    And I enter "inetum" in the search bar
    Then I click the search button
