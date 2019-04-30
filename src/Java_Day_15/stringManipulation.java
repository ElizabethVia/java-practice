package Java_Day_15;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String emoji= ":)";
        // ==!= CHECK IF IT DOES NOT EQUAL TO  2 CHARS
		if(emoji.length()!=2) {
			System.out.println("Ivalid emoji");
			return;//stop execution
		}
		
		//if code reaches this point ,then emojie is 2 chars
		//GET FIRST AND SECOND CHAR AND ASSIGN TO VARIABLES
		char first= emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first==':') {
			if(second==')') {
				System.out.println("smile");
			}else if(second=='(') {
				System.out.println("sad");
			}else if(second=='/') {
				System.out.println("upset");
			}else if(second=='P') {
				System.out.println("Playfull");
			}else {
				System.out.println("Unknown Emoji");
			}
			
		}else if(first==';') {
			if(second==')') {
				System.out.println("wink");
			}else if(second=='0') {
				System.out.println("surprised");
			}else {
				System.out.println("Unknown Emoji");
			}
		}else if (first=='(') {
			if(second==':') {
				System.out.println("sad");
			}else {
				System.out.println("Unknown Emoji");
			}
		}else if(first==')') {
			
		}else {
			System.out.println("Invalid Emoji");
		}
			
		
		
			
			
			
		
		}
		
	}


