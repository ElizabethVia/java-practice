package officehours01;

public class ArrayOrder {

	public static void main(String[] args) {
		
		int [] nums= new int[] {1, 1, 4, 6, 7, 12};
		int [] nums2= new int[] {1, 4, 6, 3, 7, 12};
		int [] nums3=new int[] {433, 12, 5};
		isArraySorted(nums);
		isArraySorted(nums2);
		isArraySorted(nums3);
		isArraySorted(new int[] {10,33});
	}

	private static void isArraySorted(int[] nums) {
		boolean sorted=true;//local variable inside method
		for(int i=0;i<nums.length-1;i++) {
			System.out.println(nums[i]+" "+nums[i+1]);
			if(nums[i]> nums[i+1] ){
				sorted =false;
				break;//exit the loop
			}
		}
System.out.println("Is Array sorted? - "+sorted);
	}
	//Method accepts array of ints
	//public static  void isArraySorted(int [] n) {
		
	}


