package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	private int actualAnswer;
	public CarInsurance carInsurance = new CarInsurance();
	

	@Given("In over 80 years old ")
	public void citizen_is_over80() {
		carInsurance.setAge(90);
	}
	@When("Shown -1")
	public void we_calculate_the_premium_over80() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("we should recive -1")
	public void we_should_recive_over80(){
		assertEquals(0, actualAnswer);
	} 
	
	@Given("An unvalid license")
	public void valid_license() {
		 try {
			 carInsurance.getPremiumCalculator(false);
         }catch(Exception e) {
             System.out.println(e.getMessage());
         }
	}
	@When("Validate the license in the premiunCalculator function ")
	public void we_valid_the_license() {
		actualAnswer = carInsurance.getBasePremium();
	}
	
	@Then("Shown -1 ")
	public void we_should_recive_license(){
		assertEquals(0, actualAnswer);
	} 
	
	
	@Given("A negative number ")
	public void valid_age() {
		carInsurance.setAge(-23);
	}
	@When("Validate the customer age in the premiunCalculator function")
	public void we_valid_the_age() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("Shown exception")
	public void we_should_recive_negAge(){
		assertEquals(0, actualAnswer);
	} 
	
	
	@Given("A diferent char or another sex ")
	public void citizen_sex() {
		carInsurance.setSex('?');
	}
	@When(" Validate the customer sex in the premiunCalculator function ")
	public void we_valid_the_sex() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("Shown exception ")
	public void we_should_recive_sex(){
		assertEquals(0, actualAnswer);
	} 
	
	
	@Given("citizen is underage")
	public void citizen_is_underage() {
		carInsurance.setAge(17);
	}
	@When("we calculate the premium")
	public void we_calculate_the_premium() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("we should recive -1")
	public void we_should_recive(){
		assertEquals(0, actualAnswer);
	} 
	
	@Given("Customer writes their {char}, {int} and {boolean}")
	public void citizen_validation_premium() {
		carInsurance.setAge(20);
		carInsurance.setSex('F');
		carInsurance.setMarried(false);
	}
	@When("we calculate the premium")
	public void calculate_the_premium() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("I should be told {int}")
	public void calculate_answer(){
		assertEquals(0, actualAnswer);
	}
	
}
