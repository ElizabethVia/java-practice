
public class StringPractice {

	public static void main(String[] args) {
		String firstName=new String("anna");
		String country=new String();
		country="belize";
		System.out.println(country.toUpperCase());//BELIZE
		
	    country="Belize";
		System.out.println(country.toLowerCase());//belize
		
		
		System.out.println(country.startsWith("B"));//true
		System.out.println(country.endsWith("e"));//true
		
		System.out.println(country.charAt(0));//B
		System.out.println(country.indexOf("i"));//3
		System.out.println(country.substring(2,5));//liz
		System.out.println(country.substring(2));//lize
		
		
		
		

	}

}
