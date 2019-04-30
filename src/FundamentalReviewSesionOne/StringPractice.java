package FundamentalReviewSesionOne;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//literal
		String word="java";
		String word2=new String("java");
		System.out.println(word.toUpperCase());
		System.out.println(word);
		System.out.println(word2);
		System.out.println(word==word2);//false
		//equals method checks value
		System.out.println(word.equals (word2));

	}

}
