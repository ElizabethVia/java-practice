package JavaDay_36WrapperClasses_arraylistintro;

public class WrapperClasses {

	public static void main(String[] args) {
		int n1=10;
		Integer n2=new Integer(20);
		System.out.println(n1);//10
		System.out.println(n2);//20
		
		double d1=44.5;
		Double d2=new Double(123.1);
		Double d3=new Double("5.2");
		System.out.println(d1);//44.5
		System.out.println(d2);//123.1
		System.out.println(d3);//5.2
	    System.out.println(d1+d2+d3);//172.79999999999998
	    
	    char ch1='a';
	    Character ch2=new Character('b');
	    System.out.println(ch1);
	    System.out.println(ch2);
	    
	    byte b1=100;
	    Byte b2=new Byte((byte)10);
	    byte b3= new Byte("-55");
	    System.out.println(b1);
	    System.out.println(b2);
	    System.out.println(b3);
	    System.out.println(b1+b2+b3);
	    
	    Integer num1=Integer.valueOf(1234);
	    Integer num2=Integer.valueOf("567");
	    Boolean bool1=Boolean.valueOf(true);
	    Boolean bool2=Boolean.valueOf("false");
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(bool1);
	    System.out.println(bool2);
	    
	    Integer i=1234;//new Integer(1234);
		

	}

}
