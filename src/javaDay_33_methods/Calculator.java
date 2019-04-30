package javaDay_33_methods;

public class Calculator {

	public static void main(String[] args) {
		 addVoid(2,5);	
		
		 
		 
		// bellow line will not work because addVoid does not
		// return a value it just perform action
		// int result=addVoid()
		 //System.out.println(addVoid(5,2));
		int result= add(4,8);
		System.out.println("Result: "+result);
		result=add(10,30);
		System.out.println("result: "+result);
		System.out.println(add(6,2));
		
		System.out.println(multiply(5,5)); 
		 minus(10,2);
		 divide(8,2);
		
	}
	/*1- method add 
	retun type: void
	params: int num1,int num2
	add tem and print sum
*/
	
	public static void addVoid(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("Sum: "+sum);
		
	}
	/*2-method name:add return type: int
			params: int num1,int num2
			add them and return the sum
			*/
	public static int add(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	public static double multiply(double n1,double n2) {
		double result=n1*n2;
		return result;
		//return n1*n2; we can also do it this way
	}
	public static double minus(double number1, double number2) {
		double result1=number1-number2;
		return result1;
	}
	public static double divide(double nu1,double nu2) {
		if(nu2==0) {
			System.out.println("Error: cannot / by0");
			return 0;
			
		}else {
		double result2=nu1/nu2;
		return result2;
		}
	}
}
