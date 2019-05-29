package officehours01;

public class WraperClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		Integer num2=new Integer(10);
		Integer num3=new Integer(10);
		System.out.println(num==num2);//true
		//intValue() will return the catual value
		System.out.println(num2.intValue()==num3.intValue());//true
		//contains the same int value as this object
		System.out.println(num2.equals(num3));//true
		num2=num3;
		System.out.println(num2==num3);//true checks if objects are the same
		//how to convert text into number
		String age="18";
		//first way it return actual int primitive
		int agenum=Integer.parseInt(age);
		//another way it return object of Integer class
		//but because of auto unboxing, we don't see any difference
		int agenum2=Integer.valueOf(age);
		if(agenum>21) {
        System.out.println("you are fine");
		}else {
			System.out.println("Underaged!");
		}
		Integer n=8;
		String text="Wind: 5 mph";
		
		//lets create if statement in order to determineif wind is safe
		//if speed is more than : You are in danger!
		//Otherwise, print: "You are safe!"
		//step 1 get the text with a speed
		String speed=text.substring(text.indexOf(":")+2, text.lastIndexOf(" "));
		//
		System.out.println("Speed: "+speed);
		//step2 we need to convert a string into a number
		int convertspeed=Integer.parseInt(speed);
		//step3 condition that will determine if wind speed is safe
		if(convertspeed <= 30) {
			System.out.println("You are safe!");
		}else {
			System.out.println("You are in danger");
		}
		
		int maxForint=Integer.MAX_VALUE;
		int minForint=Integer.MIN_VALUE;
		System.out.println(minForint+" : "+maxForint);//-2147483648 : 2147483647
		System.out.println(Integer.toBinaryString(5));//101
		
	}

}
