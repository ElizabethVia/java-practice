package JavaDay32CustomMethods;

public class Cooking {

	public static void main(String[] args) {
		makePancakes();
		makePasta();
		makePancakes();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~"+dish.toUpperCase()+" IS READY!~~");
		//we could also check value of dish and call matching methods
		/*
		 * if(dish.equals("pancakes")) 
		 *  makePancakes(); 
		 */ 
	}
	
	
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~DELICIOUS PASTA IS READY~~");
	}
	public static void makePancakes() {
		System.out.println("~~ PANCAKES RECEPI~~");
		add("milk,Eggs, Flour,sugar,salt");
		mix(120);
		fry(3);
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");
	}
	public static void add(String recipe){
		System.out.println("Add "+recipe);
		
	}
	public static void mix(int seconds) {
		System.out.println("mix for "+seconds+ " seconds");
	}
	public static void fry(int minutes) {
		System.out.println("fry for "+minutes+" minutes");
	}
	public static void boil(int minutes) {
		System.out.println("boil it for "+minutes+" minutes");
	}
}
