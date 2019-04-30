package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Good Morning";
		//check if it matches "Good Morning" ans prit match 
		//or not match
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
			
		}else {
			System.out.println("Not Match");
			
			
		}
		if(str1.equalsIgnoreCase("Good morning")) {
			System.out.println("Match - ignore case");
			
		}else {
			System.out.println("Not Match - ignore case");
		}
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1=str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		///combine the above methods together:
		//convert to all lowercase first the check if it equals("good morning")
		      //good morning==> good morning
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
			
		}else {
			System.out.println("Chained methods: do not match");
		}
		//find out how many characters in the string
		String myName="Elizabeth";
		System.out.println(myName.length());
		
		int length=myName.length();
		
		System.out.println("My name's length:"+ length);
		//usernames must be exactly 8 characters=> 
		//set some value and using a if statement check it is 
		//8 characters: if true valid username false=>invalid username
		//must  be 8 chars
		String userName= "elizabeth";
				if (userName.length()==8) {
					System.out.println("Valid username");
				}else {
					System.out.println("Invalid username, must be 8 chars");
				}
				
				String password="woodenSpoon";
				if(password.length()>=6) {
					System.out.println("Password is good");
				}else {
					System.out.println("Password is too short");
				}
				int passwordLength=password.length();
				if(passwordLength<6) {
					System.out.println("Invalid password. Too short");
				}else {
					System.out.println("Valid password, good job");
				
				}
	}
	
	
	
	
	

}
