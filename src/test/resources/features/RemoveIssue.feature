Feature: Verify user can remove or delete the existing issue

  @Regression
  Scenario Outline: Verify user is able to delete the existing issue
    Given A user access a <repositoryType> gitlab repo with <userType> access
    When user tries to delete an issue with <iid> details
    Then Issue <status> deleted successfully
    And Issue with Iid <iid>, <statusDelete> available in the list
    Examples:
    | userType     | repositoryType  |  iid  | status | statusDelete|
    | valid        | private         |  1    | is     | is not      |
    | invalid      | private         |  2    | is not | is          |
    | valid        | private         |  2    | is     | is not      |
    | valid        | private         |  3    | is     | is not      |
    | valid        | private         |  3    | is not | is not      |
    | invalid      | public          |  1    | is not | is          |
