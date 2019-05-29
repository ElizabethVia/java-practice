package day52_Inheritance05;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		final int [] TEAMS= new int []{ 11,11};
		//final int [] TEAMS= { 11,11};or we can also do this
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team1: "+TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team1: "+TEAMS[1]);
		
		int []nums = new int [] {23,55,35543};
		System.out.println(Arrays.toString(nums));
		nums= new int[] {2154,4521,2,45,256,1};
		System.out.println(Arrays.toString(nums));
		final int[]finalNums= {23,66,44,11};
		System.out.println(finalNums);
		finalNums[0]=34567;
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums=new int[] {22,44,56,1123,345};this will not work
		final double []PRICES=new double [3];
		PRICES[0]=85.5;
		PRICES[1]=99.99;
		PRICES[2]=99.98;
		System.out.println(Arrays.toString(PRICES));
		PRICES[0]=81.1;
		System.out.println(Arrays.toString(PRICES));
		//PRICES=new double [3];new object will not work
		
		
		
	}

}
