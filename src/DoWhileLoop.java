
public class DoWhileLoop {

	public static void main(String[] args) {
		int apples=1;
		do {
			System.out.println("Eating an apple "+apples);
			apples++;
		
		}while(apples<0);
		System.out.println("No more apples ");
		int number =1;
		int until=10;
		do {
			System.out.print(number+" ");
			number++;
			
		}while(number<=until);//1 2 3 4 5 6 7 8 9 10 
		
		int number1=1;
		int until1=15;
		do {
			System.out.print(until1+", ");
			until1--;
		}while(until1>=number1);
//15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,
	}

}
