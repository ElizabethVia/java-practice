package day04_primitives_operators;

public class AgeCalculator {
	public static void main(String[] args) {
		//Declare variable yearOfBirth age assign some year 
		//Declare variable currentYear and assign 2019
		//Declare variable age and calculate the age and 
		//assign result to it 
		//print: if you are born in year 
		//then you are <> years old
		
		
		int yearOfBirth = 1986;
		int currentYear=2019;
		int age= currentYear - yearOfBirth;
		System.out.println("If you are born in "+yearOfBirth);
		System.out.println("Then you are "+age+" years old.");
 
		//declare variable schoolEnds and assign 09
		//declare variable currentMonth and assign 02
		//declare variable days and calculate the days and assign result
		//print if you go to school in February
		//then you have <> months of school left
		int schoolEnds= 8 ;
		int currentMonth=2 ;
		
		int days= currentMonth - schoolEnds;
		System.out.println("if you go to school in february " + currentMonth);
		System.out.println("then have " +days+ " months of school left");
		
		
	}

}
