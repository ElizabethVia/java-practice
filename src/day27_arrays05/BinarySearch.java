package day27_arrays05;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		          // 0 1 2 3  4
		int[] nums= {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(nums, 7)); //2
		System.out.println(Arrays.binarySearch(nums, 55));//4
		System.out.println(Arrays.binarySearch(nums, 2));//-2
		System.out.println(Arrays.binarySearch(nums, 4));//0
		
		int i =Arrays.binarySearch(nums,10);
		System.out.println(i);//3
		
		int[] nums2= {40,6,17,10,55};
		Arrays.sort(nums2);//3 because 40 is in position 3
		System.out.println(Arrays.binarySearch(nums2,40));//-5 because is not sorted
		
		//Arrays.sort(a,fromIndex,toIndex,c);comparator
		
		
		

	}

}
