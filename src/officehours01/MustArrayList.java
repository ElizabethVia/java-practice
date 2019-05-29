package officehours01;
import java.util.*;
public class MustArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in) ;
			List<String> input=new ArrayList<>();
			List<String>masked=new ArrayList<>();
			List<Integer>lengthList=new ArrayList<>();
			String answer="";
			do {
			System.out.println("Enter word");
			String word=scan.next();//word
			input.add(word);//word
			masked.add(maskWord(word));
			lengthList.add(word.length());
			System.out.println("You want to add another word?");
			answer=scan.next();
				}while(answer.equalsIgnoreCase("y"));
			
			System.out.println(input.toString());
			System.out.println(masked.toString());
			System.out.println(lengthList.toString());
			//System.out.println(maskWord(word));  //*****
			/*
			 * [apples, java, coffee, hello, happy, sad, ivan]
               [******, ****, ******, *****, *****, ***, ****]
               [6, 4, 6, 5, 5, 3, 4]
			 */
		
		}
	/* maskWord
	 * return String
	 * params String word
	 * it will convert each character into * in the word and return 
	 *  length of word and * must match
	 */
	public static String maskWord(String word) {
		String stars="";
		for(int i=0;i<word.length();i++) {
			stars+="*";
		}
		return stars;
	}
	}


