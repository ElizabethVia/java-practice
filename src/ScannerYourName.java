import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		
		//create scanner object
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, What is your name?");
		String name = scan.next(); //accept string input acan.nextLine
		System.out.println("Nice to meet you, " +name);
		
		int year = 1996;
		
		System.out.println("Enter a year");
		year = scan.nextInt();
		
		boolean isLeapYear = false;
		isLeapYear=(year % 4 == 0) && (year % 100 !=0);
		isLeapYear = isLeapYear ||(year % 400 == 0);
		if(isLeapYear) {
			System.out.println(year + "is not a leap year");
		}
		
		
		
	}
	


}
