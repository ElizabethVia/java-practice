package day46_static_keyword;

public class Vehicle {

	String type;//instance, every object has its own type
	static int numberOfVehicles;//shared, one central value
	//static can only call another static
	public static void vehicleInfo() {
		//System.out.println("type: "+type);< -- will not compile. type is  non static
		System.out.println("numberOfVehicles: "+numberOfVehicles);
		int count=getNumberOfVehicles();
		String make="kia";
		make=make.toUpperCase();
		System.out.println("make: "+make);
		//System.out.println(toString()); will not work because is non static
		//can not call non-static methods
		//Vehicle vh= new Vehicle();
		//vh.toString();
	}
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	public String toString() {
		return "Vehicle type: "+type + "| count: "+numberOfVehicles;
	} 
}
