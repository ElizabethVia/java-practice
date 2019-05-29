package day52_Inheritance05;

public class Equalsmethod {

	public static void main(String[] args) {
		Computer comp1=new Computer("iMac","silver");
		Computer comp2=new Computer("iMac","silver");
		Computer comp3= comp2;//point to same object
		
		System.out.println(comp1==comp2);//false
		System.out.println(comp1.equals(comp2));//

		System.out.println(comp3==comp2);//
		System.out.println(comp3.equals(comp2));
		String str1="java";
		String str2=new String("java");
		//cheking only if str1 and str2 point to same object 
		System.out.println(str1==str2);//false 
		//cheking value in the str1 and str2
		//compares values,not reference
		System.out.println(str1.equals(str2));//true
		
	}

}
