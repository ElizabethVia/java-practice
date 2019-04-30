package Java_day_21_loops_practice1;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	
	System.out.println("Welcome how many items are you purchasing today?");
	 int itemsCount=scan.nextInt();
	 double totalPrice=0.0;// because we don't know the price
	 String items="";//we dint know the items
	 
	 for(int count=1;count<=itemsCount;count++) {
		 System.out.println("What is item "+count+"?");
		 
		 String itemName=scan.next();
		 //add itemName to items and itemPrice to totalPrice
		 System.out.println("How much is "+itemName+"?");
		 double itemPrice=scan.nextDouble();
		 items+=itemName+",";
		 totalPrice+=itemPrice;
		 if(items.endsWith(", ")) {
			 //get rid of that ",'		 }
		 
	 }
	 
	 System.out.println("Your items: "+items);
	 System.out.println("Your total Price: $"+totalPrice);
	 
	 }

	}

}
