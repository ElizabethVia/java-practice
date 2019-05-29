import java.util.Scanner;

public class WhileLoops2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total=0;
		System.out.println("Enter a positive integer");
		int nextNum=scan.nextInt();
		while(nextNum>0) {
			total+=nextNum;//every number the user puts, it will keep adding 
			              //until the user puts a negative number
			nextNum=scan.nextInt();
		}
           System.out.println("Sum of all numbers: "+total);
           /*Enter a positive integer
             10
             20
             50
             -1
             Sum of all numbers: 80
              */

	}

}
