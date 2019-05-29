package Day42_customclasses_encapsulation;

import java.util.*;
import java.lang.*;//this import is always addes by compliler

public class StringShoesToObject {

	public static void main(String[] args) {
		// create Shoes object and assign the data from the
		// string data
		String data = "Bruno Magli,9.5";
		// split using, data and store into array
		String[] arrData = data.split(",");
		// create Shoes object
		Shoes shoes = new Shoes();
		shoes.setShoeData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());// Bruno Magli | 9.5
		// another way to do it
		shoes.brand = arrData[0];
		shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(shoes.getShoesData());

		Scanner scan = new Scanner(System.in);
		System.out.println("What shoe brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		// create object using data from scanner
		Shoes myShoes = new Shoes();
		myShoes.setShoeData(brand, size);
		System.out.println(myShoes.getShoesData());
		/*
		 * What shoe brand? 
		 * Crocks 
		 * What is your size? 
		 * 11.5 
		 * Crocks | 11.5 
		 */
		
	}

}
