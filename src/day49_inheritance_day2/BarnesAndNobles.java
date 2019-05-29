package day49_inheritance_day2;

public class BarnesAndNobles {

	public static void main(String[] args) {
		EBook ebook=new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAutor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		//Reading Introduction to Java by Savitch at page 10
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAutor());
		System.out.println(ebook.getPages());
		ebook.readEbook(10);
		ebook.readEbook(621);
//Reading Introduction to Java by Savitch at page 621
		
		AudioBook abook=new AudioBook();
		abook.setTitle("OCA preparation");
		abook.setAutor("Jeane");
		abook.setNarrator("Marufjon");
		abook.listen();
		//Listening to OCA preparation by Jeane and narrated by Marufjon
		
		PaperBack pb= new PaperBack();
		pb.setAutor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		System.out.println(pb.toString());
		//Malcom Gladwell | Malcom Gladwell | 20.0 | Biography | 304

	}

}
