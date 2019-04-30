package day27_arrays05;
import java.util.*;
public class CopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] d1= {2.3, 4.5, 12.4};
		double[] d2=d1;
		System.out.println(Arrays.toString(d1));//[2.3, 4.5, 12.4]
		System.out.println(Arrays.toString(d2));//[2.3, 4.5, 12.4]
		             //change the value in index 0  
		d1[0]=1000.3;//[1000.3, 4.5, 12.4]
		System.out.println(Arrays.toString(d1));//[1000.3, 4.5, 12.4]
		System.out.println(Arrays.toString(d2));//[1000.3, 4.5, 12.4]
		
		d2[1]=4000.5;
		System.out.println(Arrays.toString(d1));//[1000.3, 4000.5, 12.4]
		System.out.println(Arrays.toString(d2));//[1000.3, 4000.5, 12.4]
		
		double[] d3=Arrays.copyOf(d2,d2.length);
		
		System.out.println("D3: "+Arrays.toString(d3));//D3: [1000.3, 4000.5, 12.4]
		d2[0]=1;
		System.out.println("D3: "+Arrays.toString(d3));//D3: [1000.3, 4000.5, 12.4]

	}

}
