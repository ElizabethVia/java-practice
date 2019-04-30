package day_19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random random=new Random();//is used to generate random numbers
		
		
		System.out.println("###WELCOME TO GUESS A NUMBER GAME##");
		//this will give us a number between 0-100
		int secretNumber=random.nextInt(101);
		int guessNumber;
		do{
			System.out.println("Guess a number: ");
			guessNumber=scan.nextInt();
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your Number is too large");
			}
		}while(guessNumber!=secretNumber);
		System.out.println("Bingo, congratulations, you won!");
		
			
		
		
	}

}
