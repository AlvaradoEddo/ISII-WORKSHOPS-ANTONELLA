import java.util.Scanner;
package ec.edu.espol.workshops;

public class CarInsurance {

	int age = 0;
	char sex = ' ';
	String maritalStatus = "Hola" ;
	int base_premium = 500;
	boolean valid_license = false;
  String venta = "";  
	Scanner read = new Scanner (System.in);
//Input age
  System.out.println("Enter your age: ");
  age = read.nextInt();
//Input sex
  System.out.println("Enter your sex F or M: ");
  sex=Character.toUpperCase(read.next().charAt(0)); 
  while (sex != 'M' && sex != 'F'){
    if (sex != 'M' && sex != 'F'){
       System.out.print("Please, just enter F or M \n");
    System.out.println("Enter your sex: ");
    sex=Character.toUpperCase(read.next().charAt(0)); 
    }
  }
//Input marital status
  System.out.println("Enter your marital status married or not married:");
  maritalStatus=read.next(); 

//Validations
    if(sex == 'M' && maritalStatus.equals("not married") && age < 25) {
		base_premium =  base_premium + 1500;
    System.out.print(base_premium);
	}
	
	if(sex == 'F' && maritalStatus.equals("married") && age < 25) {
		base_premium =  base_premium - 200;
	}
	
	if(age >= 45 && age < 65) {
		base_premium =  base_premium - 100;
	}
	
	if(age > 80) {
		venta = "No se puede vender el vehículo";
	}
  }
	
}
