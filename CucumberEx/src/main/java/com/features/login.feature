Feature: JBK offline application test

  Scenario Outline: Login Test
    Given user on login page
    When user enters username as <username> and password as <password>
    Then user should be on home page

    Examples: | username        | password |
      | kiran@gmail.com | 123456 |
