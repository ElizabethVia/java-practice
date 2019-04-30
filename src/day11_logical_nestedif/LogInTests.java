package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in );
		String username,password,ValidUsername,ValidPassword;
		
		System.out.println("Enter Username:");
		username=scan.nextLine();
		System.out.println("Enter password:");
		password=scan.nextLine();
		 ValidUsername="cybertek@mail.com";
		 ValidPassword="WoodenSpoon123";
		 //username is "cybertek@mail.com"
		 //password is "aber324"
		if (username.equalsIgnoreCase(ValidUsername) || password.equals(ValidPassword)) {
			System.out.println("Login Successful, Welcome!");
		}else if (!username.equalsIgnoreCase(ValidUsername) && !password.equalsIgnoreCase( ValidPassword)){
			System.out.println("Invalid username and Invalid password");
		}else if(username.equalsIgnoreCase(ValidUsername)&& !password.equals(ValidPassword)) {
		System.out.println("Invalid password");
		}else if(!username.equalsIgnoreCase(ValidUsername)&& password.equals(ValidPassword)) {
			System.out.println("Invalid username");
		}
	}

}

		
		
		
		