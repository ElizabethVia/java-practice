import java.util.Arrays;
import java.util.Scanner;

public class Assignment145 {

	
		 public static void main(String[] args) {
			    Scanner inp = new Scanner(System.in);
			    int size = inp.nextInt();
			    int[] arr = new int[size];
			    for(int i=0 ;i<=size-1;i++)
			    {

			        arr[i]=inp.nextInt();
			    }
			    
			    plus_minus(arr);
			  }//end main
			  
			  public static void plus_minus(int[]num){
			    for(int i=0;i<num.length;i++){
			    	
			      int count=0;
			     // int total=0;
			    	for(int n:num) {
			   // System.out.println(Arrays.toString(num));
			    if(n==0) {
			    	count+=n;
			      System.out.println("zeros: "+n);
			    }else if(n<-1){
			    	count+=n;
			      System.out.println("negative:"+n);
			        
			      }else if(n>1){
			        count+=n;
			        
			        System.out.println("positive: "+n);
			        
			      }
			    
			      } 
			    	count++;
			    	break;
			  }
			  }
} 
			