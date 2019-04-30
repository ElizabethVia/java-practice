package day18_while_dowhile_loops;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 ******** 
		 */

		String stairs = "*";
		// 1)with a counter
		int num = 1;
		while (num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}

		// 2) checking length()
		stairs = "*";
	while (10>=stairs.length()) {
		System.out.println(stairs);
		stairs+="*";
	}
		
		
	}
}