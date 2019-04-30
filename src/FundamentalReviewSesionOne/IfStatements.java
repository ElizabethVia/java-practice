package FundamentalReviewSesionOne;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age =scan.nextInt();
	if(age>0 && age<21) {
			//if its true 
			System.out.println("Underage!");
		}else if(age<1) {
			System.out.println("Invalid age");
		}else {
				
			//if its false
			System.out.println("You are fine!");
		}
	}
		

	}


