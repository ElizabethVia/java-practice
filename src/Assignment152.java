import java.util.Scanner;

public class Assignment152 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
			  for(int i=0;i<nums.length;i++){
				    
				    int temp=nums[i];
				    
				    int counter=0;
				       for(int j=0;j<nums.length;j++){
				         if(nums[j]==temp && i != j){
				           counter++;
				           break;
				         }
				         
				       }
				       if (counter==0){
				         System.out.println(temp);
				    	  
				       }
				       
				    }
				    
				  }
				}