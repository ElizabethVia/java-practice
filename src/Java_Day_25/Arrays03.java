package Java_Day_25;

public class Arrays03 {

	public static void main(String[] args) {
		
		int[] population=new int[5];
		population[0]=5000;
		population[1]=10000;
		population[2]=7000;
		population[4]=8907;
		population[3]=4455;//you don't have to put it in order
		//int[] population={500,1000,7000,4455,8907};shorter way to do it
		
		System.out.println("City 0 population :"+population[0]);
		System.out.println("City 1 population :"+population[1]);
		System.out.println("City 2 population: "+population[2]);
		System.out.println("City 3 population: "+population[3]);
		System.out.println("City 4 population: "+population[4]);
		
		
		int idx=0;
		System.out.println("City 0 population :"+population[idx]);
		 idx++;
		System.out.println("City 1 population :"+population[idx]);
		
		String str="abc";
		                         //3 it will print out 4455,it will print the index 3
		System.out.println("City STR.length population :"+population[str.length()]);
		
		//string array called cities="Miami","London", "tokyo","Rome", "New York";
		
		String[] cities={"Miami","London", "tokyo","Rome", "New York"};
		
		// population of miami is 5000\
		// population of london is 10000
		// population of tokyo is 7000
		// population of rome is 4455
		// population of new york is 8907
		System.out.println("Population of "+cities[0]+ " is " + population[0]);
		System.out.println("Population of "+cities[1]+ " is " + population[1]);
		System.out.println("Population of "+cities[2]+ " is " + population[2]);
		System.out.println("Population of "+cities[3]+ " is " + population[3]);
		System.out.println("Population of "+cities[4]+ " is " + population[4]);
		
		
		
		
		

	}

}
