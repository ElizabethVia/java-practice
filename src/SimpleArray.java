import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int[] arr=new int [6];
		       //0 1 2 3 4 5 
		//arr= {1,2,3,56,6,5};
		
		int size=scan.nextInt();
		
		int[] arr1=new int[size];
		
		for(int i =0;i<size;i++) {
			arr1[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int num :arr1) {
			if(num %2 !=0) {
				num+=25;
			}
			System.out.println(num);
		}
		//int reverse=0;//5 3 6 5 4 5 8
	                   //[3, 6, 5, 4, 5]
		
		int[] newArr=new int[size];
		int j=0;
		for(int i=size-1;i>=0;i--) {
			newArr[j]=arr1[i];
			j++;
		//reverse+=newArr[i];	
		}
		System.out.println(Arrays.toString(newArr));
		*/
		//check if any string appears more than once in a array
		String [] strArr= {"java","selenium","cucumber","java","fun","fun"};
		//1 create a new string which will hold all string in our array
		String str="";
		for(int i=0;i<strArr.length;i++) {
			str+=strArr[i]+" ";
		}
		String word="";
	//	System.out.println(str);
		for(int i=0;i<strArr.length;i++) {
			if(str.indexOf(strArr[i])!=str.lastIndexOf(strArr[i])){
				word=strArr[i];
				System.out.println(word);
			}
		}
		
	}

}
