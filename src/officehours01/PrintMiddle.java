package officehours01;

import java.util.Scanner;

public class PrintMiddle {

	public static void main(String[] args) {
		
		String word="javaclass";
		//print middle char
		System.out.println("Middle one: "+word.charAt(word.length()/2));//c
		//    0123567
		word="javadays";
		//print middle two
		String middle2=word.charAt(word.length()/2-1)+""+
		               word.charAt(word.length()/2);
		System.out.println("Middle 2:"+middle2);//Middle 2:ad
		
		String middletwo=word.substring(3,5);
		System.out.println("MiddleTwo:"+middletwo);//MiddleTwo:ad
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter word,i will give you middle one(s)");
		String strInput=scan.next();
		String m="";//april-- 5/2-2
		if(strInput.length()%2==0) {//even count of chars
			m=strInput.substring(strInput.length()/2-1, strInput.length()/2+1);
		}else {
			//april      5/2---2                                  2+1--3
			m=strInput.substring(strInput.length()/2, strInput.length()/2+1);
		}
           System.out.println("M:"+m);
	}

}
