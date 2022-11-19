package Test;

 

import ec.edu.espol.workshops.CarInsurance;

 

public class Test {
    public static void main (String [ ] args) {
         System.out.println("Start");
            CarInsurance test = new CarInsurance();
            test.setAge(-15);
            test.setSex('F');
            test.setMarried(true);
            
            CarInsurance tests[] = new CarInsurance[30];
            
            tests[0] = new CarInsurance(18,'M',"no");
            tests[1] = new CarInsurance(17,'M',"no"); 
            tests[2] = new CarInsurance(19,'M',"no");
            tests[3] = new CarInsurance(24,'M',"no");
            tests[4] = new CarInsurance(23,'M',"no");
            tests[5] = new CarInsurance(25,'M',"no");
            
            tests[6] = new CarInsurance(25,'M',"yes");
            tests[7] = new CarInsurance(24,'F',"no");
            tests[8] = new CarInsurance(26,'F',"yes");
            tests[9] = new CarInsurance(44,'M',"no");
            tests[10] = new CarInsurance(43,'M',"yes"); 
            tests[11] = new CarInsurance(45,'F',"no");
      
            tests[12] = new CarInsurance(45,'F',"no");
            tests[13] = new CarInsurance(44,'F',"yes");
            tests[14] = new CarInsurance(46,'F',"no");
            tests[15] = new CarInsurance(64,'M',"no");
            tests[16] = new CarInsurance(63,'M',"yes");
            tests[17] = new CarInsurance(65,'M',"yes");
            
            tests[18] = new CarInsurance(65,'M',"yes");
            tests[19] = new CarInsurance(64,'M',"no");
            tests[20] = new CarInsurance(66,'F',"yes");
            tests[21] = new CarInsurance(80,'M',"no");
            tests[22] = new CarInsurance(79,'F',"no");
            tests[23] = new CarInsurance(81,'F',"no");
            
            for(int i=0; i<24; i++) {
                try {
                    System.out.println(tests[i].getPremiumCalculator(true));
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
    }        
}