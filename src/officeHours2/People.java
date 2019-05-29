package officeHours2;

public class People {
	String hardToGet="Nursultan";
	static String easyToGet="Muhtar";
	
	public void sayMyName() {
		System.out.println(hardToGet);
		//non static method can call static variable
		System.out.println(easyToGet);
	}
	public static void whatMyName() {
		System.out.println(easyToGet);
		//next line will throw error because
		//static method cannot call non static
		//System.out.println(hardToGet); it won't work
	}
}
