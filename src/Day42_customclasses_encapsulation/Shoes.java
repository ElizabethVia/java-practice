package Day42_customclasses_encapsulation;

public class Shoes {
	String brand;
	double size;
	
	public void setShoeData(String newBrand, double nSize) {
		brand=newBrand;
		size=nSize;
		
	}//read only
	public String getShoesData() {
		
		return brand + " | "+ size;
	}
}
