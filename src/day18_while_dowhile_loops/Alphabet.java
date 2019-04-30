package day18_while_dowhile_loops;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter='a';
		while(letter<='z') {
			System.out.print(letter+" ");
			letter++;
		}
		System.out.println();
		char capitals='A';
		while(capitals<='Z') {
			System.out.print(capitals+" ");
			capitals++;
		}
	System.out.println();
		
		
		
		char reverse='z';
		while(reverse>='a') {
			System.out.print(reverse+" ");
			reverse--;
		}
		System.out.println();
		/*
		 *A
		 *AB
		 *ABC
		 *ABCD
		 *ABCDE
		 *ABCDEF
		 *ABCDEFG
		 */
		String letters="";
		char myLetter='A';
		while(myLetter<='Z') {
			letters=letters+myLetter;
			System.out.println(letters);
			myLetter++;
		}
			
		
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    //for(char ch='a';ch<='z';ch++){
	     while(start<=end) {
	       System.out.print(start);
	       start++;
	     }
	    
	  //}
	}
	
		
		}
		 
		
		
		

