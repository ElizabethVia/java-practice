package JavaDay32CustomMethods;

public class MethodsWithReturn {

	public static void main(String[] args) {
	System.out.println(giveMe10$());	
    int i=giveMe10$();
    System.out.println("i: "+i);
    System.out.println(giveMeYourName());
    String myName=giveMeYourName();
    System.out.println("MyName is "+myName);
	}
	//this method, return int value
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}
	/*
	 * giveMeYourName()
	 * return type: String
	 * Declare name variable and assign your name
	 * then return it Call in main method
	 */
	public static String giveMeYourName() {
		return "Elizabeth";
	}
}
