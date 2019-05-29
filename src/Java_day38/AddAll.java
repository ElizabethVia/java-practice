package Java_day38;
import java.util.*;
public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		l1.add("java");
		l1.add("python");
		List<String>l2=new ArrayList<>();
		l2.add("C#");
		l2.add("C++");
		System.out.println(l1);
		System.out.println(l2);
		//for(String value:l1) {
		//	l2.add(value);
		//}
		System.out.println(l2);//[C#, C++, java, python]
		l2.addAll(l1);
		System.out.println(l2);//[C#, C++, java, python]
		l2.addAll(l1);
		System.out.println(l2);//[C#, C++, java, python, java, python]
		l1.addAll(l2);
		System.out.println(l1);//
		//[java, python, C#, C++, java, python, java, python]
	


	}

}
