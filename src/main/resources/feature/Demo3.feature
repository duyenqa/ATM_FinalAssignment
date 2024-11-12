Feature: Verify number of product of Fresh Vegetables screen
  Scenario: Verify number of product of Fresh Vegetables successfully
    Given Open eCart Multivendor Customer App
    When Click Next one time
    And Click Next two time
    And Click Get Start
    And Select “All” location
    And Scroll to Fresh Vegetables
    And Click to View All
    Then Verify the Fresh Vegetables category should be displayed three products
    And Verify fresh Vegetables screen should be displayed ten products.