package day50_inheritance03;

public class Company {
public static void main(String[] args) {
	 Employee emp=new Employee(); 
		 FulltimeEmployee ft= new  FulltimeEmployee();
		 Contractor ct = new Contractor();
		 
		 emp.CalculatePay(40,40);
		 ft.CalculatePay(40,45);
		 ct.CalculatePay(40,55);
		 
	 	 
}
}
