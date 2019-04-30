import java.util.Scanner;
public class scannerLeapYear{
	
	public static void main(String[] args) {
		int year = 1996;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		year = scan.nextInt();
	
		
		boolean isLeapYear = false;
		
		isLeapYear=((year % 4 == 0) && (year % 100 !=0))|| (year % 400 ==0);
		if(isLeapYear) {
		}else {
			System.out.println(year + "is not a leap Year");
		}
	}
}