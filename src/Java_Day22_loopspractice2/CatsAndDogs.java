package Java_Day22_loopspractice2;

public class CatsAndDogs {

	public static void main(String[] args) {
		
		  String str = "mycatyourcat";
	        //count how many "cat" s
	        int cats = 0;
	        for(int i = 0; i <= str.length()-3; i++) {
	            System.out.println(str.substring(i, i+3));
	            if(str.substring(i, i+3).equals("cat") ) {
	                cats++;
	            }
	        }
	        
	        System.out.println("Cats: " + cats);
	        
	        String str1="mydogyourdog";
	        int dog=0;
	        		for(int i=0;i<=str1.length()-3;i++) {
	        			System.out.println(str1.substring(i,i+3));
	        			if(str1.substring(i,i+3).equals("dog")) {
	        				dog++;
	        			}
	        		}
	        		System.out.println("dogs: "+dog);
	        		
	        		String str2="mybirdyourbird";
	        		int bird=0;
	        		for(int i=0;i<=str2.length()-4;i++) {
	        			System.out.println(str2.substring(i,i+4));
	        			if(str2.substring(i,i+4).contentEquals("bird")) {
	        				bird++;
	        			}
	        		}
	        		System.out.println("Birds: "+bird);
	        		
	        		String str3="myfloweryourflower";
	        		int flower=0;
	        		for(int i=0;i<str3.length()-6;i++) {
	        			System.out.println(str3.substring(i,i+6));
	        			if(str3.substring(i,i+6).equals("flower")) {
	        			flower++;
	        		}
	        		}  
	        		System.out.println("Flowers: "+flower);
	}
}