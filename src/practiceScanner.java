import java.util.Scanner;

public class practiceScanner {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cats= new Scanner(System.in);
	    String cat1,cat2,cat3;
	    int age1,age2,age3;
	    System.out.println("Whats your name?");
	    cat1=cats.next();
	    cat2=cats.next();
	    cat3=cats.next();
	    
	   System.out.println("How old are you?");
	   age1=cats.nextInt();
	   age2=cats.nextInt();
	   age3=cats.nextInt();
	   System.out.println("The cats are: "+ cat1+" " + age1 + " years old, "+
	   cat2+" " + age2 + " years old and " + cat3+" " + age3 + " year old");
	}

}
