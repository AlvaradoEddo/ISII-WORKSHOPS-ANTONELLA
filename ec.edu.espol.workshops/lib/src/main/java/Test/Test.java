package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (String [ ] args) {
		 System.out.println("Start");
	        CarInsurance test = new CarInsurance();
	        test.setAge(-15);
	        test.setSex('F');
	        test.setMarried(true);
	        CarInsurance testTa = new CarInsurance(20,'F',true);
	        CarInsurance testTb = new CarInsurance(46,'F',true);
	        CarInsurance testTc = new CarInsurance(20,'M',false);
	        CarInsurance testTd = new CarInsurance(40,'M',false);
	        CarInsurance testTe = new CarInsurance(46,'M',false);
	        CarInsurance testTf = new CarInsurance(20,'?',false);
	        CarInsurance testTg = new CarInsurance(70,'F',false);
	        CarInsurance testTh = new CarInsurance(90,'M',false);
	        CarInsurance testTi = new CarInsurance(-90,'M',false);
	        System.out.println(testTa.getPremiumCalculator(true));
	        System.out.println(testTb.getPremiumCalculator(true));
	        System.out.println(testTc.getPremiumCalculator(true));
	        System.out.println(testTd.getPremiumCalculator(true));
	        System.out.println(testTe.getPremiumCalculator(true));
	        System.out.println(testTf.getPremiumCalculator(true));
	        System.out.println(testTg.getPremiumCalculator(true));
	        System.out.println(testTh.getPremiumCalculator(true));
	        System.out.println(testTi.getPremiumCalculator(true));
	}		
}
