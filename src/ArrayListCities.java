import java.util.ArrayList;

public class ArrayListCities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Miami");
		cities.add("California");
		cities.add("New York");
		cities.add("Texas");
		cities.add("Colorado");
		cities.add("Ohio");
		for (String city : cities) {
			System.out.print(city + " ");
		}

		System.out.println();
		System.out.println(cities.size());
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + ", ");
		}
		System.out.println();

     System.out.println(cities.isEmpty());	
	cities.add(0,"Virginia");
	System.out.println(cities.toString());
	int idx=cities.indexOf("Miami");
	System.out.println(idx);
	cities.set(idx, "Ohio");
	System.out.println(cities.toString());
}
}