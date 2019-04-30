package day34_methods06;

public class MethodOverLoading {

	public static void main(String[] args) {
		add(10,20);
		add("one","two");
		long l1=1234l;
		long l2=45214l;
		add(l1,l2);
		add(246.2,100);
		
	}
	public static void add(int num1, int num2) {
		int result= num1+num2;
		System.out.println("Result: "+result);
	}
	public static void add(double d1, double d2) {
		double result= d1+d2;
		System.out.println("Result: "+result);
	}
	public static void add(String str1, String str2) {
		String result= str1+str2;
		System.out.println("Result: "+result);
}
	public static void add(long num1, long num2) {
		long result= num1+num2;
		System.out.println("Result: "+result);
	}
}
