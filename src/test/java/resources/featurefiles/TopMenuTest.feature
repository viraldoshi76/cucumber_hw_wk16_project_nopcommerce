Feature:Top Menu Test
  As a user I want to navigate to computer page from homepage.

@Smoke,@Sanity
  Scenario: Use should navigate to computer page successfully.
    Given I am on Homepage
    When I click on computers tab
    Then I should navigate to computers page
