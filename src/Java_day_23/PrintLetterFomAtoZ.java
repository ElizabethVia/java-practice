package Java_day_23;

public class PrintLetterFomAtoZ {

	public static void main(String[] args) {
		
		//outer loop will repeat printing of letter as many times as want
		//in this case we are gonna print 3 times
		//so we are running inner loop 3 times
		for(int i=0;i<=3;i++) {//con esto se printa tres lineas
			//write a for loop that will print letter from a to z
			for(char letter='a'; letter<='z';letter++){//con esto de el a a la z
				System.out.print(letter);
			}System.out.println();//you need this to print the stars between letters
			System.out.println("**************");
		}
 
		for(int i=1;i<=3;i++) {//con esto se printa tres lineas
			//write a for loop that will print letter from z to a
			if(i%2==0) {
				for(char letter='a'; letter<='z';letter++){//con esto de el z a la a
					System.out.print(letter);
				}
			}else {
				for(char letter='z'; letter>='a';letter--) {
					System.out.print(letter);
				}
			}
			
				
			}System.out.println();//you need this to print the stars between letters
			System.out.println("**************");
	}

}
