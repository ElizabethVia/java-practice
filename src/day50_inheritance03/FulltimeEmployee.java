package day50_inheritance03;

public class FulltimeEmployee extends Employee {
@Override//check if method is really overriden
	public void  CalculatePay(int hours, double rate){
		double total=(hours*rate)*1.05;
		System.out.println("FullTimeEmployee total pay: "+ total);
	}
	
}
