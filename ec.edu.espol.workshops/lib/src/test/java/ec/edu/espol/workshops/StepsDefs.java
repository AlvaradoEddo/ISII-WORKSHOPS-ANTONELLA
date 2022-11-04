package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	private int actualAnswer;
	public CarInsurance carInsurance = new CarInsurance();
	

	@Given("A male In over 80 years old married")
	public void citizen_is_over80() {
		carInsurance.setAge(90);
		carInsurance.setSex('M');
		carInsurance.setMarried(true);
	}
	
	@When("Calculate the premium")
	public void we_calculate_the_premium_validLecense() {
		try {
		actualAnswer = carInsurance.getPremiumCalculator(true);
		}catch(Exception e) {
			
		}
	}
	@Then("Shown -1")
	public void we_should_recive_over80(){
		assertEquals(-1, actualAnswer);
	} 
	
	@Given("An unvalid license")
	public void valid_license() {
		
	}
	
	@When("Validate the license in the premiunCalculator function")
	public void we_validate_license() {
		try {
		actualAnswer = carInsurance.getPremiumCalculator(false);
		}catch(Exception e) {
			
		}
	}
	
	
	
}
