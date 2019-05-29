package day41_customClasses02;

public class Car {

	// public static void main(String[] args) {
	// **instance variable/attributes/properties/data:
	// make
	// model
	// currentSpeed
	// color
	String make;
	String model;
	int currentSpeed;
	String color;

	// }
	/*
	 * 	**methods
	printCarInfo()
		"car make[make], model[model], color[color], currentSpeed[currentSpeed]"

    showCurrentSpeed
   		return: void
   		param: int speedLimit
   		"Ford is driving at currentSpeed mph, following speed limit - 55"
   		"Ford is driving at currentSpeed mph, over the speed limit - 55"
	 */
	public void printCarInfo() {
		String info="Can make [" + make + "], model [" + model + "],"
				              + "color["+color+"], currentSpeed[" + currentSpeed + "]";
		System.out.println(info);
	}

	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}
	public void drive() {
		System.out.println(make+" "+model+ " is driving...");
	}
	//accellerat
	//return void
	//params: int mph
	//increse current speed by value of mph
	//accellerate(10);
	//55=>65
	public void accellerate(int mph) {
		currentSpeed+=mph;
	}
		
	}


