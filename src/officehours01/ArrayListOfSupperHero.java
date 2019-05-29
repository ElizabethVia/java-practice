package officehours01;

import java.util.ArrayList;

public class ArrayListOfSupperHero {

	public static void main(String[] args) {
		
		ArrayList<String> superheroes = new ArrayList<>();
		superheroes.add("Spiderman");
		// it takes 2 params
		// first is position, second is value to set
		// there is no 2 element, so we cannot set it.
		// superheroes.set(1, "Iron man");
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");
		System.out.println(superheroes);
		//lets create an array list that will store superheros that have space in the name
		ArrayList<String>superherosWithSpace= new ArrayList<>();
		String longestName="";
		for(String hero: superheroes) {
			//this one checks is name contains space
			//if so add it to the new array list
			if(hero.contains(" ")) {
				superherosWithSpace.add(hero);
		}
			if(hero.length()>longestName.length()) {
				longestName=hero;
			}
		}
		System.out.println(superherosWithSpace);	
		System.out.println("The longest name: "+longestName);
		//How to find second longest word?
		//first find longest one
		String secondLongest="";
		//loop through the arraylist again
		for(String hero: superheroes) {
			//but this time do not include longest word in the search
			if(!hero.equals(longestName)) {
			if(hero.length()>secondLongest.length() ) {
				secondLongest=hero;
			}
			}
		}
		System.out.println("Second longest name: "+secondLongest);
	}
}