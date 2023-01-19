package Test;
import java.util.Scanner; 
import ec.edu.espol.workshops.CarInsurance;
public class carInsurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("CarInsurance Premium");
		CarInsurance seguro = new CarInsurance();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your age:");
		boolean flag1 = true;
		int edad = scanner.nextInt();
		seguro.setAge(edad);
		if(edad < 18 || edad > 80) {
			flag1 = false;
		}
		System.out.println("Type your sex:(M/F)");
		boolean flag2 = true;
		scanner.nextLine();
		String gender = scanner.nextLine();
		if(gender.equals("m") ) {
			seguro.setSex('M');
		}
		else if(gender.equals("M"))  {
			seguro.setSex('M');
		}
		else if(gender.equals("male"))  {
			seguro.setSex('M');
		}
		else if(gender.equals("man"))  {
			seguro.setSex('M');
		}
		else if(gender.equals("f") ) {
			seguro.setSex('F');
		}
		else if(gender.equals("F"))  {
			seguro.setSex('F');
		}
		else if(gender.equals("female") ) {
			seguro.setSex('F');
		}
		else if(gender.equals("mujer") ) {
			seguro.setSex('F');
		}
		else {
			flag2 = false;
		}
		
		System.out.println("Are you married?:(yes/no)");
		String married = scanner.nextLine();
		
		if (married.equals("yes") || married.equals("YES") || married.equals("true") || married.equals("TRUE"))  {
			seguro.setMarried(true);
		}
		else if (married.equals( "y") || married.equals( "Y") ||  married.equals( "si") || married.equals( "SI") || married.equals( "S") || married.equals( "s")) {
			seguro.setMarried(true);
		}
		else if (married.equals("no") || married.equals("NO"))  {
			seguro.setMarried(false);
		}
		else if (married.equals("n") || married.equals("N"))  {
			seguro.setMarried(false);
		}
		else {
			seguro.setMarried(false);
		}

		System.out.println("Do you  have  a valid license?:(yes/no)");
		boolean flag = true;
		String valid = scanner.nextLine();
		if (valid.equals("yes") || valid.equals("YES") || valid.equals("true") || valid.equals("TRUE")) {
			seguro.getPremiumCalculator(true);
		}
		else if (valid.equals("y") || valid.equals("Y") || valid.equals("SI") || valid.equals("si") || valid.equals("s") || valid.equals("S")) {
			seguro.getPremiumCalculator(true);
		}
		else if (valid.equals("no") || valid.equals("NO")) {
			seguro.getPremiumCalculator(false);
			flag = false;
		}
		else if (valid.equals("n") || valid.equals("N")) {
			seguro.getPremiumCalculator(false);
			flag = false;
		}
		else {
			seguro.getPremiumCalculator(false);
			flag = false;
		}
				
		
		if (!flag || !flag1 || !flag2) {
			System.out.println(-1);
			System.out.println("You can not get an insurance");
			return;
		}
		System.out.println("El seguro es de:");
		System.out.println(seguro.getBasePremium());
}}
