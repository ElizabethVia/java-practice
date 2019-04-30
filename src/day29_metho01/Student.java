package day29_metho01;

public class Student {

	public static void main(String[] args) {
		sayhello();
		study();
		study();
		code();
		
	}
	
	public static void study() {
		System.out.println("Student is studing");
	}//create a method with name sayhello that print "hello friends"
	public static void sayhello() {
		System.out.println("Hello Friends");
		System.out.println("how are you today?");
	}
	//create a method with name code
	//inside code method
	//student is coding java
	public static void code() {
		System.out.println("inside code method");
		System.out.println("Student is coding java");
		
	}

}
