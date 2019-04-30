package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare int variables num1, num2, num3
		int num1,num2,num3;
		//assign 100 to num1
		num1 = 100;
		//assign value of num1 to num2
		num2=num1;
		//Print num1 and num2 values in separate lines
		System.out.println(num1);
		System.out.println(num2);
		
		num2=200;
		num1=num2;
		num3=num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//declare apples and assign 25
		int apples = 25;
		
		//declare kiwis and assign value of apples to it 
		int kiwis = apples;
		//declare mangoes and assign 55
		int mangoes = 55;
		//assign value of mangoes to kiwis
		kiwis =mangoes;
		System.out.println(apples);//25
		System.out.println(kiwis); //55
		System.out.println(mangoes);//55
		
		
		//declare cookies and assign 25
		int cookies = 25;
		
		//declare candies and assign value of cookies to it
		int candies = cookies;
		//declare chocolate and assign 12
		int chocolate = 12; 
		//assign value of chocolate to candies
		 candies = chocolate;
		 System.out.println(cookies);//25
		 System.out.println(candies);//12
		 System.out.println(chocolate);//12
		 
		 //declare cats and assign 3
		 int cats=3;
		 //declare bears and assign value of cats to it
		 int bears = cats;
		
		 //declare rats and assign 1
		 int rats=1;
		 // assign value of bears to rats 
		 rats =bears;
		 System.out.println(cats);//3
		 System.out.println(bears);//3
		 System.out.println(rats);//3
		 
		 
		
		
		
			
		
		
	}

}
