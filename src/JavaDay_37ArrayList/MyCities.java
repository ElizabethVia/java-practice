package JavaDay_37ArrayList;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		//print each city using for each loop separated by space
		for(String c:cities) {
			System.out.print(c +" ");//Barnaul Dushanbe Sterling Baku Tashkent
		}
		System.out.println();
		//print each city using for loop, separated by space
		for(int i=0;i<cities.size();i++) {
			System.out.print(cities.get(i)+" ");
			}
			System.out.println();
			//Barnaul Dushanbe Sterling Baku Tashkent
			System.out.println("Remove Baku");
			cities.remove("Baku");
			
			System.out.print(cities.toString());
			//isEmpty?
			System.out.println();
			System.out.println("Is list empty? "+cities.isEmpty());//false
			cities.add(0, "Bishkek");
			System.out.println(cities.toString());
			
			cities.add(1, "Istanbul");
			System.out.println(cities.toString());
			
			cities.set(2, "Seoul");
			System.out.println(cities.toString());
			//find sterling in the list and give the index
			int idx= cities.indexOf("Sterling");
			System.out.println("Sterling index: "+idx);//Sterling index: 4
			cities.set(idx, "Zagreb");
			//replace sterling for Zagreb
			System.out.println(cities.toString());
			cities.clear();
			boolean empty=cities.isEmpty();
			System.out.println("Empty: "+empty);//Empty: true
		
	}

}
