package Test;

 

import ec.edu.espol.workshops.CarInsurance;

 

public class Test {
    public static void main (String [ ] args) {
         System.out.println("Start");
            CarInsurance test = new CarInsurance();
            test.setAge(-15);
            test.setSex('F');
            test.setMarried(true);
            
            CarInsurance tests[] = new CarInsurance[25];
            
            tests[0] = new CarInsurance(20,'F',true);
            tests[1] = new CarInsurance(46,'F',true);
            tests[2] = new CarInsurance(20,'M',false);
            tests[3] = new CarInsurance(40,'M',true);
            tests[4] = new CarInsurance(46,'M',false);
            tests[5] = new CarInsurance(20,'?',false);
            tests[6] = new CarInsurance(70,'F',false);
            tests[7] = new CarInsurance(90,'M',false);
            tests[8] = new CarInsurance(-90,'F',false);
            // TEST FOR THE NEW REQUIREMENTS
            // unit test plan
            tests[9] = new CarInsurance(65, 'F', false); //T1
            tests[10] = new CarInsurance('s', 'M', true); //T2
            
            //system test plan
            tests[11] = new CarInsurance(29, 'M', true); //T3
            tests[12] = new CarInsurance(30, 'M', true); //T4
            tests[13] = new CarInsurance(31, 'M', true); //T5
            tests[14] = new CarInsurance(59, 'M', true); //T6
            tests[15] = new CarInsurance(60, 'M', true); //T7
            tests[16] = new CarInsurance(61, 'M', true); //T8
            tests[17] = new CarInsurance(59, 'F', false); //T9
            tests[18] = new CarInsurance(60, 'F', false); //T10
            tests[19] = new CarInsurance(61, 'F', false); //T11
            tests[20] = new CarInsurance(90, 'M', true); //T12
            tests[21] = new CarInsurance(59, '?', false); //T13
            tests[22] = new CarInsurance(-23, 'F', false); //T14
            tests[23] = new CarInsurance(12, 'F', false); //T15
            
            for(int i=0; i<24; i++) {
            	System.out.println(tests[i].getPremiumCalculator(true));
            }
            
            
    }        
}
