import java.util.Scanner;

public class Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
  
		// if a string starts with does, is, or are place a question mark, otherwise,
				// add a period
				Scanner etsy = new Scanner(System.in);
				String str = etsy.nextLine();
				if (str.startsWith("does") || str.startsWith("is") || str.startsWith("are")) {
					str += "?";
				} else {
					str += ".";
				}
			System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
			}
		}