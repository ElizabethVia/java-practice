package Java_day31_methos3;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		countUp(5);//num=5
		countUp(10);//num=10;    1 2 3 4 5 6 7 8 9 10
		//countUp("hi") will no work
		countUp(0);//Invalid input
		int num=7;
		countUp(num);
		countDown(3);
		int n=5;
		countDown(n);//num=n  5 4 3 2 1
		countDown(0);//invalid Input
		
		
		drive("Audi",60);//Audi is driving 60 mph
		drive("Red Mazda", 70);//Red Mazda is driving 70 mph
		drive("Honda", 60);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to counUp");
		//get number from keyboard 
		int inputNum=scan.nextInt();
		//call countUp method and set it as input
		countUp(inputNum);
	}
	//name: countUp
	//return type:void
	//parm/Input: int 
	//it print from 1 to value of the parm
	//countUp(5)
	//1 2 3 4 5
	public static void countUp(int num) {
		if(num<1) {
			System.out.println("Invalid input -"+num);//Invalid input -0
		}else {
		for(int i=1;i<=num;i++) {
			System.out.print(i+ " ");//1 2 3 4 5
			
		}
		System.out.println();
	}
   
	
}
	//name countDown
	//return type: void
	//param: int 
	//countDown(5);
	//5 4 3 2 1 
	public static void countDown(int num) {
		if(num<1) {
			System.out.println("Invalid Input");
		}else {
		 for (int n = num;n>=1;n--) {
			 System.out.print(n+" ");//3 2 1
		 }
		 }
		 System.out.println();
	}
	//method name: drive
	//return type: void
	//params/args: String car, int speed
	public  static void drive(String car,int speed) {
		System.out.println(car +" is driving "+speed+" mph");
	}
	
}