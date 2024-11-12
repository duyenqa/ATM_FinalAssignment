Feature: Verify Category screen
  Scenario: Verify Category successfully
    Given Open eCart Multivendor Customer App
    When Click Next one time
    And Click Next two time
    And Click Get Start
    And The Default Delivery Location screen displays items
    And Select “All” location
    And And Click to Category menu item
    Then The Category screen displays six categories