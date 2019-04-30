package day_20_forLoops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter number:");
		int num=scan.nextInt();
		
		//check if it is valid 1-10
		//if is not valid return
		
		if(num<1 ||num>10) {
			System.out.println("ERROR: Invalid input");
			return;//stop execution
			//System.exit(0); stop execution
		}
		//for loop to print multiplication table
		for(int i=1;i<=10;i++) {
			//int result=num*i;
			System.out.println(num+" x "+i+" = "+(num*i));//+result
		}
	}

}
