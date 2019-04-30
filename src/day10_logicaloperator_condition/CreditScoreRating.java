package day10_logicaloperator_condition;
import java.util.*;
public class CreditScoreRating {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your credit score:");
		int creditScore= scan.nextInt();
		
		//Excellent =>750-850
		if(creditScore >=750 && creditScore <=850) {
			System.out.println("Excellent");
			
		}else if(creditScore >=700 && creditScore <= 749) {
			System.out.println("Good");
		}else if(creditScore >= 650 && creditScore <= 699) {
			System.out.println("fair");
		}else if(creditScore >=550 && creditScore <= 649) {
			System.out.println("Poor");
		}else if(creditScore >= 0 && creditScore <= 549) {
			System.out.println("Bad");
		}else {
			System.out.println("Invalid score");
		}
	
	
	
		int vehicleYear;
	    System.out.println("Enter vehicle's year:");
	    vehicleYear=scan.nextInt();
	    if(vehicleYear <=1995 || vehicleYear>=1998 && vehicleYear >=2001|| vehicleYear<= 2002 && vehicleYear >=2004|| vehicleYear<= 2006 && vehicleYear >=2015|| vehicleYear<= 2017){
	     
	      System.out.println("Your vehicle needs to be recalled!");
	    
	      }else{
	   
	         System.out.println("Your vehicle is fine, enjoy!");
	       
	      }   
	         
	         
	     
	   
	
	
	
	
	
	}
	
	
	

}
