package Java_Day_26_Array04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {

	public static void main(String[] args) {
		String[]names= {"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		//print number of names in the array
		System.out.println("Total names: "+names.length);
		//print all names in single line
		System.out.println(Arrays.toString(names));
		//print in column format.
		//two names in each line
		//James, Mary
		
		for(int i=0;i<names.length;i+=2) {
		System.out.println(names[i]+", "+names[i+1]);	
			
		}//print all male names line separeted by coma
		System.out.println("MALE NAMES:");
			for(int i=0;i<names.length;i+=2) {
				System.out.print(names[i+1]+", ");
			}
			//print female names in single line separeted by coma
			System.out.println("\nFEMALE NAMES");
			for(int i=0;i<names.length;i++) {
				if(i%2!=0) {
					if(i==names.length-1) {//this is to take the last coma, out,print with out the coma
						System.out.println(names[i]);
					}else {
				System.out.print(names[i]+", ");
			}
	    }
	}
			//print random name from this array
			//use random class
			System.out.println("\nRandom Name:");
			Random random=new Random();
			int r=random.nextInt(names.length);
			System.out.println("Random Name: "+names[r]);
			
			//print all names that are up to 4 characters,in uppercase, in same line
			for(String name:names) {
				if (name.length()<=4) {
					System.out.print(name.toUpperCase()+", ");
				}
			}
			//
			System.out.println("\nNames Length Sort");
			String namesUpto4="";
			String names5to6="";
			String names7ormore="";
			for(String name:names)
			if(name.length()<=4) {
				namesUpto4+=name+", ";
			}else if(name.length()==5 || name.length()==6) {
				names5to6+=name +", ";
			}else {
				names7ormore+=name+", ";
			}
			System.out.println("namesUpto4: "+ namesUpto4.substring(0, namesUpto4.length()-2));
			System.out.println("names5to6: "+ names5to6);
			System.out.println("names7ormore: "+names7ormore);
			//swap seats 
			System.out.println(Arrays.toString(names));
			for(int i=0;i<names.length;i+=2) {
				String temp=names[i];
				names[i]=names[i+1];
				names[i+1]=temp;
}
			System.out.println(Arrays.toString(names));
			//[Mary, James,			
				
			
			
					
			/*	
			String str1="first word";
			String str2="second word";
			String temp=str1;
			str1=str2;
			str2=temp;
			*/
			
			
	}

}
