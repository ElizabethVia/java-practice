package day_20_forLoops;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//word
		//char to count the number of occurrences
		
		String word="computer programming";
		char myChar='m';
		
		int counter =0;
		for(int i =0;i < word.length(); i++) {
			if(word.charAt(i)== myChar) {
				counter++;
			}
			
		}
		System.out.println("Count: "+counter);
		
	}

}
