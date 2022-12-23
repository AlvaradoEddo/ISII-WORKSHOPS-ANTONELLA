package ec.edu.espol.workshops;

import ec.edu.espol.workshops.CarInsurance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StatementCoverageTes {

	@Test
	public void testStament() {
		// Prueba 1
			CarInsurance Prueba = new CarInsurance();
			Prueba.setAge(70);
			Prueba.setSex('M');
			Prueba.setMarried(false);
			assertEquals(-1, Prueba.getPremiumCalculator(false));
		

		// Prueba 2
		
			CarInsurance Prueba2 = new CarInsurance();
			Prueba2.setAge(30);
			Prueba2.setSex('?');
			Prueba2.setMarried(false);
			assertEquals(-1, Prueba2.getPremiumCalculator(true));
		

		// Prueba 3
			CarInsurance Prueba3 = new CarInsurance();
			Prueba3.setAge(-20);
			Prueba3.setSex('M');
			Prueba3.setMarried(true);
			assertEquals(-1, Prueba3.getPremiumCalculator(true));
		

		// Prueba 4
	
			CarInsurance Prueba4 = new CarInsurance();
			Prueba4.setAge(85);
			Prueba4.setSex('M');
			Prueba4.setMarried(false);
			assertEquals(-1, Prueba4.getPremiumCalculator(true));
		

		// Prueba 5
		
			CarInsurance Prueba5 = new CarInsurance();
			Prueba5.setAge(46);
			Prueba5.setSex('F');
			Prueba5.setMarried(false);
			assertEquals(200, Prueba5.getPremiumCalculator(true));
		

		// Prueba 6
		
			CarInsurance Prueba6 = new CarInsurance();
			Prueba6.setAge(23);
			Prueba6.setSex('M');
			Prueba6.setMarried(false);
			assertEquals(2000, Prueba6.getPremiumCalculator(true));

		/*
		 * String str = "Junit is working fine";
		 * assertEquals("Junit is working fine",str);
		 */
	}

}
