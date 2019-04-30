import java.util.Scanner;

public class GuessName {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 String email = input.nextLine();
	      
	      //Write your code below
	      String[]emailArray=email.split("@");
	     // for(String a:emailArray){
	       if(email.contains("@")) {
	        	
	        	  System.out.println("Email id: "+emailArray[0]);
	  	        System.out.println("Email domain: "+emailArray[1]);
	  	       
	        }else {
	        	System.out.println("invalid email");
	        }
	       
	    	//  System.out.println("Email id: "+emailArray[0]);
	      //  System.out.println("Email domain: "+emailArray[1]);
	       
	      }
	/*
	 * String[]emailArray=email.split("@"); // for(String a:emailArray){
	 * System.out.println("Email id: "+emailArray[0]);
	 * System.out.println("Email domain: "+emailArray[1]);
	 * 
	 */
}
