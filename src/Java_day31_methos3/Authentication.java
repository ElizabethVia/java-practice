package Java_day31_methos3;

public class Authentication {

	public static void main(String[] args) {
		login("mentoring@cyberteckschool.com","mentor001");//Login Succesful! Welcome to Okta
		login("mentoring@cyberteckschool.com","mentor002");//Sign in failed!
	}
	
	//Name: login
	//return type:void
	//2 String args/params: username,passsword
	//Inside the method:
	//validUsername="mentoring@cyberteckschool.com"
	//validPassword="mentor001"
	
	public static void login(String username, String password) {
		String validUsername="mentoring@cyberteckschool.com";
		String validPassword="mentor001";
		if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Succesful! Welcome to Okta");
		}else {
			System.out.println("Sign in failed!");
		}
		//System.out.println(username+" "+password);
	}
}
