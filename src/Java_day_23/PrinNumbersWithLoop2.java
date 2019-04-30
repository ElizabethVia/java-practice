package Java_day_23;

public class PrinNumbersWithLoop2 {

	public static void main(String[] args) {
		//print trianle by using nested loops like the exsample below
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		//12345678
		//123456789
		//12345678910
		
		for(int j=1;j<=10;j++) {
			//inner loop
			for(int i=1;i<=j;i++) {//la j es para q se sume de 1 -12-123 etc
				System.out.print(i+"");
			}
				System.out.println();	
				
				
	}
		System.out.println("##############"); 
		
		for(int j=10;j>=1;j--) {
			//inner loop
			for(int i=j;i>=1;i--) {//un triangulo de 10 a el 1
				System.out.print(i+"");
			}
				System.out.println();	
		
	}

}
}