package officehours01;

public class Company {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.firstName="Pavel";
		employee1.printInfo();
		employee1.lastName="Babayan";
		Employee employee2=new Employee();
		employee2.firstName="Murad";
		//Employee[] it_department=new Employee[2];
		//type[] name=new type[size]
		//Employee[] it_department ={employee1,employee2};
		
		employee1.generateEmail();
		employee1.printEmail();
		employee1.setEmail("325455@");
		employee1.email="newmail@gmail.com";
		employee1.title="developer";
		employee1.setJObTitle("HR");
		employee1.printInfo();
		
		
	}

}
