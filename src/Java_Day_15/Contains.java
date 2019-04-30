package Java_Day_15;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="test@gmail.com";
		System.out.println(email.contains("@"));//true
		
		String list="potatos,apples,timatoes,eggs,milk,bread,cereal, meat";
		//check if apples is in the shopping list
		//if true==> Apples are there!
		//if false== lets add apples now!
		if(list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.println("lets add apples now!");
		}
		                    //list.contains("eggs")
		boolean hasEggs =list.toLowerCase().contains("eggs");
		System.out.println("Contains eggs: "+ hasEggs);
		boolean hasCucumbers=list.contains("cucumbers");
		System.out.println("Contains cucumbers: "+ hasCucumbers);
		email="name@yahoo.com";
		if (email.contains("yahoo")) {
			System.out.println("It is yahoo email");
			
		}else if (email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if (email.contains("@hotmail.com")){
			System.out.println("Hotmail account");
		}	
			
		String etsyTitle= "Wooden spoon | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
			
		}else {
			System.out.println("Pipe is not detected");
			//String str=" | ";
			//System.out.println(etsyTitle.contains(str));
		}
		
		//Assign your name and check it contains "a" or "e" letter
		String name="juan";
		if(name.contains("e") || name.contains("a")) {
			System.out.println("'a' or 'e' is there");
		}else {
			System.out.println("'a' or 'e' is missing");
		}
		
		
		String lastname="Via";
		if(lastname.contains("i") || lastname.contains("a")){
			System.out.println("'i' or 'a' is there");
			
			
		}else {
			System.out.println("'i' or 'a' is not there");
		}
		
		
		String ingridients= "eggs,milk,flour,sugar";
		if(ingridients.contains("eggs")) {
			System.out.println("eggs are there");
			
		} else {
			System.out.println("eggs are not there");
		}
	}

}
