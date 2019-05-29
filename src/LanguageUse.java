
public class LanguageUse {

	public static void main(String[] args) {
		Language english= new Language("en","US",26);
		System.out.println("REGION "+english.getRegion());
		//change the region from US to UK
		english.setRegion("UK");
		
		System.out.println("REGION "+ english.getRegion());
		//MAKE FIELD NUMBER OF LETTER IMMUTABLE-- we can coment out the setterRegion
		
		//public -->everywhere
		//protected-->same package + in sub classes in other packages
		//default-->only in same package-->package private
		//private-->same class
		
	}

}
