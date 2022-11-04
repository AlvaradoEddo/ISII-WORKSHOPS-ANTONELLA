@tag
Feature: Calculate the insurance prime for a customer no valid 

  @tag1
  Scenario: Title of your scenario
    Given A male In over 80 years old married
    When Calculate the premium
    Then Shown -1

  @tag2
  Scenario: The customer is an underage
  	Given A young of 17 year old no married
  	When Calculate the premium
  	Then Shown -1