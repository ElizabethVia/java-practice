package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		
		String quality="good";
		int rating =(quality.equals("good"))? 100 : 0;
		System.out.println("Rating: " + rating);
		
	 int PMHour= 6;
	 //rush hour during evening: 4-7
	 boolean rushHour=(PMHour >=4 && PMHour <= 7) ? true : false;
		//	System.out.println(PMHour+" is rush hour? "+ rushHour);
			String result= rushHour== true? "yes": "no";
	System.out.println(PMHour+" is rush hour? "+ result);
	int AmHour=8; //6-9
	String amRushHour=AmHour>=6 && AmHour<= 9? "yes" : "no";
	 System.out.println(AmHour+" is rush hour? "+ amRushHour);
	}

}
