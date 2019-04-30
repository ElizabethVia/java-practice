package day09_stringgequals_conditionals;

public class IsElseNoBraces {

	public static void main(String[] args) {
		String day = "Tuesday";
		if (day.contentEquals("Tuesday"))
			System.out.println("Today is Tuesday");
			else
		System.out.println("Today is not Tuesday");
		//this line is not part of else block
		System.out.println("Tuesday is not today");
		

	}

}
