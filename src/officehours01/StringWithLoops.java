package officehours01;

public class StringWithLoops {

	public static void main(String[] args) {
		String day = "Monday";// string pool
		System.out.println(day.length());
		if (day.length() >= 6) {
			System.out.println("Possibly a valid day");
		} else {
			System.out.println("Days are normally 6 chars or longer!");
		}
		// compare strings
		String today = "Monday";// created in tring pool
		if (day.equals(today)) {
			System.out.println("Monday is today");
		} else {
			System.out.println("wrong day");
		}
		// day ==>Monday,friday,sunday
		if(day.equals("Monday")||day.contentEquals("friday")||day.equals("sunday")) {
			System.out.println("Definitely a valid day");
		}else {
			System.out.println("Invalid day!");
		}
		//also check if it is 6 chars then compare if it is one of three
		if(day.length()==6) {
			if(day.equals("Monday")||day.contentEquals("friday")||day.equals("sunday")) {
				System.out.println("Definitely a valid day");
			}else {
				System.out.println("Invalid day!");
			}
		}
		//monday-->check if ends with last 3 chars are "day
		//endswith method
		//monday
		if(day.endsWith("day")) {
			System.out.println("It ends with 'day");
		}else {
			System.out.println("Does not end with 'day'");
		}
		//using substring->creates a partial string
		System.out.println(day.substring(3));//day
		if(day.substring(3).equals("day")) {
			System.out.println("last 3 are day");
		}else {
			System.out.println("last 3 are not day");
		}
		//substring with length together and make it 
		//more capable
		String myDay="Saturday";
		System.out.println(myDay.substring(3));//urday
		System.out.println(myDay.substring(1,5));//atur
		
		System.out.println(myDay.length());//8
		System.out.println(myDay.substring(5));//day
		                                        //5 the length is 8 -3=5
		System.out.println(myDay.substring(myDay.length()-3));//day
		
		String last3=myDay.substring(myDay.length()-3);
		boolean check=last3.contentEquals("day");
		System.out.println(check);//true
		
		//print each char in new line
		//charAt reads single characterat an index
		System.out.println(myDay.charAt(myDay.length()-1));//y
		
		for(int i=0;i<myDay.length();i++) {
			System.out.println(myDay.charAt(i));//saturday
		}
	}

}
