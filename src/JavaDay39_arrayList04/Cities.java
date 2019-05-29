package JavaDay39_arrayList04;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        //1- for each loop print each city in same line separated by|
        for(String city:cities) {
        	System.out.print(city+" | ");
        }
        //for loop print each city in same line separated by |
        System.out.println();
        for(int i=0;i<cities.size();i++) {
        	System.out.print(cities.get(i)+" | ");
        }
       // toString print each city all uppercase
        System.out.println();
        System.out.print(cities.toString().toUpperCase());
        //4-make each city all uppercase
        System.out.println();
        String paris =cities.get(0).toUpperCase();
        cities.set(0, paris);
        System.out.print(cities.get(0));
        cities.set(1, cities.get(1).toUpperCase());
        
        for(int j=0;j <cities.size();j++){
        	String city=cities.get(j).toUpperCase();
        	cities.set(j, city);
        	}
        System.out.println();
        	System.out.println(cities.toString());
        //Find the longest and shortest city
        String longestCity="",shortestCity="";
        
        for(String city: cities) {
        	if(city.length()> longestCity.length()){
        		longestCity=city;
        	}
        }
        shortestCity=cities.get(0);
        for(String city : cities) {
        	if(city.length()<shortestCity.length()) {
        		shortestCity=city;
        	}
        }
        System.out.println("longestCity: "+longestCity);//longestCity: WASHINGTON D.C.
        System.out.println("shortestCity: "+shortestCity);//shortestCity: LIMA
        
        ArrayList<String>citiesMoreThan6=new ArrayList<>();
        //assign all cities that have more than 6 chars to this arraylist
        
        for(String ct:cities) {
        	if(ct.length()>6) {
        		citiesMoreThan6.add(ct);
        	}
        }
        System.out.println(citiesMoreThan6);
        //[NEW YORK, PITTSBURGH, ISTANBUL, WASHINGTON D.C., AMSTERDAM, SINGAPORE, TORONTO]

	}

}
