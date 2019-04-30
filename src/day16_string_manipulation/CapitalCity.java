package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str="Moscow as a capital of Rusia";
		//Baku, Azerbaijan
		str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		String email="firstName_lastName@gmail.com";
		String company="deloitte";
		
		String newEmail=email.replace("gmail", company);
		System.out.println(newEmail);
		
		
	}

}
