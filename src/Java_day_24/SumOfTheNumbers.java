package Java_day_24;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//let's create an array of integers with length 3
		int[] numbers =new int[3];
		//first value in the array
		numbers[0]=25;
		//second value in array
		numbers[1]=10;
		//third value in array
		numbers[2]=20;
		//System.out.println(numbers);//[I@59f95c5d
		//toString() from arrays class can help as to print an array as string
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		//use for loop, in order to loop through the array
		//and calculate sum of all elements
		//numbers.length-- returns number of elements in the array
		//the final field array.length cannot be assigned
		//number.length=5;
		for(int i=0; i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
         System.out.println("Sum: "+sum);
         //find largest value in the array
         int max =Integer.MIN_VALUE;
         for(int i=0; i<numbers.length;i++) {
        	 if(numbers[i]>max) {
        		 max=numbers[i];
        	 }
         }
         System.out.println("Max value: "+max);
         //find MIN VALUE in the array
         int min=Integer.MAX_VALUE;
         for(int k=0; k<numbers.length;k++) {
        	 if(numbers[k]<min) {
        		 min=numbers[k];
        	 }
         }
         System.out.println("Min value :"+min);
	}

}
