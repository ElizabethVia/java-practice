package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1=scan.nextDouble();
		
		System.out.println("Enter second number");
		double num2 = scan.nextDouble();
	  System.out.println("Select Operator: +,-,*,/, %");
		 String operator =scan.next();
		
		double result=0.0;
		switch(operator){
		case "+":
			result= num1 +num2;
			
			break;
		case "-":
			result =num1 - num2;
			break;
		
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "%":
			result=num1%num2;
			
			break;
			default:
				System.out.println("Invalid operator selected:");
		}		
				System.out.println("Result "+result);
	
		
				
				
				
		
	}

}
