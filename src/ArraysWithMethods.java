import java.util.Arrays;

public class ArraysWithMethods {
	public static int[] populate(int[] r) 
	{
	 int count=0;
	  for(int i=0;i<r.length;i++){
	 count+=r[i];
	 }
	 return count;
	}
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[3]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));

	}
}