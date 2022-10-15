package ec.edu.espol.workshops;

public class CarInsurance {
	protected int age;
	protected char sex;
	protected boolean married;
	
	protected int basePremium = 500;
	
	private int premiumCalculator(boolean validLicense) {
		if(validLicense == false) {
			return -1;
		}
		if(this.age > 80) {
			return -1;
		}
    if(this.sex=='M' && this.married==false && this.age < 25) {
			this.basePremium=this.basePremium+1500;
		}
		if (this.sex== 'F' || this.married == true) {
			this.basePremium=this.basePremium-200;
		}
		if(45 <= this.age && this.age < 65) {
			this.basePremium=this.basePremium-100;
		}
		return this.basePremium;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setSex(char newSex) {
		this.sex = newSex;
	}
	public void setMarried(boolean newMarried) {
		this.married = newMarried;
	}
	public void setBasePremium(int newBase) {
		this.basePremium = newBase;
	}
	
	public int getAge() {
		return age;
	}
	public char getSex() {
		return sex;
	}
	public boolean getMarried() {
		return married;
	}
	public int getBasePremium(){
		return basePremium;
	}
	public int getPremiumCalculator(boolean data_target) {
		return this.premiumCalculator(data_target);
	}
	// antoenlla end
	
}