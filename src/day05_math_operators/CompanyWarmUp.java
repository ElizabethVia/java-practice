package day05_math_operators;

public class CompanyWarmUp {

	public static void main(String[] args) {
		String companyName,address;
		int numberOfEmployees, revenue;
		boolean isTechCompany; 
		isTechCompany = true;
		
		companyName = "Facebook";
		address = "Silicon Valley, CA";
		numberOfEmployees=10000;
		revenue = 4000000;
		
		
		System.out.println("address is "+ address);
		System.out.println("Number of employees is " + numberOfEmployees);
		System.out.println("Annual revenue is " + revenue);
		System.out.println("is it a tech companny? - " +isTechCompany );
		
		String aboutCompany = "company "+companyName+" is located in "+address
				+ "\n and " +numberOfEmployees+ " work for it.";
		System.out.println(aboutCompany);
	}

}
