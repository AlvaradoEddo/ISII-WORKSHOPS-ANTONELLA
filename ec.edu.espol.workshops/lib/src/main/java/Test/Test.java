package Test;

 

import ec.edu.espol.workshops.CarInsurance;

 

public class Test {
    public static void main (String [ ] args) {
         System.out.println("Start");
            CarInsurance test = new CarInsurance();
            test.setAge(-15);
            test.setSex('F');
            test.setMarried(true);
            
            CarInsurance tests[] = new CarInsurance[10];
            
            tests[0] = new CarInsurance(17,'F',true);
            tests[1] = new CarInsurance(46,'F',true);
            tests[2] = new CarInsurance(20,'M',false);
            tests[3] = new CarInsurance(40,'M',false);
            tests[4] = new CarInsurance(46,'M',false);
            tests[5] = new CarInsurance(20,'?',false);
            tests[6] = new CarInsurance(70,'F',false);
            tests[7] = new CarInsurance(90,'M',true);
            tests[8] = new CarInsurance(-90,'M',false);
            
            for(int i=0; i<9; i++) {
                try {
                    System.out.println(tests[i].getPremiumCalculator(true));
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
    }        
}