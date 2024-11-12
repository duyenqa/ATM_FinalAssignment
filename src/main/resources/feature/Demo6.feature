Feature: Verify Payment screen
  Scenario: Verify Payment successfully
    Given Open eCart Multivendor Customer App
    When Click Next one time
    And Click Next two time
    And Click Get Start
    And Select “All” location
    And Click to Category menu item
    And Click to Beverages
    And Click Add to Cart with Quantity two of Sunfeast Dark Fantasy Choco Fills, 600g
    And Click to Cart icon on top screen at Beverages screen
    And Select 370001 location
    And Click to Continue button one time
    And Click to Login button
    And Click to Continue button two time
    And Select default address and click Continue
    Then Verify the Payment screen