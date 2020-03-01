Feature: bookUpdate

  Scenario: Deleting a book
    Given I have books in my database
      | Java8 in Action | 4.5 |
      | Spring in Action | 4.3 |
    When I update the rating of "Java8 in Action" to "4.6"
    Then the rating of "Java8 in Action" is now "4.6"