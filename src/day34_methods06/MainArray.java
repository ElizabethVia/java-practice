package day34_methods06;
import java.util.*;
public class MainArray {

	public static void main(String[] args) {
	System.out.println(Arrays.toString(CountArray.getArray()));	
//store value into array
	int [] nums=CountArray.getArray();
	System.out.println(Arrays.toString(nums));
	
	System.out.println(Arrays.toString(CountArray.getRamdomArray(20)));	
	int[] randomNums=CountArray.getRamdomArray(3);
	System.out.println(Arrays.toString(randomNums));
	}
	
}
