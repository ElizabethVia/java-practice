package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		showMe5Numbers();
		do10PushUps();
		rangePrint();
	}

	/*
	 * 1) method name: showMe5Numbers return type: void params: no prints 5 random
	 * numbers 0, 1000 in same line separated by comma Ex: showMe5Numbers(); 345,
	 * 234, 566, 2, 23
	 */
	public static void showMe5Numbers() {
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001) + " ");// print random num 0-1000
		}
		System.out.println();
	}

	public static void do10PushUps() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup- " + i);
		}
		System.out.println("Time to rest");
		/*
		 * Pushup-1 Pushup-2 Pushup-3 Pushup-4 Pushup-5 Pushup-6 Pushup-7 Pushup-8
		 * Pushup-9 Pushup-10 Time to rest
		 */

	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		if (number1 < number2) {
			for (int i = number1; i <= number2; i++) {
				System.out.println(i + " ");
			}
		} else if (number1 > number2) {
			for (int k = number1; k >= number2; k--) {
				System.out.println(k + " ");
			}
		} else {
			System.out.println(number1);
		}
		System.out.println();
	}

}
