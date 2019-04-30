import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() % 2 == 1) {
			if (word.length() >= 3) {
				int middle = word.length() / 2;
				System.out.println(word.charAt(middle));

			} else if (word.length() == 1) {
				System.out.println(word + word + word);
			}
		} else {
			if (word.length() >= 4) {
				int middle = word.length() / 2;
				System.out.println(word.charAt(middle - 1) + "" + word.charAt(middle));
			} else if (word.length() == 2) {
				System.out.println(word + word);
			}
		}

	
	 if((word.length() %2==1) && (word.length()>=5)){
	       int middle= word.length()/2;
	       System.out.println(word.charAt(middle-1)+""+ word.charAt(middle)+""+
	       word.charAt(middle+1));
	     }else{
	       System.out.println("invalid");
	     }
	 
	 int wordlength=word.length();
	    word="apple";
	    
	    if(word.length()<5){
	      System.out.println("too short!");
	    }else if(word.length()>5){
	      System.out.println("Too long!");
	    }else{
	       System.out.println(word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+
	       word.charAt(1)+""+word.charAt(0));
	    }
	 
	 
	  }
	}


