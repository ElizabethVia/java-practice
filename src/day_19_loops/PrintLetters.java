package day_19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word="Amazon";
                  //012345 charAt count starting 0
                  //123456 length counts starting 1
       
       //print each character one by one in separate lines
       int idx=0;
       while(idx< word.length()) {
    	   System.out.println(word.charAt(idx));
    	   idx++;
       
       
    	   //1 true idx=0 A
	//2 true idx=1 m
       }
       System.out.println();
       //print each character in reverse order
       int idx2 =word.length()-1;//5
      while(idx2>=0) {
    	  System.out.println(word.charAt(idx2));
    	  idx2--;
      }
	
	}
}