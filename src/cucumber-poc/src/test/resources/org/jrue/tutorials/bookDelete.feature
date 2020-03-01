Feature: bookDelete

  Scenario: Deleting a book
    Given I have books in my database for deletion
      | Java8 in Action | 4.4 |
      | Spring in Action | 4.5 |
      | Docker in Action | 4.6 |
      | Kubernetes in Action | 4.7 |
    When I deleted the books
      | Java8 in Action | 4.4 |
      | Spring in Action | 4.5 |
    Then I only have 2 books
    And those books are
      | Docker in Action | 4.6 |
      | Kubernetes in Action | 4.7 |