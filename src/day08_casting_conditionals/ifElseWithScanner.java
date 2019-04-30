package day08_casting_conditionals;

import java.util.Scanner;

public class ifElseWithScanner {
	

	public static void main(String[] args) {
		//passingPercentage = 65
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		Scanner scan= new Scanner (System.in);
		int passingPercentage= 65;
		System.out.println("What is your score?");
		int yourScorePercentage= scan.nextInt();
		if(yourScorePercentage>=passingPercentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS!");
		}else {
			System.out.println("YOU FAILED! STUDY MORE! DONT BE SAD!");
			
		}
		
		
	
		
		
		
		
		
		
		
	}

}
