package day46_static_keyword;

public class ClacTests {

	public static void main(String[] args) {
		double result = Calculator.plus(55, 7);//static way
		System.out.println("result: "+result);//result: 62.0
		
		result=Calculator.Minus(44, 14);
		System.out.println("result: "+result);//result: 30.0

		Calculator c=new Calculator();
		System.out.println(c.Multiply(4, 2));//8.0
		//bet way to do it
		result=Calculator.Multiply(8, 5);
		System.out.println("result: "+result);//result: 40.0
		
		int i=Integer.parseInt("33");
		
		System.out.println(Character.isDigit('5'));
		//method name variable name
		System.out.println();
	}

}
