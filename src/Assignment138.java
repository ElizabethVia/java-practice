import java.util.Arrays;
import java.util.Scanner;

public class Assignment138 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
	int day=0;
	 System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
		    day=1;
		    int[] temp=Arrays.copyOf(inhabitants,inhabitants.length);
		    while (true) {
		    	int numOfPeopleAlive=0;
		    	for(int i=0;i<inhabitants.length;i++) {
		    		//inhabitants[i] = input.nextInt();
		    		numOfPeopleAlive+=inhabitants[i];
		    	}
		    	if(numOfPeopleAlive==0) {
		    		break;
		    	}
		    	int tempFirst=inhabitants[0];
		    	int tempLast= inhabitants[inhabitants.length-1];
		    	if(inhabitants[1]==0) {
		    		tempFirst=tempFirst/2;
		    		
		    	}
		    	if(inhabitants[inhabitants.length-2]==0) {
		    		tempLast=tempLast /2;
		    	}
		    	for(int j=1 ; j<inhabitants.length-1;j++) {
		    		if(inhabitants[j-1]==0 || inhabitants[j+1]==0) {
		    			temp [j]=inhabitants[j]/2;
		    		}
		    	}
		    	for(int k=1;k<inhabitants.length-1;k++) {
		    		inhabitants[k]=temp[k];
		    	}	
		    	inhabitants[0]=tempFirst;
		    	inhabitants[inhabitants.length-1]=tempLast;
		    
		     System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
		    day++;
		    }
		   System.out.println("---- EXTINCT ----");
		  
		}
}