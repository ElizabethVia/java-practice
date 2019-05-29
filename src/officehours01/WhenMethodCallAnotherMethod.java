package officehours01;

import java.text.DecimalFormat;

public class WhenMethodCallAnotherMethod {

	public static void main(String[] args) {
		System.out.println(milesToKms(10));
		System.out.println(milesToKms(70));
		double km=milesToKms(45);
		System.out.println(km);
		System.out.println(multiply(4,8));
		double littersValue=gallonsToLitters(15);
		
		System.out.println(littersValue);//56.775000000000006
		//format to 2 decimal points only
		DecimalFormat dm=new DecimalFormat("#.##");
		System.out.println(dm.format(littersValue));//56.78
		//get rid of decimal points value
		System.out.println(Math.floor(littersValue));//56.0
		
		}
		public static double milesToKms(double miles) {
			//double kmValue=miles*1.609;
			double kmValue=multiply(miles,1.609);
			return kmValue;
		
		
		}
		
		
		public static double multiply(double n1, double n2)
		{
			return n1*n2;
		}
		//multiply the volume value by 3.785
		public static double gallonsToLitters(double gallons) {
			double litters=multiply(gallons,3.785);
			return litters;
		}
	}