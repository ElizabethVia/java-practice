package JavaDay_37ArrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		list.add("apples");
		list.add("paper towel");
		list.add("dish soap");
		list.add("trash bag");
		list.add("clorox");
		list.add("gloves");
		
		//print number of items
		int count=list.size();
		System.out.println("Total count: "+count);//6
		//print all items in single line
		System.out.println(list);
		//[apples, paper towel, dish soap, trash bag, clorox, gloves]
		//print first and last item in single line
		System.out.println(list.get(0)+ " | "+ list.get(5));
		//apples | gloves
	    System.out.println(list.get(0)+ " | "+ list.get(count -1));
		//apples | gloves if you don't know the number of the last one count -1
	    
	    list.remove("paper towel");
	    System.out.println(list);//[apples, dish soap, trash bag, clorox, gloves]
	    list.remove("gloves");
	    System.out.println(list);//[apples, dish soap, trash bag, clorox]
	    System.out.println(list.get(0));//apples
	    
	   list.remove(0);
	   System.out.println(list.toString());//[dish soap, trash bag, clorox]
	   //foe each loop can be only for reading
	   //we cannot modify list inside for each loop
	   for(String item:list) {
	   System.out.println(item);
	   }
	  // remove all items at once
	   list.clear();
	   System.out.println(list.toString());//[]
	   
	}

}
