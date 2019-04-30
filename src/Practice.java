import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   int candy,gumball,aftercandy,coupons;
		   System.out.println("Enter number of coupons:");
			coupons=scan.nextInt();
			  candy=coupons/10;
			  aftercandy=(coupons-(candy*10));
			  gumball=aftercandy/3;
			  if(coupons<=2){
			   System.out.println("Not enough coupons");
			   
			   }else if (candy>=0){
			     System.out.println("Number of Candies: "+candy);
			     
			   }
			   if((aftercandy>=3)&& (aftercandy<=9)){
			     System.out.println("Number of Gumballs: "+gumball);
			     
			   }else{
			     aftercandy=0;
			   }
			   
			   
			   
			   
			   
			   
			   double premium = 0;
				int accidentsAmount = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				
				System.out.println("Welcome to the CountyFarm car insurance!");
		    //WRITE YOUR CODE HERE
		    System.out.println("Enter your name");
		    name=scan.nextLine();
		    System.out.println("Do you have a US driver license?");
		    
		    String notLicense="No";
		    notLicense=scan.next();
		    
		    switch (notLicense){
		    case "no":
		     System.out.println("Invalid data!");
		      break;
		      default:
		     } 
		      int zipCode;
		      System.out.println("Enter zip code");
		      zipCode=scan.nextInt();
		      if((zipCode==20102) || (zipCode==20740)){
		       System.out.println(premium+60);
		      }else if
		      
		        ((zipCode==22102) || (zipCode==22103)){
		      
		           System.out.println(premium+30);
		        }else{
		           System.out.println(premium+50);
		        }
			   
		  }
	
	
		
	}




