package day41_customClasses02;

import java.util.ArrayList;
import java.util.List;

public class WarmUpWithList {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		System.out.println(doubleTheList(myList));//[10, 8, 20]
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);//[100, 88, 202]

	}
	/*
	 * name: doubleTheList 
	 * return type: List<Integer>
	 *  params: List<Integer> nums 
	 *  It will double the values of each element and return it
	 * 
	 * doubleTheList([3,5,7]); => [6,10,14]
	 * 
	 * Try solving without creating another arraylist in the method.
	 */

	public static List<Integer> doubleTheList(List<Integer> nums){
		
		 for(int i=0;i<nums.size();i++) {
			 nums.set(i, nums.get(i)*2);
		 }
		 return nums;
	}
}
