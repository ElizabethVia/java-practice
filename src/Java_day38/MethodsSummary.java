package Java_day38;

import java.util.ArrayList;
import java.util.List;

public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		//add method with index: yellow will be place to index 0
		list1.add(0,"yellow");
		//toString method to print all values in same line
		System.out.println(list1);
		//size method
		System.out.println("Number of elements: "+list1.size());
		//get method return value from index
		System.out.println("3: "+list1.get(3));
		System.out.println("0: "+list1.get(0));
		//remove using index.remove values from index position
		list1.remove(0);//removes yellow
		System.out.println(list1);
		//remove using value/element removes element first occurence
		list1.remove("blue");//removes blue
		System.out.println(list1);//[red, white, grey, black]
		//set(index, value)replace certain index with new value
		list1.set(0, "orange");
		System.out.println(list1);//[orange, white, grey, black]red will be replace by orange
		//indexOf (value)return indexOf value in the list
		System.out.println("grey: "+list1.indexOf("grey"));//grey: 2
		System.out.println("grey: "+list1.indexOf("green"));//grey: -1
		//isEmpty(returns true if list is empty size==0
		System.out.println("is list Empty? "+list1.isEmpty());//is list Empty? false
		System.out.println("is list Empty? "+(list1.size()==0));//is list Empty? false
		//contains(elements)==>returns true if value is present
		System.out.println("white in list? "+list1.contains("white"));//true
		
		List<String>list2=new ArrayList<>();
		//addAll-->adds all the values from one list into another
		list2.addAll(list1);
		System.out.println(list2);//[orange, white, grey, black]
		//containsAll check if list has all values of another list
		System.out.println("containsAll: "+list1.containsAll(list2));//containsAll: true
		//equals(list) checks if 2 lists are exacly equal
		System.out.println("equals: "+list1.equals(list2));//equals: true
		list2.add("pink");
		//remove all(list).removes all metching values from your list that are in other list
		list2.removeAll(list1);
		System.out.println("list2 after removeAll: "+list2);//[pink]
		System.out.println("List1: "+list1);//List1: [orange, white, grey, black]
		//addAll(index, list)adds a new list values starting from given index
		list2.addAll(0,list1);
		System.out.println(list2);//[orange, white, grey, black, pink]
		
		list1.clear();
		list2.clear();
		System.out.println("both empty? -" + (list1.isEmpty() && list2.isEmpty()));
		//both empty? -true
		
		
		

		
		

	}

}
