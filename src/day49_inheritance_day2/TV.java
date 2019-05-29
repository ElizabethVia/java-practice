package day49_inheritance_day2;
//TV is a child class in the same package
public class TV extends Device{
	public void watch() {
		
		System.out.println("Watching TV - "+brand+ " model: "+model);
		System.out.println("Price: "+price);
		//System.out.println("made in "+county);not visible
	}
}
