import java.util.Scanner;

public class Fidingchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen="welcome to this class";
		char alph ='a';
		int sum=0;
		for(int i=0;i<26;i++) {
			
			for(int j=0;j<sen.length(); j++) {
				if(alph==sen.charAt(j)) {
					sum++;
				}
				System.out.println(""+alph+sum);
				alph++;
				sum=0;
				System.out.println("*************");
				Scanner scan=new Scanner(System.in);
				
				
				boolean exists = false;
			    
			    String word = scan.next();
			    if(word.length()==word.indexOf(0,1));
			      System.out.println(word);
			}
		}
	}

}
