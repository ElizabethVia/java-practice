package day04_primitives_operators;

public class CitiesTogether {
	public static void main(String[]args) { 
		//assign values:
		//Tashkent
		//Kyiv
		//Moscow
		
		//print
		//from Tahkent to Kyiv is $500
		//from Moscow to Tashkent is $550
		// i have been to Tahkent, Moscow, Kyiv.
		
		String city1 = "Tashkent";
		String city2= "Kyiv";
		String city3 = "Moscow";
		//fromTahkrt to Kyin is $500
		System.out.println("From"+city1+" to "+city2 +" is $500");
		System.out.println("From"+city3+" to "+city1 +" is $550");
		System.out.println("I have been to "+city1+", "+city2 +", "+ city3 +".");
		 String app = "Slack";
		 System.out.println("We use "+app+" for messaging with Classmates");
			
		 app ="Skype" + " Slack";
		 //we use Slack for messaging with Classmates
		 System.out.println("We use "+app+" for messaging with Classmates");
		 
		 String houseItems = "sofa," + "TV," + "table";
		 
		 System.out.println(" We have " +houseItems+ " in our home");
	}	 

}
