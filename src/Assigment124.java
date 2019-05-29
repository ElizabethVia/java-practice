import java.util.Arrays;
import java.util.Scanner;

public class Assigment124 {

	public static void main(String[] args) {
		
			   Scanner scan = new Scanner(System.in);
					int size = scan.nextInt();
					int[] num = new int[size];
					for(int i =0; i < size; i++) {
						num[i] = scan.nextInt();
					}
					//WRITE YOUR CODE HERE
			    int[] num2 = Arrays.copyOf(num, 2);
			   if (num2.length <2) {
				   
			   System.out.println((num[size]));
			 
			   } else if (num.length<1){
			     System.out.println((num[size]));
			   }
			  }
			}
