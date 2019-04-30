package Java_day_24;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		
//      BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
//      1. Step create an rray of strings, on store these cars inside that array
		String [] cars= {" BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		String [] cars2=new String[8];
		//step2 print car names that starts with M
		for(String c: cars) {
			if(!c.startsWith("M")) {
				continue;
		}
			System.out.println(c);
		
			
		}
		//step 3 print all cars that have letter "r" somewhere in the name
		//please make your search case insensitive
		
		System.out.println("******************");
        // 3. Step: Print all cars that have letter "r" somewhere in the name.
        // Please make your search case insensitive
        for (String make : cars) {
            if (make.toLowerCase().contains("r")) {
                System.out.println(make);
            }
            //step 4 print car names that ends with a
            System.out.println("**********************");
            
            for (String cars1:cars) {
            	if(!cars1.endsWith("a")) {
            		continue;
            	}
            	System.out.println(cars1);
            }
}
        System.out.println("**************************");
        //step5 print all cars that has at least 6 letters in the name
        for(String c:cars) {
        	if(c.length()>6) {
        		System.out.println(c);
        	}
        }
        System.out.println("********************");
        for(int i=0;i<cars.length;i++) {
        	String car=cars[i];
        	if(car.length()>=6) {
        		System.out.println(car);
        	}
        }
        System.out.println("************************");
        //before BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
        //after tesla, 
        // Swap first and last value in the array
        String temp=cars[0];
        cars[0]=cars[cars.length-1];
       cars[cars.length-1]=temp;
       System.out.println("Before sorting");
       System.out.println(Arrays.toString(cars));
       Arrays.sort(cars);
       System.out.println("After sorting");
       System.out.println(Arrays.toString(cars));
       System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
        
        
        
	
	}
}
