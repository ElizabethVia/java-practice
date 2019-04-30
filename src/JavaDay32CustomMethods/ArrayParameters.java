package JavaDay32CustomMethods;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		int[]myArray= {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33,45,5,7});//or you can put the values inside
		printArray(new int[] {3,4,5,6,7,8,9,45,85,1,23,65,7,8});
		int[] myNums= {7,2,6,95,48,2,4};
		printArray(myNums);
		int[]num1= {45,8,25,45};
		int[]num2= {9,5,12};
		print2Array(num1,num2);
		
		print2Array2(num1,num2);
		
		
		//int[]nums=myArray the value of myArray copy the value to nums
		//Method : printArray
		//return: void
		//param: int []nums
		//print value of the nums array
		

	}
      public static void printArray (int[] nums) {//nums=myArray
	  for(int n :nums) {
		  System.out.print(n+" ");
	  }
	  System.out.println();
  }
      public static void print2Array(int[]n1, int[]n2) {
    	  
    	  if(n1.length>n2.length) {
    		System.out.println(Arrays.toString(n1));  
    		System.out.println(Arrays.toString(n2));
    	  }else {
    		  System.out.println(Arrays.toString(n2));
    		  System.out.println(Arrays.toString(n1));
    	  }
      }
      //pass arrays to methods
      //version2 we will call printArray method
 public static void print2Array2(int[]n1, int[]n2) {
    	  
    	  if(n1.length>n2.length) {
    		printArray(n1);
    		printArray(n2);
    		
    	  }else {
    		  printArray(n2);
    		  printArray(n1);
    		  
    	  }
      }
}
