package officeHours2;

public class PetSmart {
public static void main(String[] args) {
	Cat murodilsCat= new Cat();
	murodilsCat.breed="persian cat";
	murodilsCat.name="Bars";
	
	sellCat(murodilsCat);
	
	OnlineCat murufdImaginaryCat=new OnlineCat();
	murufdImaginaryCat.breed="lebanese";
	murufdImaginaryCat.name="Tars";
	murufdImaginaryCat.location="Arlington, TX";
	
	sellCatOnline(murufdImaginaryCat);
	murodilsCat.makeSomeNoice();
	murufdImaginaryCat.makeSomeNoice();
	
}
	public static void sellCat(Cat cat) {
		System.out.println("selling "+cat.breed);
		System.out.println("its name is "+ cat.name);
	}
	public static void sellCatOnline(OnlineCat cat) {
		System.out.println("selling "+cat.breed);
		System.out.println("its name is "+ cat.name);
		System.out.println("its location is "+ cat.location);
	
	}
}
