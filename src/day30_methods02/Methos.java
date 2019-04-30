package day30_methods02;

import java.util.Scanner;

public class Methos {

	public static void main(String[] args) {
		plus();

	}
	public static void plus(){
	     
	    //your code here
	    System.out.println("Enter first number ");
	    Scanner scan=new Scanner(System.in);
	   int num1=scan.nextInt();
	   System.out.println("Enter second number");
	   int num2=scan.nextInt();
	   System.out.println("result: "+(num1+num2));
	  }
	  
	}


