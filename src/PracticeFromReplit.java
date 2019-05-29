import java.util.Scanner;

public class PracticeFromReplit {

	public static void main(String[] args) {
		int count=0;
		int nums=10;
		for (int i=1;i<=nums;i++) {
			count++;
			System.out.println(count);
		}

		Scanner scan = new Scanner(System.in);
		String word=scan.next();
		System.out.println("Today's Word-Of-The-Day is: "+word);
	
		String lan1=scan.nextLine();
		String lan2=scan.nextLine();
	    System.out.println("I will learn \""+lan1+"\" and\""+ lan2+ "\" at Cybertekschool");
	    
	    int num1, num2, num3, sum;
	    System.out.println("Enter 3 numbers");
	    num1=scan.nextInt();
	    num2=scan.nextInt();
	    num3=scan.nextInt();
	    sum=num1+num2+num3;
	    System.out.println("Sum of numbers: "+sum);
	    
	    
	    String item1,item2,item3, report;
	    double price1,price2,price3,totalPrice;
	    System.out.println("Enter item1 and its price:");
	    item1=scan.next();
	    price1=scan.nextDouble();
	    System.out.println("Enter iten2 and its price");
	    item2=scan.next();
	    price2=scan.nextDouble();
	    System.out.println("Enter item3 and its price");
	    item3=scan.next();
	    price3=scan.nextDouble();
	    totalPrice=price1+price2+price3;
	    report= "Item1: "+item1+" Price:"+price1+" Item2: "+item2+" Price:"+price2+
	    		" Item3: "+item3+" Price:"+price3;
	    
	    System.out.println("Total price: "+totalPrice);
	    System.out.println(report);
	    
	}
	
}