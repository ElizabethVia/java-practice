package day46_static_keyword;

public class Ebay {

	public static void main(String[] args) {
		
		Customer customer1= new Customer("Abdallah Aleies","AbdallahAleies@gmail.com");
		Customer customer2= new Customer("Aditel Kirgyz", "adilet@yahoo.com");
		Customer customer3= new Customer("Anastissia Zasibna", "Anastissia@outlook.com");

		System.out.println(customer3.count);//3
		System.out.println(Customer.count);//3
		
		Customer customer4= new Customer("Burak Ucal","burak@yahoo.com");
		System.out.println("Total Customers: "+Customer.count);//Total Customers: 4
		
		customer1.count=10;//it will affect every body
		System.out.println(customer3.count);//10
		System.out.println(Customer.count);//10
		System.out.println(customer2.count);//10
		System.out.println(customer4.count);//10
		
		
	}

}
