
public class PracticeAssignmentTwo {

	public static void main(String[] args) {
		
		int amount, quarters, dimes, nickels, pennies, originalamount;
		
		amount= 87;
		originalamount= amount;
		quarters = 75;
		dimes=10;
		nickels =0;
		pennies =2;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
		System.out.println(originalamount + " cents in coins can be given as:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes  + " dimes");
		System.out.println(nickels + " nickles and ");
		System.out.println(pennies + " pennies");
		
		
	}

}
