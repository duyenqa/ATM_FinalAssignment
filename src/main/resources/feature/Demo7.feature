Feature: Verify Profile screen
  Scenario: Verify Profile successfully
    Given Open eCart Multivendor Customer App
    When Click Next one time
    And Click Next two time
    And Click Get Start
    And Select “All” location
    And Click to Profile on footer menu
    And Click to Welcome Guest
    And Verify log in screen
    And Click to login button
    And Click again to Profile on footer menu
    Then Verify the profile screen