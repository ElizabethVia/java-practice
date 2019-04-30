package day30_methods02;

import java.util.Scanner;

public class WarmUpMethods {

	public static void main(String[] args) {
		print5Stars();//call the method
		//call print5Stars 100 time
		for(int i=1;i<=10;i++) {
			print5Stars();
		}
		introduce();
		
	}
	public static void print5Stars(){
		System.out.println("* * * * *");
		
		
	}
	//method name:introduce()
	//params/args:nothing
	//return type:void
	//it will ask for a name and say nice to meet you
	public static void introduce() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Nice to meet you "+name);
	}
}
