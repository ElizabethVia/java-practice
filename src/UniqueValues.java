import java.util.ArrayList;
import java.util.List;

public class UniqueValues {

	public static void main(String[] args) {
		
	 List<Integer>nums=new ArrayList<>();
	 nums.add(5);nums.add(1); nums.add(4); nums.add(5); nums.add(8);
	 nums.add(4); nums.add(3); nums.add(10); nums.add(1); nums.add(3);
	 System.out.println(nums.toString());
	 //[5, 1, 4, 5, 8, 4, 3, 10, 1, 3]
	 //find Duplicaded values
	 List<Integer>unique1=new ArrayList<>();
	 for(int num:nums) {
		 if(!unique1.contains(num)) {
			 unique1.add(num);
		 }
	 }
	 
	 System.out.println(unique1);
	 
	 System.out.println();
	//2 find unique(appearing once values
			//[5, 1, 4, 5, 8, 4, 3, 10, 1, 3]
	        //[5, 1, 4, 5, 8, 4, 3, 10, 1, 3]
			//[8,10]
	 List<Integer>unique2=new ArrayList<>();
	for(int i=0;i<nums.size();i++) {
		int count=0;
		int value=nums.get(i);
		for (int j=0;j<nums.size();j++) {
			if(nums.get(j)==value && i!=j) {
				count++;
				break;
			}
		}
		if(count==0) {
			unique2.add(value);
		}
	}
	System.out.println(unique2);
	}

}
