import java.util.Scanner;

public class Assigment147 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {
		      
		        arr[i]=inp.nextInt();
		    }
	
	
	for (int x : arr) {
		isPos(x);
	}
	
}

public static void isPos(int nums) {
	

	if (nums <= 0) {
		System.out.println("not positive");

	} else if (nums > 0) {
		System.out.println("positive");

	}
}
}


