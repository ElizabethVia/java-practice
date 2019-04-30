import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    for(char ch='a';ch<='z';ch++){
	     
	    	ch++;
	    System.out.println(ch) ;
	  }
	}

}
