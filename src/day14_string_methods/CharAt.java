package day14_string_methods;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String word="computer";
   
   //print all character one by one
   System.out.println(word.charAt(0));
   System.out.println(word.charAt(1));
   System.out.println(word.charAt(2));
   System.out.println(word.charAt(3));
   System.out.println(word.charAt(4));
   System.out.println(word.charAt(5));
   System.out.println(word.charAt(6));
   System.out.println(word.charAt(7));
   
   //string word2 sentence and check if first character is 'j'
   String word2="java";
   if(word2.charAt(0)=='j') {
	   System.out.println("j is first char");
   }else {
	   System.out.println("j is not first char");
   }
  //string word3 that consist of 5 characters
   //check if first and last characters are same,
   //true =="first and last match
   //false == "first and last are different
   
   
   String word3="civic" ;
   char first=word3.charAt(0);
   char last =word3.charAt(4);
   if(first ==last) {
	   System.out.println("First and last match");
   }else {
	   System.out.println("Do not match");
   }
   //String word4==>always print the last character no matter the length
   
   String word4="java";
   char lastChar = word4.charAt(word4.length()-1);
   System.out.println("Last char of "+word4 +" is " + lastChar);
   
   
	}

}
