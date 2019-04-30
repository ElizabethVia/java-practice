package javaDay_33_methods;

public class AgeCalculator {

	public static void main(String[] args) {
		int age=calculateAge(1994);
		System.out.println("you are "+age+" years old");
		int age2=calculateAge(1975);
		System.out.println("you are "+age2+" years old");
		System.out.println(calculateAge(2025));
	}
	//method is calculating the age
	//print category
	//return age value
	//return 0
	public static int calculateAge(int year) {
		int currentYear=2019;
		int age=currentYear-year;
		
		if(age<0) {
			System.out.println("Invalid age");
			return 0;
		}
		else if(age>=0 && age<=14) {
			System.out.println("child");
			
		}
		else if(age>=15 && age<=25) {
			System.out.println("youngster");
		}
		else if(age>=26 && age<=64) {
			System.out.println("adult");
		}else {
			System.out.println("senior");
		}
		return age;
	}
}
