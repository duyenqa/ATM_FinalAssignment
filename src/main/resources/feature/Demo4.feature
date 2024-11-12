Feature: Verify Product Detail screen
  Scenario: Verify Product Detail successfully
    Given Open eCart Multivendor Customer App
    When Click Next one time
    And Click Next two time
    And Click Get Start
    And Select “All” location
    And Scroll to Coffee And Click to View All
    And Click to High Octane Instant Coffee
    Then Verify the product detail screen should be displayed: Product Name, Product Price, Add to Cart button, Go to Cart button, Similar Products text