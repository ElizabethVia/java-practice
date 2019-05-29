import java.util.ArrayList;

public class MentoringPracticeArrayList {

	public static void main(String[] args) {
		ArrayList<String>groceryList=new ArrayList<>();
		groceryList.add("Bananas");
		groceryList.add("Oranges");
		groceryList.add("milk");
		groceryList.add("eggs");
		groceryList.add("cucumbers");
		groceryList.add("rice");
		//print all in a single line
		System.out.println(groceryList.toString());
		//print number of items
		int count=groceryList.size();
		System.out.println(count);//6
		///if contains
		System.out.println(groceryList.contains("milk"));//true
		//print first and last item 
		System.out.println(groceryList.get(0)+ " "+groceryList.get(5));
		// remove items from list
	    groceryList.remove("Oranges");
	    System.out.println(groceryList);
	    //clear the items
	    groceryList.clear();
	    System.out.println(groceryList);
	}

}
