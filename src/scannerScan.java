import java.util.Scanner;

public class scannerScan {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your name:");
		String firstName=input.next();
		System.out.print("Nice to meet you, "+firstName);
		
		System.out.print(" How old are you?");
		int age = input.nextInt();
		System.out.print("Age:"+ age);
		Scanner sc=new Scanner(System.in);
		
		double grade =0.0;
		System.out.println(" Enter your grade");
		grade = sc.nextDouble();
		if (grade  >=60.0) {
		System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}


}

