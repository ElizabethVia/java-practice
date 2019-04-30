package Day_35_methods07_practice;

public class EncryptionFunV1 {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";

		String word="easter";
	
	//get a char from word
		//find indexOf the char in alphabet
		//red the char from encrypted at that index
		//add to some string
		char first =word.charAt(0);//'e'
		int position= alphabet.indexOf(first);
		System.out.println("position: "+position);
		char enChar=encrypted.charAt(position);
		System.out.println(first +" --> "+enChar);
		//
		//result += encrypted.charAt(alphabet.indexOf(word.charAt(i)));
		
		//with a loop
		String encryptedWord="";
           for(int i=0;i<word.length();i++) {
           char ch=word.charAt(i);
           //find in alphabet
           int index =alphabet.indexOf(ch);
         //  System.out.println(encrypted.charAt(index));
           encryptedWord+=encrypted.charAt(index);
	}
           System.out.println(word);
           System.out.println(encryptedWord);
	}
}
