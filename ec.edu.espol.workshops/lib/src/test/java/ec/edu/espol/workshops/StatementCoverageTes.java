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
		try {
			CarInsurance Prueba = new CarInsurance();
			Prueba.setAge(70);
			Prueba.setSex('M');
			Prueba.setMarried(false);
			assertEquals(-1, Prueba.getPremiumCalculator(false));
		} catch (Exception e) {

		}

		// Prueba 2
		try {
			CarInsurance Prueba2 = new CarInsurance();
			Prueba2.setAge(30);
			Prueba2.setSex('?');
			Prueba2.setMarried(false);
			assertEquals("Solo aceptamos genero masculino y femenino", Prueba2.getPremiumCalculator(true));
		} catch (Exception e) {
			final String message = "Solo aceptamos genero masculino y femenino.";
			assertEquals(message, e.getMessage());
		}

		// Prueba 3
		try {
			CarInsurance Prueba3 = new CarInsurance();
			Prueba3.setAge(-20);
			Prueba3.setSex('M');
			Prueba3.setMarried(true);
			assertEquals("La edad no puede ser negativa", Prueba3.getPremiumCalculator(true));
		} catch (Exception e) {
			final String message = "La edad no puede ser negativa";
			assertEquals(message, e.getMessage());
		}

		// Prueba 4
		try {
			CarInsurance Prueba4 = new CarInsurance();
			Prueba4.setAge(85);
			Prueba4.setSex('M');
			Prueba4.setMarried(false);
			assertEquals(-1, Prueba4.getPremiumCalculator(true));
		} catch (Exception e) {

		}

		// Prueba 5
		try {
			CarInsurance Prueba5 = new CarInsurance();
			Prueba5.setAge(46);
			Prueba5.setSex('F');
			Prueba5.setMarried(false);
			assertEquals(200, Prueba5.getPremiumCalculator(true));
		} catch (Exception e) {4

		}

		// Prueba 6
		try {
			CarInsurance Prueba6 = new CarInsurance();
			Prueba6.setAge(23);
			Prueba6.setSex('M');
			Prueba6.setMarried(false);
			assertEquals(2000, Prueba6.getPremiumCalculator(true));
		} catch (Exception e) {

		}
		/*
		 * String str = "Junit is working fine";
		 * assertEquals("Junit is working fine",str);
		 */
	}

}
