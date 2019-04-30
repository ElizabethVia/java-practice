package officehours01;

import java.util.Arrays;

public class IntArray {
	public static void main(String[] args) {

		int[]nums= {10,15,20,25,30};
		
		System.out.println(Arrays.toString(nums));//[10, 15, 20, 25, 30]

		//print everything using for each loop
		for(int n:nums) {
			if(n>17) {
			System.out.println(n);//200 25 30
		}
			
	}
		
		//calculate sum using for loop
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}	
		System.out.println("Sum:"+ sum);//Sum:100
		
		//print middle number
		
		int m=nums[nums.length/2];
		int l=nums[nums.length-1];
		System.out.println("m:"+m+" l:"+l);//m:20 l:30

		
		//find the lowest assign first number then compare in the loop
		int lowest=nums[0];//30 
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<lowest) {//it will check one by one to see witch number is lowest than 30
				lowest=nums[i];
			}
		}
		System.out.println("Lowest num: "+lowest);//Lowest num: 10
		
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Max:" + max);//int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Max:" + max);//Max:30
		
		
	}

		
		
	}
