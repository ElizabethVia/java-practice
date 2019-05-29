package officehours01;

public class Employee {


	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	boolean isInsured;
	String title;
	String email;
	String[] titles = {"Developer", "Scrum master", "SDET", "PO", "QA Analyst", "BA", "HR"};

	public void printInfo() {
		System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
				+ ", Title: " + title+", Email: "+email);
	}
	//create a method that will generate an email for employee
	//use firstname_lastname@gmail.com as a template
	//your method suppose to accept object of employee as a parameter
	//and this method will have String as return
	public String generateEmail() {
		//we are creating new email
		 String newEmail=firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		email=newEmail;
		 return email;
	} 
	public void setEmail(String e) {
		//let's check if email is valid
				//before changing it 
				if(e.contains("@")) {
					email = e;
				}else {
					System.out.println("Invalid email!");
				}
			}
	
	public void printEmail() {
		System.out.println("Email of "+firstName+" "+lastName+" : "+email);
	}
	//this method will validate title before setting it
	public void setJObTitle(String str) {
		boolean isValid =false;
		for(String t:titles) {
			if(t.equals(str)) {
				//if we verified that title is valid
				//then we will set this title
				title=str;
				//and isValid will become true
				isValid=true;
			//}else {
				//System.out.println("Invalid job title: "+str);
			}
		}
		//if(isValid=true)--->
		if (isValid) {
			System.out.println("Title was set sucessfully.");
		}else {
			System.out.println("Invalid title");
		}
	}
}
