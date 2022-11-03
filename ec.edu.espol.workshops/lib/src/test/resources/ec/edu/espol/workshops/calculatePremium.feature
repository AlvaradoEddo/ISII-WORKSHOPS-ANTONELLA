Feature: Calculate the insurance prime for a customer 

 Scenario: The customer age is over 80 years old 
 Given In over 80 years old 
 When Calculate the premium 
 Then Shown -1 
 
Feature: Validate if the license is valid 

 Scenario: The customer license is valid  
 Given An unvalid license 
 When Validate the license in the premiunCalculator function 
 Then Shown -1  
 
 Feature: Validate if the customer큦 age is not negative 

 Scenario: The customer writes their age 
 Given A negative number 
 When Validate the customer큦 age in the premiunCalculator function 
 Then Shown exception  
 
 Feature: Validate if the customer큦 sex is only 'F' or 'M' 

 Scenario: The customer writes their sex 
 Given A diferent char or another sex 
 When Validate the customer큦 sex in the premiunCalculator function 
 Then Shown exception  
 
 Feature: Calculate the insurance prime for a customer

 Scenario: The customer is an underage 
 Given Is an uderage
 When Calculate the premium
 Then Shown -1 
 
 Feature: Validate sex, age and marital status 

 Scenario: The customer writes their sex, age and marital status 
 Given Customer writes their "<sex>", "<age>" and "<married>"
 When I Calculate the premium 
 Then I should be told "<answer>"
 
 Examples:
 | sex | age | married | answer |
 | F | 70 | false | 300 |
 | M | 20 | false | 2000 |
 | F | 46 | true | 200 |
 | M | 16 | false | -1 |




 
