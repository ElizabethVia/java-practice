package Java_Day22_loopspractice2;

public class SubStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="java";
		System.out.println(word.substring(0,2));//ja
		//pring each character in separate line using
		//substring, no loop
		
		System.out.println(word.substring(0,1));//j
		System.out.println(word.substring(1,2));//a
		System.out.println(word.substring(2,3));//v
		System.out.println(word.substring(3,4));//a
		//it will print java
		System.out.println("############################");
		
		int i=0;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		
		System.out.println("#######################FOR LOOP################################");
		//using for loop and substring,print each char
		//java
		//0123
		for(int n= 0;n<=3;n++) {
			System.out.println(word.substring(n,n+1));//it will print j
			                                                       // a
			                                                       // v
			                                                       // a
			
		}
		System.out.println("#############reverse###############");
		//print letters in reverse
		for(int n=3;n>=0;n--) {
			String letter=word.substring(n,n+1);
			System.out.println(letter);
		}
		int start=1;
		int end=10; //01234567891011
		String word2="UnitedStates";
		System.out.println(word2.substring(start,end));//nitedStat
		System.out.println(word2.substring(2,3));//i
		System.out.println(word2.substring(6,7));//S
		//pass single input. start only and will include until 
		System.out.println(word2.substring(6));//States
		//print last character
		String word3="apple";
		System.out.println(word3.substring(word3.length()-1));//e will show
		
		
		
	}
	

}
