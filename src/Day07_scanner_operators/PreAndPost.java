package Day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		int num =10;
	    int num2 = num++;//it will declared it before adding
	    System.out.println("num: "+ num);
	    System.out.println("num2: "+ num2);
	    
	    int n= 20;
	    int n2 = ++n;//it will add first before declared to n2
	    System.out.println("n: "+ n);
	    System.out.println("n2: "+ n2);
	    
	    int i=10;
	    i++;
	    ++i;
	    System.out.println(i);
	    
	    int bananas=6;
	    int pears = bananas++;
	    int apples = ++bananas;
	   System.out.println("bananas: "+bananas);
	   System.out.println("pears: "+ pears);
	   System.out.println("apples: "+ apples);
	   int friends = 10;
	   System.out.println(++friends);
	   System.out.println(friends);
	   
	   int p1 =10;
	   int sum = p1++ + 5; //primero se declara 10 y se suma +5
	   //p1 +5 and assign to sum
	   //p1=p+1
	   
	   System.out.println("sum: "+ sum);
	   System.out.println("p1: "+ p1);
	   
	   int batteries = 8;
	   int oldBatteries=5;
	   				//14  //8 +   6
	   int totalBatteries= batteries++ + ++oldBatteries;
	   
	   
	   System.out.println("batteries: " + batteries);//9
	   System.out.println("oldBatteires: "+ oldBatteries);//6
	   System.out.println("totalBatteries: "+ totalBatteries);//14
	   
	   
	   
			 
	   
	    
	    
	    
	  
	    
	}

}
