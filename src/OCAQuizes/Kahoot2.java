package OCAQuizes;

import java.util.ArrayList;
import java.util.Arrays;

public class Kahoot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		Integer a=1;
		list.remove(1);//primiteve: it removes the index number
		list.remove(a);///wrapper: removes that specific value
		System.out.println(list);
		boolean b1=list.remove(new Integer(3));
		//wrapper class:returns boolean expression in remove method

		ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Integer s1=2;//                                       0,1 2 3 4
		if(list1.remove(s1)) {//[1,3,4,5]
			list1.remove(2);
			}
		System.out.println(list1);

		
		int [] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);//123
			if(arr[i]==3) {
				return;
			}
		}
		
	}

}
