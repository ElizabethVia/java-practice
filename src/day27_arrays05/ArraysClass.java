package day27_arrays05;
import java.util.*;
public class ArraysClass {

	public static void main(String[] args) {
		
		int[]nums= {43,12,4,1,3,5};
		//to String method
		System.out.println( Arrays.toString(nums));//[43, 12, 4, 1, 3, 5]
		String str=Arrays.toString(nums);
		System.out.println(str);//[43, 12, 4, 1, 3, 5]
		//sort method. sort array in a ascending order
		Arrays.sort(nums);
		System.out.println( Arrays.toString(nums));//[1, 3, 4, 5, 12, 43]

		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};

		System.out.println(Arrays.toString(languages));//[Zulu, Spanish, Italian, English, Polish, Arabic, Uzbek]
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));//[Arabic, English, Italian, Polish, Spanish, Uzbek, Zulu]
		                                               //numbers >UPPERCASE >lowercase
		                                               //1 2 3 A B C a b c
		
		int [] nums2= {345,665,3333,11,3,66};
		//find lowest and largest values from nums2 array
		//System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		int lowest=nums2[0];
		//int largest= nums2[5];
		int largest=nums2[nums2.length-1];
		
		System.out.println("Lowest num: "+lowest);//Lowest num: 3
		System.out.println("Largest num: "+largest);//Largest num: 3333
		
		 

	}

}
