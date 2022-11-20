Feature: Verify if an user can create Gitlab issue

  @Regression
  Scenario Outline: Verify issue creation for a valid user
    Given A user access a private gitlab repo with valid access
    When user creates an issue with details
      |title  |description  |milestone_id  | iid  |
      |<title>|<description>|<milestone_id>| <iid>|
    Then Issue is created with status code 201
    And the issue is visible list of total Issues
    Examples:
      |title            |description       |milestone_id  |  iid  |
      |new Title        | new description  |              | 1     |
      |milestone title  |  description     |   2881303    | 2     |

  @Regression
  Scenario: Verify issue creation for a invalid user
    Given A user access a private gitlab repo with invalid access
    When user creates an issue using UnAuthorizedDetails
    Then Issue is created with status code 401

  @Regression
  Scenario: Verify issue creation is not possible for duplicate details
    Given A user access a private gitlab repo with valid access
    When user creates an issue using DuplicateDetails
    Then Issue is created with status code 409
    And the issue is not visible list of total Issues

    @Bug @Regression
  Scenario: Verify issue creation is not possible with past details
      Given A user access a private gitlab repo with valid access
      When user creates an issue with details
        |title            | created_at                    | iid|
        |old date title   |  2012-12-24T16:12:26.314Z     | 3  |
      Then Issue is created with status code 400
