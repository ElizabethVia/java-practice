package Java_Day22_loopspractice2;

public class LookForWoedInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "He said hi, then she replied hi. hi guys!";
		//print letter in pairs
		System.out.println(sentence.substring(7,10));//hi
        System.out.println(sentence.substring(28,31));//hi
        System.out.println(sentence.substring(32,36));//hi
        
        System.out.println(sentence.substring(0,3));//he
        System.out.println(sentence.substring(1,2));//e
        System.out.println(sentence.substring(3,4));//s
        System.out.println(sentence.substring(4,6));//ai
        //two characters at the time
        //check if temp equals "hi", if true,add 1 to count
        int count=0;
        for(int i=0;i<sentence.length()-1;i++) {
        	String temp=sentence.substring(i,i+2);//2 letters
        	//System.out.println(temp);
        	if(temp.equals("hi")) {//count how many "hi"
        		count++;
        		
        	}
        	
        }
        //count:3
        System.out.println("Count: "+count);//Count: 3
	}

}
