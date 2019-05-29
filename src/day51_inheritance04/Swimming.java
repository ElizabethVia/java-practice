package day51_inheritance04;

public class Swimming extends Excercise{
	@Override
	public int Perform(int minutes) {
		System.out.println( "Swimming");
		
		return minutes*11;
}

}
