import java.util.Scanner;

public class Assignment146 {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			
				//your code here
				    
					String []person=info.split(",");
			      ////  
					//info+=name+lastName+age;
				for(String val:person) {
					
					System.out.println("person name:"+val);
				}
				
			
				 
				 
			
			}//end person
		  
		}