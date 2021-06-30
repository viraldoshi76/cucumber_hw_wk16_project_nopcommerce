Feature: Test Suite
  As a user I should be able to add product to cart on nopcommerce website

@Sanity,@Regression
  Scenario: User should arrange the product in alphabetical order successfully
    Given I am on Homepage
    When I hoover on computer tab
    And I click on Desktop Link
    And I select sort by option Z to A
    Then I should see products are arrange alphabetically

  @Sanity,@Regression
  Scenario: User Should Add product to shopping cart successfully
    Given I am on Homepage
    When I hoover on computer tab
    And I click on Desktop Link
    And I select sort by option A to Z
    And I click on Build Your own computer Add To Cart Button
    And I should navigate to Build You Own Computer Page "Build your own computer"
    And I select two.two processor
    And I Select eight GB Ram
    And I select four hundred GB HDD
    And I Select Vista Home OS
    And I select Total Commander software
    And I check the price "$1,475.00"
    And I click on Add to Cart button
    Then I should be able to add product successfully "The product has been added to your shopping cart"
    And I click on alert message
