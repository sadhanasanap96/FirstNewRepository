Feature: Login test
  this is a login demo

  Scenario: Login with valid login credentials
    Given driver 'https://www.saucedemo.com/'
    * maximize()
    And input("//input[@id='user-name']","standard_user")
    And input("//input[@id='password']", "secret_sauce")
    When click("//input[@id='login-button']")
    And waitForUrl('https://www.saucedemo.com/inventory.html')
    * delay(2000)
