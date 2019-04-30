package day08_casting_conditionals;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		/*A,B,C,D
		//char grade= scan.next().chatAt(0);
		//if grade is'A' => 
		 * Excellent job! keep it up!
		 * else
		 * how many did you miss for 'A'?
		 * int points=scanner
		 * print"Your grade B is not good enough."
		 *      "You could earn 10 more points if you studied harder."
	     */
			System.out.println("##START OF PROGRAM###");
		Scanner scan= new Scanner (System.in);
		System.out.println("What is your grade?");
		char grade=scan.next().charAt(0);
		if(grade =='A') {
			System.out.println("Excellent job! keep it up!");
		}else {
			System.out.println("Your grade "+ grade+" is not good enough.");
			System.out.println("how many did you miss for 'A'?");
			
			int points= scan.nextInt();
			System.out.println("you could earn "+points+" more points if you studied harder");
			
		}
		System.out.println("####END OF PROGRAM####");
		
		 String subject1,  subject2, subject3,  subject4, subject5, Summary;
		   double  grade1,  grade2, grade3,  grade4, grade5, average;
		   
		   System.out.println("Welcome to the Grader!");
		   System.out.println("Please enter subject name number 1 and score for this subject");
		   subject1=scan.next();
		   grade1=scan.nextDouble();
		   System.out.println("Please enter subject name number 2 and score for this subject");
		   subject2=scan.next();
		   grade2=scan.nextDouble();
		   System.out.println("Please enter subject name number 3 and score for this subject");
		   subject3=scan.next();
		   grade3=scan.nextDouble();
		   System.out.println("Please enter subject name number 4 and score for this subject");
		   subject4=scan.next();
		   grade4=scan.nextDouble();
		   System.out.println("Please enter subject name number 5 and score for this subject");
		   subject5=scan.next();
		   grade5=scan.nextDouble();
		   Summary=subject1+ " - " +grade1+", "+subject2+ " - " +grade2+", "+subject3+ " - " +grade3+", "+ subject4+ " - " +grade4+", "+subject5+ " - " +grade5;
		   System.out.println("Summary: "+Summary);
		   average = (grade1+grade2+grade3+grade4+grade5)/5;
		   System.out.println("Your average score is: "+average);
		   System.out.println("Thank you for using Grader!");
		   System.out.println("Goodbye!");
	}

}
