package Java_Day22_loopspractice2;

public class FindHowManyUsingRepace {

	public static void main(String[] args) {
		
		String word="including webpages,images";
		//find how many e characters in the word
		//get the length of word
		//replace all e with empty
		//get the length of word without e
		//do a minus
		int length1=word.length();
		word=word.replace("e", "");
		int length2=word.length();
		
		System.out.println("length1: "+length1);
		System.out.println("length2:"+length2);
		int count =length1-length2;
		System.out.println();System.out.println("Count of e: "+count);

	}

}
