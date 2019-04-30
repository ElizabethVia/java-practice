package day29_metho01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		String[][] countriesArray= {
				                //0          1
				              {"USA","Washington DC"},//0
				              {"Canda","Ottawa"},//1
				              {"Mexico","Mexico city"},//2
				              {"Brazil","brasilia"},//3
				              {"Peru","Lima"},//4
				              {"Argentina","Buenos Aires"},//5			              {"Bolivia","La Paz"},//6
				              {"Macedonia","Scopia"},//7
				              {"Kazakhstan","Nursultan"}//8
	                        	};
		                       
				//String[] [] c=new String[9][2];
		       //c[0][0]="USA"; c[0][1]="Washington DC",
		System.out.println(countriesArray[0][0]+"|"+countriesArray[0][1]);
		System.out.println((countriesArray[8][0]+"|"+countriesArray[8][1]));
		//print all the countries in same line separated by |
		System.out.println();
		System.out.print(Arrays.deepToString(countriesArray));
		System.out.println();
		for(int i=0;i<countriesArray.length;i++) {
			System.out.print(countriesArray[i][0]+" | ");
			//System.out.print(Arrays.toString(countriesArray[i])+"|");
		}
		System.out.println();
		//for each loop
		for(String[]country:countriesArray) {
			System.out.print(country[0]+" | ");
			
		}
		System.out.println();
		for(int j=1;j<countriesArray.length;j++) {
			System.out.print(countriesArray[j][1]+" | ");
		}
		System.out.println();
		for(String[]c:countriesArray) {
			System.out.print(c[1]+" | ");
		}
		//get all the cities and add to cities []array
		//declare cities array and size need to match countries Array size
		//String[] Cities=new String [9];
		System.out.println();
		String[] Cities=new String [countriesArray.length];
		//System.out.print(Arrays.toString(Cities));
		for(int i=0;i<countriesArray.length;i++) {
			Cities[i]=countriesArray[i][1];
		}
		System.out.println(Arrays.toString(Cities));
		//look for Bolivia in the countriesArray and test if capital city is "La Paz"
		for(int row=0;row<countriesArray.length;row++) {
			if(countriesArray[row][0].contentEquals("Bolivia")) {
				//System.out.println(countriesArray[row][1]);//La Paz
				if(countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("bolivia test failed");
				}
				break;
			}
		}
	}

}
