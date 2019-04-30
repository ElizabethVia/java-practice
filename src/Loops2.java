import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		for (int i=1; i<=10; i++) {
			
			System.out.println(":) "+ counter);
			
			counter++;
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String word=scan.nextLine();
		int counter1=0;
			
		
		for(int i=0; i<word.length();i++){
			if(word.charAt(i)=='a') {
				counter1++;
			}
		}
		System.out.println("# of times: "+counter1);
	}

}
