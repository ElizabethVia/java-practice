package day46_static_keyword;

public class Restaurant {

	public static void main(String[] args) {


		Dinner Mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner Dad=new Dinner();
		
		System.out.println("Total slice: "+Dinner.pizzaSlices);//Total slice: 8
		
		Dad.takeASlice();//7
		kid.takeASlice();//6
		Mom.takeASlice();//5
		System.out.println("Total slice: "+Dinner.pizzaSlices);//Total slice: 5
		System.out.println("Total slice: "+Dad.pizzaSlices);//Total slice: 5
		kid.takeASlice(3);//2
		Dad.takeASlice(2);//0
		//Mom.takeASlice();
		System.out.println("Total Slices: "+Mom.pizzaSlices);//Total Slices: 0
		System.out.println("Total slice: "+Dinner.pizzaSlices);//Total slice: 0
		
		

	}

}
