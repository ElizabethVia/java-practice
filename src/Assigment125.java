import java.util.Arrays;
import java.util.Scanner;

public class Assigment125 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
				for(int i =0; i < size; i++) {
					nums[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
			
		int num1 = nums.length*2;
			int[] numberArr = new int[num1];
			numberArr[num1-1] = nums[nums.length-1];
			System.out.println(Arrays.toString(numberArr));
		  }
		}