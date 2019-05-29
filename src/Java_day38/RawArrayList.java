package Java_day38;

import java.util.*;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		// [Saturday, Java day, 1000, 234.4, true, false]
		System.out.println(list);// automatically call toString()
		String allValues = list.toString();
		System.out.println(allValues);
		
		String str=list.get(0).toString();
		System.out.println(str);//Saturday
		//All values  are store as a raw type. we can also call it ,
		//as a general object type
		
		Integer i=(Integer)list.get(2);
		System.out.println(i);//1000
		
		

	}

}
