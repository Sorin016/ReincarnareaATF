Feature: Login first test


#  Scenario:  The first login
#    Given User insert username
#    And User insert password
#    When User click submit
#    Then User is redirect to the home page
# @UI @Run
  Scenario Outline:  The first login
    Given User inserts <username>
    And User insert <password>
    When User click submit
    Then User is redirect to the home page
    Examples:
      | username | password |
      | Admin    | admin123 |
#      | Sorin    | admin123 |
