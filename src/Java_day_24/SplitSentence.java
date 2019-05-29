package Java_day_24;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		
		String sentence="Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";

		String[] words = sentence.split(" ");
		for(String str: words) {
			System.out.println(str);
			if(str.equals("lenguage")) {
				break;
			}
			counter++;
			
		}
		System.out.println("Position: "+counter);
		//System.out.println(words[counter]);//Java
	}

}
