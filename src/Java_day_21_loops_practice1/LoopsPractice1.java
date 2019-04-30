package Java_day_21_loops_practice1;

import java.util.Scanner;

public class LoopsPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		
		int sum=0;
		do {
			System.out.println("Enter 2 numbers");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			sum=num1+num2;		
			}while(sum<=100);//if sum is less than 100 it will keep asking two enter numbers
		System.out.println("Good numbers");
			
			
		/*
		 * 1) Ask user to enter 2 ints: -if sum of those ints in not more than 100, then
		 * keep asking once sum of those 2 numbers is more than 100 the print
		 * "Good Numbers" program ends
		 */

	}

}
