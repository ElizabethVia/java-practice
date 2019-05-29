package day52_Inheritance05;

public class finalVariables {
	public final int ROADSTER_MAX_RANGE=610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEX_X_PASSENGERS;
	public final String JAN="January";
	
	public static final String COMPANY_NAME="Cybertek";
	public static final String ADMIN_USERNAME;
	static {
		ADMIN_USERNAME= "admin@gmail.com";
	}
	public finalVariables() {
		 
		 MODEL_3_MAX_SPEED=180;
	}
	/*
	public finalVariables(int max) {
		 
		 MODEL_3_MAX_SPEED=max;
	}
	*/
	{
		MODEX_X_PASSENGERS=7;
	}
	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT=5;
		//MAX_PASSENGERS_COUNT=10; WE CANNOT UPDATE THE VALUE

		System.out.println( MAX_PASSENGERS_COUNT);//5
		final int SSN;
		SSN=321458712;
		//SSN++; is not possible
		System.out.println(SSN);
		finalVariables finalVars=new finalVariables();
		System.out.println("Max range for roaster: "+finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: "+finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model X passengers: "+finalVars.MODEX_X_PASSENGERS);
		
		System.out.println("Company name: "+COMPANY_NAME);
		System.out.println("Company name: "+finalVariables.COMPANY_NAME);
		System.out.println("Admin: "+ADMIN_USERNAME);
	}

}
