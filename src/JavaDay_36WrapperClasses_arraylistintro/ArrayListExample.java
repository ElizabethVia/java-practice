package JavaDay_36WrapperClasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//declare arraylist called languages
		
		ArrayList<String>languages=new ArrayList<>();
		languages.add("java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijani");
		languages.add("Ukranian");
		//languages.add
		System.out.println("Number of values: "+ languages.size());//Number of values: 7
		languages.add("Turkish");
		System.out.println("number of values: "+languages.size());//number of values: 8
		
		//remove java
		languages.remove(0);
		System.out.println("Number of values: "+ languages.size());//Number of values: 7
		System.out.println(languages.toString());//[English, Spanish, Arabic, Russian, Azerbaijani, Ukranian, Turkish]

	}

}
