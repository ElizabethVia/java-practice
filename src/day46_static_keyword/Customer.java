package day46_static_keyword;

public class Customer {

	private String name;//instance variables
	private String email;
	static int count;//shared by everyone / all objects
	                 //one central copy of this variable
	/*
	 * create a class Customer
       encapsuted:
     -> String name
     -> String email  
     -> getters and setters
     -> 2 constructors:
     -> no-args
        name = "undefined"
        email = "undefined"
     -> 2 args
      -> toString
	 */
	
	public Customer() {
		name="undefined";
		this.email="undefined";
		count++;
	}
	public Customer(String name, String email) {
		this.name=name;
		this.email=email;
		count++;
	}
	
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String email() {
		return email;
	}
}
