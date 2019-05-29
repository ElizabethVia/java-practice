package Day42_customclasses_encapsulation;
import java.util.*;
public class Burger7 {

	public static void main(String[] args) {
		
		Burger burger1= new Burger();
		burger1.name="COWBOY";
		String[] ings= {"onion crips","american cheese","pickels",
				"lettuce", "b7 sauce"};
		burger1.ingridients=ings;
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingridients));
		//COWBOY
		//[onion crips, american cheese, pickels, lettuce, b7 sauce]
		System.out.println(burger1.ingridients[0]);//onion crips
		//print all the ingridients using for each loop
		for(String ing:burger1.ingridients) {
			System.out.println(ing);
			
			
		}
		


	}

}
