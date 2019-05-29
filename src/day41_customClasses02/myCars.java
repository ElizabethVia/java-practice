package day41_customClasses02;

public class myCars {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.make="Ford";
		car1.model="Fiesta";
		car1.color="Grey";
		car1.currentSpeed=55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(30);
		car1.drive();
		System.out.println("before : "+ car1.currentSpeed);
		car1.accellerate(20);
		System.out.println("After "+ car1.currentSpeed);

		
		BMW bmw=new BMW();
		System.out.println(bmw.make);
		bmw.model="m3";
		bmw.showPrice();
		System.out.println("Car price: "+bmw.price);
		
		BMW bmw2=new BMW();
		bmw2.model="X3";
		bmw2.showPrice();// X3 is not available    Price: 0.0
	}

}
