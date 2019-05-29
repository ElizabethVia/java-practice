import java.util.ArrayList;

public class ArraysList {

	public static void main(String[] args) {

		ArrayList<String>list=new ArrayList<>();
		list.add("eggs");
		list.add("bananas");
		list.add("apples");
		list.add("rice");
		list.add("milk");
		list.add("oatmeal");
		System.out.println(list.toString());
		int count = list.size();
		System.out.println(count);
		System.out.println(list.get(0)+" | "+list.get(5));
		list.remove("apples");
		System.out.println(list);
		list.clear();
		System.out.println(list.toString());
	}
      
}
