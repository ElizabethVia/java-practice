package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		String[][] pizzas= { { "pineapple","pepperoni"},//0
				           { "anchovies","mushroom","olives"},//1
		                   { "4 cheese"},//2
		                   { "chicken","tomatoes","japalenios","onios"},//3
		                   {"green peppers","zuccini","brocolli","spinash","shrimp"}};//4
		System.out.println(Arrays.deepToString(pizzas[0]));//[pinrapple, pepperoni]
		
		for(String [] pizza:pizzas) {
			System.out.print(pizza.length + "-");
					        //2-[pineapple, pepperoni]
							//3-[anchovies, mushroom, olives]
							//1-[4 cheese]
							//4-[chicken, tomatoes, japalenios, onios]
							//5-[green peppers, zuccini, brocolli, spinash, shrimp]

			
			System.out.println(Arrays.deepToString(pizza));
		}
		System.out.println("######## FOR LOOP #############");
		for(int i=0;i<pizzas.length;i++) {
			System.out.println(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
			
		}
		for(String topping :pizzas[0]) {
			System.out.println(topping);//pineapple
			                           // pepperoni

		}
		int[] [] students= {{4,5,6},
				           {12,5,7},
				           {23,56,12,55,3}};
		//2 parts: outer loop, inner loop
		//outer loop will take each group
		//inner loop will take each value/students id
		for(int[] group:students){
			for(int studentsId:group) {
				System.out.print(studentsId+", ");
			}	
			System.out.println();//4, 5, 6, 
			                     //12, 5, 7, 
		                       	//23, 56, 12, 55, 3, 
}
		int [] [] nums= {
				         {10,20},
				         {20,30,40,50},
				         {100,200,400},
				         {555,333,444,666,78}
				         };
		for(int i =0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
