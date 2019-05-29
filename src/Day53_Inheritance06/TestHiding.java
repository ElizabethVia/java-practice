package Day53_Inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		City city=  new City(354, "London");
		Capital cap=new Capital(433,"Paris",532324256L);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		System.out.println(city.toString());
		System.out.println(cap.toString());
		cap.displayCount();
		
		//call static methods
		
		city.buildARoad();
		cap.buildARoad();
		City.buildARoad();//static way
		Capital.buildARoad();//static way
		
		City city2= new City(3334,"fairfax");
		Capital cap2=new Capital(6544,"Richmond",545214587L);
		
		city2.LetsBuildARoad();//City
		cap2.LetsBuildARoad();//City
		
	}

}
