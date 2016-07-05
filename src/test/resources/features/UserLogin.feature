Feature: User's ability to login
  All registered users with valid credentials should be able to login successfully


  Scenario Outline: User should not be able to login with invalid credentials
    Given I launch Vodafone website
    When I login as a invalid user with <username> and <password> and click on login button
    Then I should see error message below the username field as <errorMessage>

    Examples:
      | username        | password        | errorMessage |
      | InvalidUserName | InvalidPassword | Your email address is not registered for My Vodafone.             |

  Scenario Outline: User should see login URL when clicked on My Vodafone link
    Given I launch Vodafone website
    When I click on my vodafone link
    Then I should see the url <url>

    Examples:
      | url |
      | http://www.vodafone.co.nz/using-myvodafone/ |


