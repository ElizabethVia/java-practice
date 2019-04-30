package Java_day_21_loops_practice1;

public class ConvertChatToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //following ways can be used to convert char to string
		char ch='a';
		String str1=""+ch;
		System.out.println(str1);
		
		char ch2='v';
		//String str2=new String(ch2);
		String str2=new String(""+ch2);
		String str3=Character.toString(ch2);
		System.out.println(str2);
		System.out.println(str3);
	}

}
