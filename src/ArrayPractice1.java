import java.sql.Array;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int[] myNumber= {3,9,7,64,6,11,26,27,1,15,99,1000,88,555};
		System.out.println(myNumber[0]);//3
		System.out.println(myNumber[2]);//7
		System.out.println(myNumber.length);//14 
		
		System.out.println();
		
		int[]nums=new int[5];
		nums[0]=123;
		nums[1]=432;
		nums[2]=567;
		nums[3]=765;
		nums[4]=1;
		
		//how to replace a number
		nums[0]=100;
		nums[1]=nums[1]+10;//this way is also posible
		nums[2]++;
		nums[3]=nums[0];
		nums[4]=nums[0]+nums[1]+nums[2];//we can up date
		System.out.println();
		
		
		 String[] cities= {"Miami","London","Tokyo","Rome","New york",};
		 System.out.println(cities[0]);
		 System.out.println(cities[1]);
		 System.out.println(cities[2]);
		 System.out.println(cities[3]);
		 System.out.println(cities[4]);
	
	}

}
