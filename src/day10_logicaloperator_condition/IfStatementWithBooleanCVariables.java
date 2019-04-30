package day10_logicaloperator_condition;

public class IfStatementWithBooleanCVariables {

	public static void main(String[] args) {
		boolean isBreakTime= true;
		if (isBreakTime==true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		
		//second version
		if (isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		
		boolean classTime=false;
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("code and have time");
		}else {
			System.out.println("Take a walk and have some water");
		}
		
		boolean qualified=false;
		//send a notification message if not qualified
		//we need to check if qualified variable contains False
		//true
		if(qualified == false) {
			System.out.println("Your application was not aprove. Thank you");
		}
			
	}

}
