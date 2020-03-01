Feature: bookCreate

  Background:
    Given I have a book dao

  Scenario Outline: When creating a new book
    When User try to add new book with title <title> and rating <rating>
    Then <title> will be available in the list of books
    Examples:
      | title | rating |
      | "Java8 in Action" | 4.5 |
      | "Spring in Action" | 4.3 |