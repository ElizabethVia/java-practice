import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 
 		String word=scan.next();
 		Boolean exists=false;
 		if(word.contains("java")) {
 			word=word.replaceFirst("java", "#");
 			if(word.indexOf("#")<=1) {
 			exists=true;
 			System.out.println(exists);
 		}else 
 			System.out.println(exists);
 		}
	}

}
