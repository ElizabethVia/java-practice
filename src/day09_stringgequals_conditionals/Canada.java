package day09_stringgequals_conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.println("What is the capital of Canada?");
		 String capital=scan.nextLine();
		 if (capital.equalsIgnoreCase("Ottawa")) {
			 System.out.println("Your answer is correct!");
		 }else {
			 System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
		 }
		
		// if (capital.equals("Ottawa")) {
			// System.out.println("Your answer is correct!");
		// }else {
		//	 System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
		
	}

}
