package Java_day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		List<Integer>numsList=new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList);//[44, 1, 4, 1000, 3]
		System.out.println("Sorting...please wait...");
		Collections.sort(numsList);
		
		System.out.println(numsList);//[1, 3, 4, 44, 1000]
		
		List<String>strList=new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Maria");
		strList.add("Dina");
		strList.add("Bojan");
		
		System.out.println(strList);//[Fuad, Roman, Murad, Muhabbat, Maria, Dina, Bojan]
		System.out.println("Sorting...please wait...");
		Collections.sort(strList);
		System.out.println(strList);//[Bojan, Dina, Fuad, Maria, Muhabbat, Murad, Roman]
		
		//MAX, MIN
		int maxNum =Collections.max(numsList);
		int minNum=Collections.min(numsList);
		System.out.println("maxNum: "+maxNum);//maxNum: 1000
		System.out.println("minNum: "+minNum);//minNum: 1
		
		String maxName=Collections.max(strList);
		String minName=Collections.min(strList);
		System.out.println("maxName: "+maxName);//maxName: Roman
		System.out.println("minName: "+minName);//minName: Bojan
		//shuffle is like random number 
		Collections.shuffle(strList);
		System.out.println(strList);
	}

}
