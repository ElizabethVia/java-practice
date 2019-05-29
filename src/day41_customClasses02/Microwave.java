package day41_customClasses02;

public class Microwave {

	String brand;
	boolean isOn;//false. true => on, false=>off
	
	public void turnOn() {
		if(isOn==true) {
		System.out.println(brand +"microwave is already on");	
		}else {
			System.out.println("Turning on "+brand+  " microwave");
			isOn=true;
		}
	}
	public void turnOff() {
		if(isOn==false) {//already Off
			System.out.println(brand +"microwave is already off");	
		}else {
			System.out.println("Turning off "+brand+  " microwave");
			isOn=false;
		}
	}
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating "+food);
		}else {
			System.out.println("Microwave is off, cannot heat "+food);
		}
	}
}
