package Java_day_21_loops_practice1;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   //01234
		String word="javva";
		String unique="";
		
		char ch=word.charAt(0 );//charAt read character at position 0
		System.out.println(unique.contains(""+ch));
		System.out.println(unique.indexOf(ch));//indexOf the position of the string like j
		if(!unique.contains(""+ch)) {
		unique+=ch; //unique = unique+ch;
		
		}
		if(unique.indexOf(ch)==-1) {
			unique+=ch;
		}
		System.out.println("unique:" + unique);
		
		
		String word2="bananas";
		String unique2="";
		int i=0;
		char ch2=word2.charAt(i);//a
		System.out.println("Ch2:"+ch2);
		
		
		i=1;
		ch2=word2.charAt(i);//b
		System.out.println("Ch2:" +ch2);
		
		//"bananas"
		i++;
		ch2=word2.charAt(i);//n
		System.out.println("Ch2: "+ch2);
		
		//check if ch2 is in the unique2 variable
		//if(unique2.contains)
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
