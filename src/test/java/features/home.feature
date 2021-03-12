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

  Scenario Outline: User can change conversion type
    Given I click menu bar
    When I select the "<type>"
    Then I should see conversion "<type>" selected
    Examples:
      |type  |
      |Speed  |
      |Time  |
      |Energy  |
      |Force  |

    Scenario: User can interchange conversion unit during conversion
      Given I click menu bar
      And I select the "Area"
      And I enter input '50'
      When I click the unit interchange icon
      Then I should see result as '0.005'
      
    Scenario: User can change unit type during conversion
      Given I click menu bar
      And I select the "Temperature"
      And I enter input '45'
      When I change unit to "Kelvin"
      Then I should see result as '318.15'
