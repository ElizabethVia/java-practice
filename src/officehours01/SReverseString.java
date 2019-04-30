package officehours01;

public class SReverseString {

	public static void main(String[] args) {
		String today="tuesday";
		//print tues 
		//print day
		String t=today.substring(0,4);
		String d=today.substring(4);//day
		
		System.out.println(t +"\n" +d);
		
		System.out.println(today.substring(2,3));//e
		System.out.println(today.substring(4,5));//d
		System.out.println(today.charAt(4));//d
		
		for(int i=0;i<today.length();i++) {
			System.out.println(today.charAt(i));
			System.out.println(today.substring(i,i+1));//second set of letters
		}
		//reverse
		for(int j=today.length()-1;j>=0;j--) {
			System.out.print(today.charAt(j)+" ");//y a d s e u t 
			
		}
		System.out.println();
		for(int m=today.length()-1;m>=0;m--) {
			System.out.print(today.substring(m,m+1)+" ");//y a d s e u t 
		}
		System.out.println();
		//assign to variable 
		String word="wednesday";
		String reverse="";
		for(int r=word.length()-1;r>=0;r--){
			//System.out.print(word.charAt(r));
			//read character and add to reverse
			reverse+=word.charAt(r);
		}
		System.out.println(reverse);//yadsendew 
		//check if it palindorome
		//civic
		//mom
		//dad
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
