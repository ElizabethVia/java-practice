import java.util.ArrayList;

public class MentoringArrayList2Ints {

	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(15);
		nums.add(20);
		nums.add(80);
		nums.add(10);
		nums.add(100);
		nums.add(5);
		nums.add(35); 
		//print all nums in one single line
		System.out.println(nums.toString());
		//remove a number 2 ways to do it
		//Integer n=new Integer(100);
		Integer n1=Integer.valueOf(100);
		nums.remove(n1);
		System.out.println(nums.toString());
		//sum using for for each loop
		int sum=0;
		for(double number:nums) {
			sum+=number;
		}
		System.out.println(sum);//165
		//sum using for loop
		int sum2=0;
		for(int i=0;i<nums.size();i++) {
			sum2+=nums.get(i);
		}
		System.out.println(sum2);//165
		
	}

}
