package day34_methods06;

import java.util.Arrays;

public class VarAgs {

	public static void main(String[] args) {
		printWords("red","blue","yellow");//3 values
		printWords("grey");//one value
		printWords();//empty so array will be empty array
		String[]  myPets= {"cat","horse","dog","sheep","goat"};
		printWords(myPets);
		System.out.println(sum(3,5,10));//18 will be result
		System.out.println(sum(2541,3654,10,4851,12,8,145,7));//11228
		int budget=200;
		if(sum(10,45,110,30)<=budget) {
			System.out.println("within budget");
		}else {
			System.out.println("Broke");
		}
		int total = sum(234,43,567,12,34,5);
		System.out.println("Totals: "+total);//895
		
		cook("Burrito Bowl","Rice","Meat","Sour Cream","Chesse","beans","salsa");
		cook("Avocados Toast","Avocado","Senny Side eggs","Wheat bread");
		shoppingList(1000,"Avocado Toast","Swatch watch watch Watch", "Shoes","jacket");
	}
	
	public static void printWords(String... words) {
		//handle it like an ARRAY
		for (String w:words) {
			System.out.println(w);
		}
		
	}
	//sum(10,30,40);==>80
	//sum(30,40);==70
   public static int sum(int...nums) {
	   int sum=0;
	   for(int n:nums) {
		  sum+=n;//sum=sum+n; 
	   }
	   return sum;
	   
	
	   
   }
  // more params next to vargar
   public static void cook(String name, String...ings) {
	   System.out.println("Food: "+name);
	   System.out.println(Arrays.toString(ings));
   }
   public static void shoppingList(int totalPrice, String...Items) {
	   System.out.println("Total cost: "+totalPrice);
	   System.out.println(Arrays.toString(Items));
   }
}
