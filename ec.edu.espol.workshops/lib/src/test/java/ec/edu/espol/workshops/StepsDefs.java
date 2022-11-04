package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

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
	
	@Given("An unvalid license")
	public void valid_licese() {
		carInsurance.setAge(30);
		carInsurance.setSex('M');
		carInsurance.setMarried(false);
	}
	
	@Given("A negative number")
	public void invalid_age() {
		carInsurance.setAge(-23);
		carInsurance.setSex('M');
		carInsurance.setMarried(false);
	}
	
	@Given("A diferent char or another sex")
	public void invalid_sex() {
		carInsurance.setAge(23);
		carInsurance.setSex('?');
		carInsurance.setMarried(false);
	}
	
	@Given("A female person who is 70 years old and is a widow.")
	public void calculate_customer_insurance() {
		carInsurance.setAge(70);
		carInsurance.setSex('F');
		carInsurance.setMarried(false);
	}
	
	@Given("A male person who is not married and is 20 years old")
	public void calculate_customer_insurance2() {
		carInsurance.setAge(20);
		carInsurance.setSex('M');
		carInsurance.setMarried(false);
	}
	
	@Given("A female person who is married and is 46 years old")
	public void calculate_customer_insurance3() {
		carInsurance.setAge(46);
		carInsurance.setSex('F');
		carInsurance.setMarried(true);
	}
	
	@When("Calculate the premium")
	public void we_calculate_the_premium_validLecense() {
		try {
		actualAnswer = carInsurance.getPremiumCalculator(true);
		}catch(Exception e) {
			
		}
	}
	
	@When("Validate the license in the premiunCalculator function")
	public void we_calculate_premium_validLecense() {
		try {
		actualAnswer = carInsurance.getPremiumCalculator(false);
		}catch(Exception e) {
			
		}
	}
	
	
	@Then("Shown -1")
	public void we_should_recive_over80(){
		assertEquals(-1, actualAnswer);
	} 
	
	@Then("Shown 300")
	public void answer(){
		assertEquals(300, actualAnswer);
	} 
	
	@Then("Shown 2000")
	public void answer2(){
		assertEquals(2000, actualAnswer);
	} 
	
	@Then("Shown 200")
	public void answer3(){
		assertEquals(200, actualAnswer);
	} 





	
	
	
}
