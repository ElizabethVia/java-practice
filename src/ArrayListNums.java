import java.util.ArrayList;

public class ArrayListNums {

	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
	      nums.add(10);
	      nums.add(25);
	      nums.add(50);
	      nums.add(100);
	      nums.add(5);
	      nums.add(80);
	      System.out.println(nums.toString());
	     int n= nums.size();
	     System.out.println(n);
	     Integer n1=new Integer(10);
	   //  Integer n2=Integer.valueOf(10);
	     nums.remove(n1);
	     System.out.println(nums.toString());
	}

}
