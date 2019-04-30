package Java_Day22_loopspractice2;

import java.util.Scanner;

public class loopsPractice2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int month;
		do {
			
			System.out.println("Enter month");
			month=scan.nextInt();
		} while (month>=1 && month<=12);
		System.out.println("Invlid Month- "+month);
		
		
		int age;
		do {
			System.out.println("Enter age");
			age=scan.nextInt();
		}while(age>=5 && age<=18);
		System.out.println("Invalid school age: "+age);
		
		int day;
		do {
			System.out.println("Enter Day");
			day=scan.nextInt();
			}while(day>=1 &&day<=7);
		System.out.println("Invalid Day");
		
		
		int cups;
		do {
			System.out.println("Enter Number of cups");
			cups=scan.nextInt();
			
		}while(cups>=1 && cups<=10);
		System.out.println("Invalid number of cups "+cups);
		
		int grade;
		do {
			System.out.println("Enter grade");
			grade=scan.nextInt();
			
		}while (grade>=80 && grade<=100);
		System.out.println("study more!");
	}

}
