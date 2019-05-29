package Java_Day_25;

public class ShoppingArrays {

	public static void main(String[] args) {
		String[] products = { "Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks" };
		double[] prices = { 120.0, 5.99, 150.5, 3000.5, 6.99 };
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };
		// print count of products
		System.out.println("Product count: " + products.length);// 5
		// check if products, prices and itemsIds have same count
		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in this list");
			return;
		}
		// loop through products and print each one in separate line
		for (String p : products) {
			System.out.println(p);
		}
		// prices--> for loop it will print all the prices in different lines
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		// itemsId--> print is in reverse order
		for(int j = itemsId.length-1;j>=0;j--) {
			System.out.println(itemsId[j]);
		}
		//print a report. with a total price
		//Item 1 :12345-Timberland Shoes-$120.0
		//total price :
		System.out.println("#### YOUR SHOPPING RECEIPT######");
		double totalPrice=0.0;
		for(int i=0;i<products.length;i++) {
			System.out.println("Item "+(i+1)+ ": "+ itemsId[i]+ " - "+products[i]+" -$"+prices[i]);
			totalPrice+=prices[i];
		}
		System.out.println("Total price: $ "+ totalPrice);
		//find the most expensive item in your list and print it as a report
		int max=0;
		double maxPrice=0.0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]>maxPrice) {
				maxPrice=prices[i];
				max=i;
			}
		}
		System.out.println(itemsId[max]+" - "+products[max]+" -$"+maxPrice);
		//find min price
		int min=0;
		double minPrice=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minPrice) {
				minPrice=prices[i];
				min=i;
			}
		}
		System.out.println(itemsId[min]+" - "+products[min]+" -$"+minPrice);
	}

}
