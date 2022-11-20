Feature: Verify if user can read the issues

  @Regression
  Scenario Outline: Verify users are able to view issues of different IssueTypes
    Given A user access a <repositoryType> gitlab repo with <userType> access
    When user tries to view all the issues
    Then All the list of issues <status> Visible
    Examples:
    |userType    |repositoryType|status|
    |valid       |public        |are    |
    |valid       |private       |are    |
    |invalid     |public        |are    |
    |invalid     |private       |are not|

  @Bug @Regression
  Scenario: Verify a user can view issues with milestones using view Issues ApI
    Given A user access a private gitlab repo with valid access
    When user tries to view issue with Milestone 2881303
    Then All the list of issues are Visible
    And Issue with Iid 2, is available in the list
