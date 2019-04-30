import java.util.Scanner;
public class MethodsIsEven {
	 public static void main(String[] args){
		   Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    System.out.println(isEven(num));
		  
		}
		  public static boolean isEven(int n){
		 // for(int i=0;i<=n;i++) {
			  
		 // }
		    if(n % 2==0){
		      return true;
		    }else{
		      return false;
		    }
		  }
		
		  }