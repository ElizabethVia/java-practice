package day_19_loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter word to test:");
		//String word="java";/
		String word=scan.next();
		String reversed="";
		
		//loop through word in reverse order and concetanate each character to reversed string
		int idx=word.length()-1;
				while(idx>=0) {
		reversed=reversed+word.charAt(idx);
				idx--;
		}			
		System.out.println(reversed);	
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		}else {
			
		
		System.out.println("It is not palindrome");
		}
		//compare if word and reversed are equal
		
	}

}
