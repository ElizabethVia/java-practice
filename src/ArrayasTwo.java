import java.util.Scanner;

public class ArrayasTwo {

	public static void main(String[] args) {
		int[] num={456,8456,8,7896};
		//int min=nums[0];
		int min=Integer.MAX_VALUE;
		for(int i=0; i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];//8
			}
		}
System.out.println(min);
System.out.println("**********************");
//find total value
	int total=0;
	for(int i=0;i<num.length;i++) {
		total+=num[i];
		
	}
	System.out.println(total);
	int ave=total/num.length;
	System.out.println("average is = "+ave);
	
	
	for(int j=80;j>=20;j--){
	      if(j % 2==0) {
	    	  
	    	  System.out.print(j +" ");
	}
	      
	      }
	 System.out.println("#############");
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: Write your code below
    int ctr_even=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i] % 2==0) {
    	ctr_even++;
    }
     }  	
      System.out.print(ctr_even);
      
    
      
     
  
   
   
	        
         
	    }
	    

}
