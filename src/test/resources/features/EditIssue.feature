Feature: Verify if an user can edit the existing issue

  @Regression
  Scenario Outline: Verify an valid user is able to update an existing Issue
    Given A user access a private gitlab repo with valid access
    When user tries to edit an issue with details
      |title  |state_event  |milestone_id  |created_at| iid  |
      |<title>|<state_event>|<milestone_id>|<created_at>| <iid>|
    Then Issue is updated successfully
    And the issue is updated correctly
      |title  |state_event  |milestone_id  |created_at| iid  |
      |<title>|<state_event>|<milestone_id>|<created_at>| <iid>|
    And Issue with Iid <iid>, is available in the list
    Examples:
      |title            |state_event       |milestone_id  |created_at  | iid  |
      |updated Title    |                  |              |            | 2     |
      |                 |  close           |              |            | 2     |
      |                 |                  | 2881303      |            | 1     |
      |                 |                  |     | 2032-10-25T17:28:33.777Z| 1 |
