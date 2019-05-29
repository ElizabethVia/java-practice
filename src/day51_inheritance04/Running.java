package day51_inheritance04;

public class Running extends Excercise{
	@Override
	public int Perform(int minutes) {
		System.out.println( "Running");
		
		return minutes*10;
}
}