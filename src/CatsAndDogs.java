import java.util.Scanner;

public class CatsAndDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
		  //  word=word.replaceAll("#","").replaceAll("!","");
		    
		   word= word.replace("cat", "#");
		   word=word.replace("dog", "!");
		   for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='#')
				countOfCats++;
			else if(word.charAt(i)=='!');
			countOfDogs++;
		}
		   System.out.println(countOfCats==countOfDogs);
	}

}
