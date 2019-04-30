package Java_day_23;

public class ArrayWithString {

	public static void main(String[] args) {
		
		String[]names=new String[5];
		String[] names2= {"Shaun","Roman", "Vlad","Burak","Maria"};
		System.out.println(names2[4]);
		System.out.println("numbeer of items: "+names2.length);
		String[]countries= {};
		//array has fixed size
		//countries[0]="USA";//out of bounce array because is 0
		//String name=null;//0 vacio
		String[] fruits=new String[] {"apple","orange"};
		//for each loop stads for collections of data
		//we need specify data type,variable name: our collection of data
		//for each loop
		//or enhanced loop
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		
		
	}

}
