package Day53_Inheritance06;

public class Capital extends City{
	
	private long population;	
	public int count=1;
	
	public Capital(int id, String name, long population) {
		super(id, name);
		this.population=population;
		
	}
	
	public static void buildARoad() {
		System.out.println("Capitals- building a road");
	}
	public void displayCount() {
		System.out.println("City count: "+super.count);
		System.out.println("Capital count:" +count);
	}
	@Override
	public String toString() {
		return super.toString()+" population: "+population+ " countCap:"+count;
	}
	public void setPopulation(long population) {
		this.population=population;
	}
	public long getPopulation() {
		return population;
	}
}
