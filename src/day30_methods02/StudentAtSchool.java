package day30_methods02;

public class StudentAtSchool {
	public static void main(String[] args) {
		study("Selenium");
		study("JAVA,JAVA");
		sleep(5);
	}
	
	public static void study(String topic) {
		System.out.println("Student is studying "+topic);//Student is studying Selenium
		                                                 //Student is studying SQL
		

	}
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours");//Student has been sleeping for 5
	}
}
