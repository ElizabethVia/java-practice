import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    
		    
		    for(int i=0;i<nums.length/2;i+=1){
		      
		      int temp=nums[0];
		      nums[0]=nums[4];
		      nums[4]=temp;
		      
		    }
		    
		    
		    //Do not change below statement:
		    System.out.println(Arrays.toString(nums));
		    
		  }
		

	}


