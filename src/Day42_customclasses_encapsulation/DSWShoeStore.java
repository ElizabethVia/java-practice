package Day42_customclasses_encapsulation;

import java.util.ArrayList;

public class DSWShoeStore {

	public static void main(String[] args) {
		Shoes shoes1 = new Shoes();
		shoes1.setShoeData("ALDO", 6.5);
		System.out.println(shoes1.getShoesData());
		//Shoes[] shoesArray= new Shoes[3];
		
		Shoes shoes2=new Shoes();
		shoes2.setShoeData("Allen Admonds",7.5 );
			
		Shoes shoes3 = new Shoes();
		shoes3.setShoeData("BOSS HUGO BOSS", 9.0);
			
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		//to get just the brand of the shoe
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		//ArrayList of Shoes
		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		//print shoes data
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		//print shoes size
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		Shoes redShoes= myShoes.get(1);//Allen Edmonds | 7.5
        System.out.println(redShoes.getShoesData());
        // lets use for each loop and print data for each shoe
       for(Shoes shoes:myShoes) {
    	   System.out.println(shoes.getShoesData());
    	   
       }
       //print name of Shoes in the list that size is more than 7
       for(Shoes shoes: myShoes) {
    	   if(shoes.size>7.0) {
    		   System.out.println(shoes.brand);
    	   }
       }
       
	}
}	

