import java.util.Scanner;

public class FreeBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int freeBooks = 0;
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    
	   
	    	 
	     if(nbooksPurchased<5 ||nbooksPurchased>8) {
            freeBooks+=1;
            
	    }
	    
	    
	    
	   
	}

}
