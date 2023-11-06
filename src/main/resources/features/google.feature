Feature: Google Search

  Scenario: User searches on Google
    Given I open the Google website
    When I enter "inetum" in the search bar
    And I click the search button
    Then I should see search results for "inetum"