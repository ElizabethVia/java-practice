package JavaDay_36WrapperClasses_arraylistintro;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		//create an arraylist
		String []str=new String[5];
		ArrayList<String>names=new ArrayList<>();
		
		int[]numsArray=new int[5];
		//ArrayList<int>nums=new ArrayList<>(); this will not work
		ArrayList<Integer>nums=new ArrayList<>();
		
		//how to assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
	    System.out.println(names.get(0));//Roman
		System.out.println(names.get(1));//Orhan
		System.out.println(names.get(2));//Vlad
		System.out.println(names);//[Roman, Orhan, Vlad, Olimjon, Natalia, Maria]
	    System.out.println("Name Count: "+names.size());//6
	    

		nums.add(new Integer("100"));
		nums.add(100);
		nums.add(99);
		nums.add(236);
		System.out.println(nums);//[100,100, 99, 236]
		System.out.println("Nums count: "+ nums.size());//4
		
	}

}
