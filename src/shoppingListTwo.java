import java.util.Scanner;

public class shoppingListTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		do {
			System.out.println("Enter item"+count+ "and its price:");
			item=scan.next();
			price=scan.nextDouble();
			shoppingListReport+="Item"+count+ ":"+ item+" Price:"+price+", ";
			totalPrice+=price;
			System.out.println("Add one more item?");
			countinue=scan.next().toLowerCase();
			count++;
			
		}while(countinue.contentEquals("yes")&& count<=10);
		System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
		System.out.println("Total price: "+totalPrice);
	}

}
