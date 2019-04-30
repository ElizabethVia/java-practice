package day28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		             // two teams 6 people in each team
		//declare multiD array with 2 rows and 6 cols
		String[][] teams=new String[2][6]; 
		teams[0][0]="Irina";
		teams[0][1]="Zarif";
		teams[0][2]="cihan";
		teams[0][3]="Habib";
		teams[0][4]="Adel";
		teams[0][5]="Bojan";
		
		teams[1][0]="Olimjon";
		teams[1][1]="Mirshod";
		teams[1][2]="Usman";
		teams[1][3]="Nursultan";
		teams[1][4]="Roman";
		teams[1][5]="Dmitriy";
		System.out.println("First players of first team ");
		System.out.println(teams[0][0]);//Irina
		System.out.println(teams[0][3]);//Habib
		System.out.println(teams[1][5]);//Dmitriy
		System.out.println(teams[1][3]);//Nursultan
		
		//print how many rows/teams/arrays
		System.out.println("Number of rows: "+teams.length);//Number of rows: 2
		System.out.println("People of first team: "+teams[0].length);//People of first team: 6
		System.out.println("People of Second team: "+teams[1].length);//People of first team: 6
		System.out.println(Arrays.deepToString(teams));//[[Irina, Zarif, cihan, Habib, Adel, Bojan], [Olimjon, Mirshod, Usman, Nursultan, Roman, Dmitriy]]
		
		
		int[][] Citys=new int[3][4]; 	
		Citys[0][0]=100;
		Citys[0][1]=500;
		Citys[0][2]=6548;
		Citys[0][3]=4587;
		
		Citys[1][0]=524; 
		Citys[1][1]=458;
		Citys[1][2]=1458;
		Citys[1][3]=4875;
		
		Citys[2][0]=5244;
		Citys[2][1]=4458;
		Citys[2][2]=1258;
		Citys[2][3]=49675;
		
		System.out.println(Arrays.deepToString(Citys));//[[100, 500, 6548, 4587],
		                                               //[524, 458, 1458, 4875], 
		                                               //[5244, 4458, 1258, 49675]]
		
		System.out.println(Arrays.toString(Citys[0]));//[100, 500, 6548, 4587]
		
		int[] [] scores = { {3,5,10},{6,4,2,10} };

		System.out.println("Days played/Number of Arrays: "+scores.length);//Days played/Number of Arrays: 2
		System.out.println("NUmber of values in 1: "+scores[0].length);//NUmber of values in 1: 3
		System.out.println("NUmber of values in 2: "+scores[1].length);//NUmber of values in 2: 4
		
		int[] [] values=new int[4][];
		values[0]=new int[] {34,23,5};//first row
		values[1]=new int[] {34,45,78,15,46,2,54,8,62,245,1};//second row
		
		values[2]=new int[2];//55,88 third row
		values[2][0]=55;
		values[2][1]=88;
		
		values[3]=new int[] {5,8,12,45,77};//Four row
		
		System.out.println(Arrays.deepToString(values));
		

    
		
		
		
	}

}
