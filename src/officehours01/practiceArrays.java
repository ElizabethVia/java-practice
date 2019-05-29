package officehours01;

import java.util.Arrays;

public class practiceArrays {

	public static void main(String[] args) {
		  //2 int arrays.
		   // U need to add each value from 2 arrays and assign to a new array.
		   // [2, 4, 3]
		   // [4, 2, 9]
		  //  [6, 6, 12]
		int[] nums1= {10,20,5,3};
		int [] nums2= {5,1,1,4};
		System.out.println(nums1[0]+nums2[0]);//15
		//declare new empty array with size of nums1
		//int[]nums3= new int[nums1.length];
		//for(int i=0;i<nums1.length;i++) {
			//nums3[i]=nums1[i]+nums2[i];
		int[] newArrays=add2Arrays(nums1,nums2);
		//}
		
		String[]first= {"cybertek","java","student","mentor"};
		String[] second= {"100","001","five","best"};
		String[]third=add2Arrays(first,second);
		System.out.println("first: " +Arrays.toString(first));first:// [cybertek, java, student, mentor]
		System.out.println("second: " +Arrays.toString(second));//second: [100, 001, five, best]
		System.out.println("third: " +Arrays.toString(third));//third: [cybertek-100, java-001, student-five, mentor-best]
		
		System.out.println("nums1: " +Arrays.toString(nums1));//nums1: [10, 20, 5, 3]
		System.out.println("nums2: " +Arrays.toString(nums2));//nums2: [5, 1, 1, 4]
		System.out.println("nums3: " +Arrays.toString(newArrays));//nums3: [15, 21, 6, 7]
}
	/*
	 * add2Arrays
	 * return type: int[]
	 * params: int[] nums1, int[] nums2
	 * add each value and assign to new array then return it
	 */
   public static int[] add2Arrays(int[] nums1, int[] nums2) {
	 //declare new empty array with size of nums1
	 		int[]nums3= new int[nums1.length];
	 		for(int i=0;i<nums1.length;i++) {
	 			nums3[i]=nums1[i]+nums2[i];
	 		}
	 		return nums3;
   }
  //        ["abc", "hi"]
	//	    ["bye", "sql"]
		//  ["abc-bye", "hi-sql"]
   public static String[] add2Arrays(String[]str1, String[] str2){
	   String[]str3=new String[str1.length];
	   for(int i=0;i<str1.length;i++) {
		   str3[i]=str1[i]+"-"+str2[i];
	   }
	   return str3;
   }
}
