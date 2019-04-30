package Java_day_21_loops_practice1;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter word");
		String word=scan.next();//javva
	    String unique= "";
	    
	    for(int i=0; i< word.length();i++) {
	    	//read  the letter and assign
	    	char letter=word.charAt(i);

	    	//System.out.println(letter);//it will print the input word one by one
	    	if(!unique.contains(""+letter)) {
	    		unique+=letter;//add to unique
	    	}
	    	
	    	
	    }
	    
	    System.out.println(unique);
		/*
		 * for(int i = 0; i<word.length(); i++) { System.out.println(i);//print
		 * increases every time we print it if "java" it will print 0123
		 * System.out.println(word.charAt(i));
		 * 
		 * }
		 */
	
	    
	}

}
