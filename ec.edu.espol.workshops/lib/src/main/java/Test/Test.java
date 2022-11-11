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
            
            tests[0] = new CarInsurance(18,'M',"no");
            tests[1] = new CarInsurance(90,'F',"yes");
            
            tests[2] = new CarInsurance(49,'F',"yes");
            tests[3] = new CarInsurance(64,'M',"yes");
            tests[4] = new CarInsurance(65,'M',"yes");
            tests[5] = new CarInsurance(20,'?',"no");
            tests[6] = new CarInsurance(20,'F',"no");
            tests[7] = new CarInsurance(66,'M',"HOLA");
            
            for(int i=0; i<8; i++) {
                try {
                    System.out.println(tests[i].getPremiumCalculator(true));
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
    }        
}