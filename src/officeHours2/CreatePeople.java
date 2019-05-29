package officeHours2;

public class CreatePeople {

	public static void main(String[] args) {
		//when we constructors certain actions are 
		//being taken the process of creating
		//the object
		Person john=new Person("01/01/2000");//after we put the birthday we can not change it 
		System.out.println(john.getBirthday());
		
		john.setFirstName("John");//we can still change name 
		john.setLastName("Doe");//or lastname
		
		
		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());
		
		john.setLastName("Smith");
		
		System.out.println(john.getBirthday());
		
	}

}
