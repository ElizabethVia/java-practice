package Java_day_24;

public class ArrayOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[]values= {'a','b','c'};
		for(char value: values) {
			System.out.println(value);
		}
		String str="Wooden spoon";
		//this ,method toCharArray() converts string into array of characters
		char[] chars =str.toCharArray();
		for(char c: chars) {
			System.out.print(c);//Wooden spoon
			
		}
		System.out.println();
		str="";
		for(int i=chars.length-1;i>=0;i--) {
			str+=chars[i];
			//noops nedooW
		}
		System.out.println(str);
		
		//print characters with help of array of characters, one by one
		//if character is equals to 'o', replace with '*';
		
		
		for(char c: chars) {
			if(c=='o') {
				System.out.print("*");
			}else {
				System.out.print(c);//W**den sp**n
			}
			
		}
	}

}
