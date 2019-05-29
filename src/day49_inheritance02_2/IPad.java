package day49_inheritance02_2;
import day49_inheritance_day2.Device;
//IPad is-A Device, IPad is a subclass in a different package
public class IPad extends Device{
	public void readEbook(String title) {
		System.out.println("Reading a book "+ title+ " using "+brand+" tablet");
		System.out.println("Model - "+ model);
	//	System.out.println("Price: "+price);not inherited, not visible
		//System.out.println("made in "+ country);not visible
	}
}
