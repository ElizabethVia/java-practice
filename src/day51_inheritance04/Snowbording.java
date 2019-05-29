package day51_inheritance04;

public class Snowbording extends Excercise{
	public int perform(int minutes) {
		int cal=super.Perform(10);//call super class vercion of performes
		System.out.println("Snowboarding for "+ minutes +" minutes");
		return minutes*7+ cal;
	}

}
