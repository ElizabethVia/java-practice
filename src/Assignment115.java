import java.util.Scanner;

public class Assignment115 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			//write your code below
			for(String n:words) {
		//	for(int i=0;i<n.length();i++) {
				if(n.length()>=10){
					System.out.println(n);
				}
			}
			
		}

	}
