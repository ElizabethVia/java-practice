
public class LocalStudent extends Student{

	int seatID;
	
	public LocalStudent() {
		//first line of constructor is a implicit call to super class no arg constructor
		//super();
		super("SOMENAME",123);//once you call another constructor like this , compiler
		//will not insert super() in first line
		System.out.println("no arg from LocalStudent");
	}
	
}
