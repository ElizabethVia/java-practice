package Java_day38;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list1=new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());//[Jan, Feb, Mar, Apr, May]
		//list1,list2 point to same object
		ArrayList<String>list2=list1;
		//copy all values from list1
		ArrayList<String>months=new ArrayList<>(list1);
		System.out.println(months);
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months);//[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
		System.out.println(months.contains("Jan"));//true
		System.out.println(months.contains ("Dec"));//false
		System.out.println(months.contains("Jun"));//true
		//check if Feb is in second position
		System.out.println(months.indexOf("Feb")==1);//true
		System.out.println(months.get(1).contentEquals("Feb"));//true
		
		ArrayList<String>month2 =new ArrayList<>(list1);
		//Month: [Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
		System.out.println("Month: "+months.toString());
		//Month2: [Jan, Feb, Mar, Apr, May]
		System.out.println("Month2: "+month2.toString());
		//check if month has all the values of month2
		if(months.containsAll(month2)) {
			System.out.println("Months has all of month2");//Months has all of month2
		}else {
			System.out.println("some values are missing");
			
		}
		//add one more Jan to month2
		month2.add("Jan");
		System.out.println(month2);
		
		
		
		
		
	}

}
