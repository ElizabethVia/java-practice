import java.util.Arrays;

public class SortArrayPractice {

	public static void main(String[] args) {
		int[] intArray= {2,15,7,1,3};
		//Sysntax for sorting Array elements
		Arrays.sort(intArray);
		for(int item:intArray) {
			System.out.println("number "+item);
		/*  number 1    0
			number 2    1
			number 3    2
			number 7    3
			number 15   4
			*/
			
		}
		System.out.println();
		//after sorting the Array the position of number 15 is 4
			System.out.println(Arrays.binarySearch(intArray, 15));//4
			System.out.println(Arrays.binarySearch(intArray, 3));//2
			
		String[]name= {"John","Adam","Don"};
		//Sintax for sorting Array elements
		Arrays.sort(name);
		for(String item:name){
			System.out.println("Names "+item);
			/*
			 * Names Adam
               Names Don
               Names John
              */
			
		}
		System.out.println(Arrays.binarySearch(name, "Don"));//is in position1
	    

	}

}
