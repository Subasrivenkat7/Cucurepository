

Feature: Account
 

  Scenario: Creation
  
    Given I want to create account
    When  user enter details
    | Username | password |
    | sam      |   abc@123| 
    | suba     |   cba@321| 
	Then enter the submit button
      