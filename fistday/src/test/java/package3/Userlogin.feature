

#Feature: User Login
  
  #Scenario Outline: multiple user Login
   # Given I want to entersss "<Username>"
#    When I want to enterssss "<password>"
#      | Username | password |
  #    | sam      |   abc@123| 
  #    | suba     |   cba@321| 
   # Then the page is displayed*/
   
   Feature: Account
    Scenario Outline: Creation
    Given I want to create account
    When user enter details
      | Username | password |
      | sam      |   abc@123| 
      | suba     |   cba@321| 
Then the page is displayed
   
     
