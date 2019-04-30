package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {

	public static void main(String[] args) {
		//1 america: ford, dodge,tesla, chevrolet,lincoln
		//averagePrice:33000
		//2 japanese: toyota,mitsubisi,honda,subaru,mazda
		  //averagePrice: 32000
		//3 german: bmw,vw,audi, mercedes, porsche
		//averagePrice: 55000
		//4 italian: alfa romeo,ferrari,lamborghini,fiat
		//averagePrice:85000
		// korean: kia, hyundai,daewoo,
		//averagePrice: 25000
		//scanner:
		// whitch type of car you are interested in?
		//int carType=> 1,2,3,4,5;
		//double averagePrice
		// String carOpcions
		//you selected american car and your options are ford, dodge
		// average Price: 33000
		//"car type not available"
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Whitch type of car are interested in? :");
		System.out.println("1) American\n 2) japanese\n 3) German\n 4) Italian\n 5) Korean\n");
		int carType=scan.nextInt();
		
		double averagePrice= 0.0;
		String carOpcions ="";
		String carOrigin="";
		
		switch (carType) {
		case 1:
			
			averagePrice=33000;
			carOpcions="Ford, Dodge,Tesla, Chevrolet,Lincoln";
			carOrigin="American";
			break;
		case 2:
			
			averagePrice=32000;
			carOpcions="Toyota, Mitsubisi,Honda,Subaru,Mazda";
			carOrigin="Japanese";
			break;
		case 3:
			
			averagePrice=55000;
			carOpcions=" Bmw, VW, Audi, Mercedes, Porsche";
			carOrigin="German";
			break;
		case 4 :
			
			averagePrice=85000;
			carOpcions="Alfa romeo, Ferrari, lamborghini,Fiat";
			carOrigin="Italian";
			break;
		case 5:
			
			averagePrice= 25000;
			carOpcions="Kia, Hyundai, Daewoo";
			carOrigin="korean";
		break;
		default:
			System.out.println("Car type not available");
			return;//stop execution 
		}
		System.out.println("You selected "+carOrigin+" car and your options are "+carOpcions);
		System.out.println("Average Price: "+averagePrice);
	} 

}
