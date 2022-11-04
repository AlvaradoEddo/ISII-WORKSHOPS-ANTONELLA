Feature: Calculate the insurance prime for a customer 

	Scenario: The Male customer age is over 80 years old, Married  
	Given A male In over 80 years old married 
	When Calculate the premium
	Then Shown -1
	
