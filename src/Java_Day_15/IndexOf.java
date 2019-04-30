package Java_Day_15;

public class IndexOf {

	public static void main(String[] args) {
		
		          //  012345
		String word1="github";
		System.out.println(word1.indexOf("g"));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("hub"));//3
		
		System.out.println(word1.indexOf("java"));
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Pos of . :"+ i);
		System.out.println(url.charAt(i+1)); 
		
		
		String title= "java - Google search";
		
		int a=title.indexOf('-');
		System.out.println(title.charAt(a-2));
		System.out.println(title.charAt(a+2));
		
		String country="United States of America";
		
		int states= country.indexOf("States");
		System.out.println("Posisition of states: "+states);
		
		String word2="java,c++, Python, tomcat,eclipse";
		//check if it C++ is in the word2
		//1) using contains 
		if(word2.contains("c++")) {
			System.out.println("C++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		//2) using indexOf
		if(word2.indexOf("c++")>=-1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
		
	}

}
