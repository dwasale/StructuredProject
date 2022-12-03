Feature: Category

  @category
  Scenario Outline: As a user, I should be able to navigate to category pages successfully

    When I click on "<category_name>" link button
    Then I should be able to navigate "<category_link>" page successfully

    Examples:
      | category_name     | category_link     |
      | Computers         | computers         |
      | Electronics       | electronics       |
      | Apparel           | apparel           |
      | Digital downloads | digital-downloads |
      | Books             | books             |
      | Jewelry           | jewelry           |
      | Gift Cards        | gift-cards        |




