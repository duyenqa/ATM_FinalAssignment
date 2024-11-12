Feature: Verify Cart screen
  Scenario: Verify Cart successfully
    Given Open eCart Multivendor Customer App
    When Click Next one time
    And Click Next two time
    And Click Get Start
    And Select “All” location
    And Click to Category menu item
    And Click to Fast Food
    And Click Add to Cart with Quantity two of Kurkure Namkeen - Masala Munch product
    And Click to Cart icon on top screen
    And Select 370405 location
    Then Verify The Cart should be display