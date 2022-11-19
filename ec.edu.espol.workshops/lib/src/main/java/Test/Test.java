package Test;

 

import ec.edu.espol.workshops.CarInsurance;

 

public class Test {
    public static void main (String [ ] args) {
         System.out.println("Start");
            CarInsurance test = new CarInsurance();
            test.setAge(-15);
            test.setSex('F');
            test.setMarried(true);
            
            CarInsurance tests[] = new CarInsurance[20];
            
            tests[0] = new CarInsurance(18,'M',"no");
            tests[1] = new CarInsurance(17,'M',"no"); 
            tests[2] = new CarInsurance(19,'F',"yes");
            tests[3] = new CarInsurance(80,'M',"yes");
            tests[4] = new CarInsurance(79,'M',"yes");
            tests[5] = new CarInsurance(81,'F',"no");
            
            tests[6] = new CarInsurance(46,'M',"no");
            tests[7] = new CarInsurance(45,'M',"no");
            tests[8] = new CarInsurance(47,'M',"no");
            tests[9] = new CarInsurance(64,'M',"no");
            tests[10] = new CarInsurance(63,'M',"no"); 
            tests[11] = new CarInsurance(65,'F',"no");
      
            tests[12] = new CarInsurance(24,'M',"yes");
            tests[13] = new CarInsurance(23,'M',"no");
            tests[14] = new CarInsurance(25,'F',"yes");
            tests[15] = new CarInsurance(25,'M',"no");
            tests[16] = new CarInsurance(63,'F',"no");
            tests[17] = new CarInsurance(19,'F',"no");
            
            
            for(int i=0; i<18; i++) {
                try {
                    System.out.println(tests[i].getPremiumCalculator(true));
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
    }        
}