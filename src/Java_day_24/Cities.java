package Java_day_24;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]cities= {"Washington D.C.","kiev","Annandale","Moscow","Istanbul","Baku","Miami","Silver Sprint","McLean"};
		System.out.println(cities.length);
		//Task print all cities that start with M
		
		for(int i=0;i<cities.length;i++) {
			if(cities[i].startsWith("M")){
			System.out.println(cities[i]);	
				/*
				 * Moscow Miami McLean
				 */
			}
		}
		//same thing with for each loop
		for(String city:cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}
	}

}
