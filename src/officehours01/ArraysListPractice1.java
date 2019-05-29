package officehours01;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractice1 {

	public static void main(String[] args) {
		int[]nums=new int[4];
		nums[0]=23;
		nums[1]=30;
		nums[2]=50;
		nums[3]=85;
//**************************************************
		System.out.println(Arrays.toString(nums));
		ArrayList<Integer> nums2=new ArrayList<>();
		nums2.add(23);
		nums2.add(15);
		nums2.add(10);
		nums2.add(125);
		nums2.add(2,65);// 2 means position,65 will go to position 2
		System.out.println(nums2);
		System.out.println("How many elements in array list? "+nums2.size());
		//auto boxing helps us to convert primitive into object
		//if we enter number into remove()method,it will treat this number as index
		Integer numToDelete=23;
		nums2.remove(numToDelete);
		System.out.println(nums2);
	}

}
;