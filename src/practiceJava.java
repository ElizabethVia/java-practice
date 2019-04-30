
public class practiceJava {
public static void main(String[] args) {
	
	String webside= "www.codingbat.com";
	System.out.println(webside);
	System.out.println(webside.contains("."));
	System.out.println(webside.indexOf(".",4));//to find the second .
	System.out.println(webside.toUpperCase().endsWith("COM"));
	
	String b= "  I have 23 apples in my basket";
	b=b.trim();
	b=b.replace("I have"," ").replace("apples in my basket","");
    int number=Integer.parseInt(b);
	System.out.println(number);
	
	String c="straberries";
	System.out.println(b.replace("apples",c));
	
	System.out.println(b.charAt(b.length()-1));
	String d=" i need money";
	d=d.trim();
	System.out.println(d.lastIndexOf(""));
	System.out.println(d.length()-1);
	System.out.println(d.substring(6,18));
	
	int start=(d.lastIndexOf(" ")-1);
	int end=d.length();
	 System.out.println();
	
	 
	 
	 
	
}
}
