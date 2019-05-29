import java.util.Scanner;

public class PracticeWhileLoops1 {

	public static void main(String[] args) {

		/*
		 * int apples = 1; // while this condition is true it will keep looping // every
		 * time it loops the apples will increment by 1
		 *  while (apples <= 10) {
		 * System.out.println("Eating an apple :) " +apples); 
		 * apples++; } // when false it will go out the loop 
		 * 
		 * System.out.println("No more Apples :(");
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		int count=1;
		while(count<=number) {	
			System.out.print(count+", ");
			count+=2;//so it can count by 2: 1, 3, 5, 7, 9, 11, 13, 15,
		}
		
	}

}
