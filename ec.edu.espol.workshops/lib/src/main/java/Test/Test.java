package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (final String [ ] args) { 
		System.out.println("Start");
		final CarInsurance test = new CarInsurance();
		test.setAge(34);
		test.setSex('F');
		test.setMarried(true);
		System.out.println(test.getBasePremium());
	}
	
}
