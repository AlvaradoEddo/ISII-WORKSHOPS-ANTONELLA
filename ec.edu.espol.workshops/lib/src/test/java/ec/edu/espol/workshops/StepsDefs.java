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
	
	@Given("A young of 17 year old no married")
	public void citizen_is_under18() {
		carInsurance.setAge(17);
		carInsurance.setSex('M');
		carInsurance.setMarried(false);
	}
	
	@When("Calculate the premium")
	public void we_calculate_the_premium_validLecense() {
		try {
		actualAnswer = carInsurance.getPremiumCalculator(true);
		}catch(Exception e) {
			
		}
	}
	
	@When("Validate the license in the premiunCalculator function")
	public void we_validate_license() {
		try {
		actualAnswer = carInsurance.getPremiumCalculator(false);
		}catch(Exception e) {
			
		}
	}
	
	
	@Then("Shown -1")
	public void we_should_recive_over80(){
		assertEquals(-1, actualAnswer);
	} 


	
	
	
}
