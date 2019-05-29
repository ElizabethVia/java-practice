
public class Assignment201_1 {

	 private String firstName, lastName;
	  private int age;
	  
	  public Assignment201_1(){
	      this.firstName="underfine";
	      this.lastName="underfine";
	      this.age=-1;
	    }
	    public Assignment201_1(String firstName, String lastName, int age){
	      this.firstName=firstName;
	      this.lastName=lastName;
	      this.age=age;
	      
	    }
	public String toString() {
		 return  firstName + " | " + lastName + " | " + age ;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  
	  
}
