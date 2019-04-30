package day12_switch_ternary;

import java.util.Scanner;

public class SwitchScore {

	public static void main(String[] args) {
		int score=12;
		//1->
		//2->  
		//    variable
		switch(score) {
		case 1:
			System.out.println("Score is 1");
			break;//exit switch statement
		case 2:
			System.out.println("Score is 2");
			break;
		case 3:
			System.out.println("Score is 3");
			break;
		default:
			System.out.println("Invalid score");
			break;//works without this as well
		
		}
		
		int day=1-7;
		switch(day) {
		case 1:
		    System.out.println("Monday");
		    break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		
		
	}	
		
		
	}
	
	
	


