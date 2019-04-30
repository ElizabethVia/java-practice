package Java_day31_methos3;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		add(5,5);
		subtract(10,7);
		multiply(7,5);
		divide(10,2);
		divide(105.5,0);
		remainder(7,3);//3+3=6 the remainder is 1
		//using scanner pass 2 numbers and operator
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		System.out.println("Select operator: '+','-','*','/','%' ");
		String operator=scan.next();
		switch(operator) {
		case "+":
			add(n1,n2);
			break;
		case "-":
			subtract(n1, n2);
			break;
		case "*":
			multiply(n1,n2);
			break;
		case "/":
			divide( n1,n2);
			break;
		case "%":
			remainder(n1,n2);
			break;
			default:
				
		System.out.println("Invalid operator!");		
		}

	}
	public static void add(double num1,double num2) {
		double result=num1+num2;
		System.out.println("Result: "+result);
	}
	public static void subtract(double number1, double number2) {
		double result=number1-number2;
		System.out.println("Result: "+result);
	}
	public static void multiply(double number1, double number2) {
		double result=number1*number2;
		System.out.println("Result: "+result);

}
	public static void divide(double number1, double number2) {
		if(number2==0) {
			System.out.println("cannot / by zero");
		}
		double result=number1/number2;
		System.out.println("Result: "+result);
		return;//exit the method here do not run the rest 
}
	public static void remainder(double number1, double number2) {
		double result=number1%number2;
		System.out.println("Result: "+result);
}
}	
	
	