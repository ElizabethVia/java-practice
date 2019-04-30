package day16_string_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="I wrote [236] lines of code today";
		//assign to variable and print the number between[239]
		int start=sentence.indexOf('[')+1;//if we dont do the +1 is going to start with [
		int end=sentence.indexOf(']');
		String codeCount =sentence.substring(start,end);
		System.out.println("Lines of code:"+codeCount);
		//System.out.println(sentence.substring(9,12));
		
		
		System.out.println("Lines of code:" +sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
		//check if codeCount is more than 20
		int count=Integer.parseInt(codeCount);//convert string to int
		if (count>20) {
			System.out.println("Wrote more than 20 lines of code today!!");
			
		}else {
			System.out.println("Not enough coding for today");
		}
		
	}

}
