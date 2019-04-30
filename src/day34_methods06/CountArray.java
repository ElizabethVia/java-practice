package day34_methods06;

import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
	    //1. with Print return right away
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));
		//2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: " + five);
		if(five > 0) {
			System.out.println("We have 5s");
		}else {
			System.out.println("No 5s");
		}
		if(findOccurences(nums, 2) > 0) {
			System.out.println("We have 2");
		}else {
			System.out.println("No 2s");
		}
		//create array and pass to method 
		int twenty=findOccurences(new int[] {10,20,20,30,55,22}, 20);
		System.out.println("twenty: " + twenty);
		

	}
	/*
	Class CountArray
	Method findOccurences
	Return type: int
	Params. int[] array, int value
	Method will look for value in the array 
	and return the count of occurences
	 */
	public static int findOccurences(int[] array, int value ) {
		int counter = 0;
		for(int num : array) {
			if(num == value) {
				counter++;
			}
		}
		return counter;
	} 
	
    public static int[] getArray() {
    	int[] retArray= {45,43,12,552,1000};
    	return retArray;
    }
   // method nme:getRandomArray
   // Return type: int []
   // params: int size
   // in the method create an array with value of size
   // and assign ramdom values from 0-100
   // and return it
    public static int[] getRamdomArray(int size) {
    	Random rand=new Random();//create Random class object
    	int [] nums=new int[size];//declare array with size number of elems
    	for(int i=0;i<size;i++) {
    		nums[i]=rand.nextInt(101);//get random number abd assign to array int 
    		
    	}
    	return nums;
    }
    
    
    
    
    
    
    
    
    
    
}