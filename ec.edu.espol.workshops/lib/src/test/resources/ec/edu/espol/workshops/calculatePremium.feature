@tag
Feature: Calculate the insurance prime for a customer with valid data

  @tag1
  Scenario: The customer writes their sex, age and marital status
    Given A female person who is 70 years old and is a widow. 
    When Calculate the premium
    Then Shown 300

  @tag2
  Scenario: The customer writes their sex, age and marital status
  	Given A male person who is not married and is 20 years old
  	When Calculate the premium
  	Then Shown 2000
  	
  @tag3
  Scenario: The customer writes their sex, age and marital status
  	Given A female person who is married and is 46 years old
  	When Calculate the premium
  	Then Shown 200
  	
 