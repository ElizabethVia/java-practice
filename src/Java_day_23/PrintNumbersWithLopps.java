package Java_day_23;

public class PrintNumbersWithLopps {
public static void main(String[] args) {
	//this is just to print number from 1 - 10
	for(int i=1;i<=10;i++) {
		System.out.println(i+"");//12345678910
	}
	System.out.println("########################");
	//outer loop
	for(int k=1;k<=3;k++) {//because of this condition we print 3 times from 1 - 10 tres lineas de 2 separado por estrellas
	for(int j=1;j<=2;j++) {//because of this condition we print 2 times from 1-10 
		//inner loop
		for(int i=1;i<=10;i++) {//and beacuse of this we print from 1 to 10
			System.out.print(i+"");
		}
			System.out.println();	
}
	System.out.println("*******************");
	}
	
	
}	
}
