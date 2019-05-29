package day40_customclasses_methods;

import java.util.ArrayList;

public class WarmUpList {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("moon");//
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Neptune");
		myList.add("Sun");
		// myList.add("Sun");

		String targetWord = "Sun";
		int count = countOccurances(myList, targetWord);
		if (count == 3) {
			System.out.println("Unit test PASS: Count is 3.");
		} else {
			System.out.println("Unit test FAIL: Count is " + count);
			System.out.println("Expected: 3");
			System.out.println("Actual: " + count);
		}
	}

	/*
	 * method name: countOccurances Return: int Params: ArrayList<String>,String
	 * word Method counts how many times, word appears in the list, and returns the
	 * count
	 */
	public static int countOccurances(ArrayList<String> wordList, String word) {
		int count = 0;
		int value = 0;
		for (String w : wordList) {
			if (w.equals(word)) {
				count++;
			}

		}
		return count;
	}
}
