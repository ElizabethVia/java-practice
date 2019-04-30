package day11_logical_nestedif;
import java.util.*;

public class TollCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Vehicle Type:");
		
		int carType= keyboard.nextInt();
		System.out.println("Is it rush hour: yes | no");
		
		String rushHour=keyboard.next();//yes or no
		boolean isRushHour;
		
		if (rushHour.equalsIgnoreCase("yes")) {
			isRushHour=true;
			
		}else {
			isRushHour=false;
		}	
		
		double price=0.0;
		if(carType==1) {
			if(isRushHour) {
				price=30.0;
			}else {
				price= 5.0;
			}
		}else if(carType==2) {
			if(isRushHour) {
				price=55.30;
				
			}else {
				price=15.99;
				
			}
		}
		
		System.out.println("Toll cost: "+price);
				
		
		
		
	
		
		
		
		
		//carType: 1,2
		//idRushHour: true or false
		//in this example we will use logical operators and nested if statements
		//if(condition1){
		//if(condition2){
		//code a 
	//}else{
		//code b
		//}else{
		//code c
		
		
		//condition1= true 
		//condition2= true 
		//code A
		 
		//condition1= false 
		//condition2= true 
		//code c
		
		//condition1= true 
		//condition2= false
		//code b
	}

}
