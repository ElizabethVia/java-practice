
public class MovieApp {
public static void main(String[] args) {
	Movie movie1=new Movie("The Avengers","Joss Whendon","PG-13");
	Movie movie2=new Movie("Step Brothers","Adam McKay","R");
	
	movie1.setRating("PG-13");
	System.out.println(movie1.getRating());
	
	System.out.println(movie1.getDirector());
	System.out.println(movie1.getTitle());
	System.out.println(movie1);
	
	System.out.println(movie2.getDirector());
	System.out.println(movie2.getTitle());
	System.out.println(movie2);
}
}
