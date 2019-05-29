package day51_inheritance04;

public class Yoga extends Excercise{
	@Override
	public int Perform(int minutes) {
		System.out.println( "Yoga");
		
		return minutes*5;
}

}
