Feature: This is Home feature

  Scenario: User can visit Home Page
    Given I open the application
    Then I should see Home Page

  Scenario: User can see Navigation menu
    Given I click menu bar
    Then I should see navigation drawer

  Scenario: User can use length conversion
    Given I am on length conversion page
    When I enter input '2'
    Then I should see result as '60.96'