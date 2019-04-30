import java.util.Scanner;
public class Profits {

	 public static String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	   if(buyPrice<sellPrice){
	     return "profit";
	   }else if(buyPrice>sellPrice){
	     return "loss";
	   }else{
	     return "no loss";
	   }
	   
	   
	  }
	  public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
			    int n = scan.nextInt();
			    int num=scan.nextInt();
	        System.out.println( c_profits(n, num));
	  }
	}