package day_20_forLoops;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if statement
		//using for loop:1-100
		//1print all even numbers in same line
		//2print all odd numbers in same line
		//3sumOOdds,sumOfEvens-calculate them 
		//and print out after the loop
		//sumof 1-10
		//1+2+3+4+5+6+7+8+9+10
		
		for(int n=1;n<=100;n++) {
			if(n%2==0) {
			  System.out.print(n+" ");
			 } 
			}
			System.out.println();
			for(int j=1;j<=100;j++) {
				if(j % 2 !=0) {
					System.out.print(j+" ");
			}	
			}
			System.out.println();
		int sumOfOdds=0;
		int sumOfEvens=0;
		for(int num=1;num<=100;num++) {
			if(num%2 ==0) {
				sumOfEvens+=num;
			}else {
				sumOfOdds+=num;
			}	
			}
				System.out.println("Sum of evens: "+sumOfEvens);
				System.out.println("Sum of evens: "+sumOfOdds);
			 
		
	}

}
