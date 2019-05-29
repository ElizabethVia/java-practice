
public class Assignment201_2 {

	public static void main(String[] args) {
		
		  
		Assignment201_1 person= new Assignment201_1();
		   System.out.println(person.getFirstName());
		System.out.println(person.getLastName());  
		System.out.println(person.getAge());       
		System.out.println(person.toString());    

		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString() );

		Assignment201_1 person2 = new Assignment201_1("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName()); 
		System.out.println(person2.getLastName()); 
		System.out.println(person2.getAge());      
		System.out.println(person2.toString());    
		  }
		
	}
