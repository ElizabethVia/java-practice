import java.util.Arrays;
import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		  }
		  
		  public static void timeConversion(String s) {
		    /*
				 * Write your code here.
				 */
				 String [] arr=s.split(":");
				 System.out.println(Arrays.toString(arr));
				 if(arr[2].contains("PM")){
				   arr[0]=Integer.toString(Integer.parseInt(arr[0])+12);
				 }
				 System.out.println(Arrays.toString(arr));
				 arr[2]=arr[2].replaceAll("\\D","");
				 System.out.println(Arrays.toString(arr));
				 
				 for(int i=0; i< arr.length;i++){
				  System.out.print(arr[i]);
				  if(i!=arr.length-1){
				    System.out.print(":");
				  }
				 }
				 
		  }
		
	}


