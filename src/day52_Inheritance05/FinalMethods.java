package day52_Inheritance05;

public class FinalMethods {
	
	public final void method1() {
		System.out.println("Final method 1");
	}
	
}
class Sub extends FinalMethods{
	/*can not override since it is a final method
	 * public void method1() {
	 *  System.out.println("Final method 1"); }
	 */
	public final void method1(String str) {
		System.out.println("Final method 1 "+str);
	}
	public final static void staticMethod(String word) {
		System.out.println("staticmethod: "+word);
	}
	
	/*
	 * public final static void staticMethod(String word) {
	 * System.out.println("staticmethod: "+word); }
	 */
}