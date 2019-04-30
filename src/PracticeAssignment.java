import java.util.Scanner;


public class PracticeAssignment {
	
		  public static void main(String[] args) {
			
		
		    //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		    Scanner scan = new Scanner(System.in);
		    String lan1 = scan.next();
		    String lan2 = scan.next();
		    
		    System.out.println("I will learn \"" +lan1+ "\" and \"" +lan2+ "\" at CybertekSchool.");
		    //WRITE YOUR CODE BELOW THIS LINE:
		        
		 
		 
		    int hour;
		    int minute;
		    int second; 
		    int amOrPm;
		    
		    
		    
	   //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES 
		   
            hour   = scan.nextInt();
		    minute = scan.nextInt();
		    second = scan.nextInt();
		    amOrPm = scan.nextInt();
		    //#############################
		    
		     //2. WRITE YOUR CODE HERE:
		     
		     System.out.println(hour+":"+minute+":"+second+ " " +amOrPm);
		     
		     
		     int result;
		     result = 3 * 7 % 3 - 4 - 6;
		    System.out.println("result is " + result);
		    
  }
 }
