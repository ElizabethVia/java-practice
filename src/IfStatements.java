
public class IfStatements {

	public static void main(String[] args) {
		
		int TypeSelection=2;
		int toySelection=2;
		double price;
		String toy;
		if(TypeSelection==1) {
			System.out.println("New toys: 1- cars. 2-balls");
			if (toySelection==1) {
				price=8.0;
				toy="cars";		
			}else if (toySelection==2) {
				price=5.0;
				toy="balls";
			}else {
				System.out.println("Invalid Toy selection!");
				
			}
		}
	}

}
