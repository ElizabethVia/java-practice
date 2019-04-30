package Java_day31_methos3;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWords("Java is fun");
		countWords("this is methods with strings");
		
		
       googleSearchResults("About 121,000,000 results (0.75 seconds)");
		
		String resultsStr = "About 16,600,000 results (0.73 seconds)";
		googleSearchResults(resultsStr);
		
		//name: countWords
		//retun:void
		//params/args:String sentence
		//countWords("java is fun")
		//Words in this sentence [java, is ,fun]
		//number of words 3
		

	}
	public static void countWords(String sentence) {
	
		String []words=sentence.split(" ");
		
		System.out.println("Words in this sentence "+Arrays.toString(words));
		//Words in this sentence [Java, is, fun]
		System.out.println("Number of words: "+ words.length);//Number of words: 3

	}

	/*
	 * 2) Method name: googleSearchResults Return type: void params: 1 String
	 * 
	 * googleSearchResults("About 121,000,000 results (0.75 seconds)");
	 * 
	 * "Results count: 121000000" "Time in seconds: 0.75"
	 *                       0          1      2       2     4
	 * googleSearchResults("About 16,600,000 results (0.73 seconds)");
	 * 
	 * "Results count: 16600000" "Time in seconds: 0.73"
	 */
	public static void googleSearchResults(String result) {
		String [] words=result.split(" ");
		//split by space into array
		String count=words[1].replace(",", "");
		String seconds=words[3].replace("(", "");		
		System.out.println("Results count: "+count);
		System.out.println("Time in seconds: "+ seconds);
	}
}
