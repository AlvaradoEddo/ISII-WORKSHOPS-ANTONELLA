@tag
Feature: Calculate the insurance prime for a customer with invalid data

  @tag4
  Scenario: The Male customer age is over 80 years old, Married
    Given A male In over 80 years old married
    When Calculate the premium
    Then Shown -1

  @tag5
  Scenario: The customer is an underage
  	Given A young of 17 year old no married
  	When Calculate the premium
  	Then Shown -1
  	
  @tag6
  Scenario: A male customer that has an invalid license and is not married
  	Given An unvalid license
  	When Validate the license in the premiunCalculator function
  	Then Shown -1
  	
  @tag7
  Scenario: The customer writes their age
  	Given A negative number
  	When Calculate the premium
  	Then Shown -1
  	
  @tag8
  Scenario: The customer writes their sex
  	Given A diferent char or another sex
  	When Calculate the premium
  	Then Shown -1

 