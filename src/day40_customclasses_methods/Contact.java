package day40_customclasses_methods;

public class Contact {

	
	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling "+name+ "...........");
	}
	public void sendMessage() {
		System.out.println("Sending mesage  to "+ phoneNumber+" | name: "+name);
	}
	public void sendEmail() {
		System.out.println("Sending email "+email+ "..........");
	}
}
