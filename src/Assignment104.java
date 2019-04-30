import java.util.Scanner;

public class Assignment104 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO Type your code below:
		    for(int i=0;i<=nums.length-1;i+=1){
		    
		      if(nums[i]==5) {
		      System.out.println(true);
		    }else{
		      System.out.println(false);
		    }
		    
		    } 
		    
		  }
}