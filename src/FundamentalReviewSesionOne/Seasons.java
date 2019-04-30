package FundamentalReviewSesionOne;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a program that will print season name
		// base on the int value
		// value will privided through the scanner
		// 1
		// winter
		// 6
		// summer
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter months number");
		int month = scan.nextInt();
		String message = "";
		/*
		 * if (month >= 1 && month <= 2 || month == 12) { System.out.println("winter");
		 * } else if (month >= 3 && month <= 5) { System.out.println("Spring"); } else
		 * if (month >= 6 && month <= 8) { System.out.println("Summer"); }else
		 * if(month>=9&& month<=11) { System.out.println("fall"); }else {
		 * System.out.println("Invalid value"); }
		 */
		switch (month) {
		case 1:
		case 2:
		case 12:
			message = "winter";
			break;

		case 3:
		case 4:
		case 5:
			message = "Spring";
			break;

		case 6:
		case 7:
		case 8:
			message = "Summer";
			break;

		case 9:case 10:case 11:
		    message = "Fall";
			break;
		default:
			message = "Invalid!";

		}
		System.out.println(message);

	}

}
