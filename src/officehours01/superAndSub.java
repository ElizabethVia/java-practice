package officehours01;
class A1{
	A1(){
		System.out.println("A");
	}
}
public class superAndSub  extends A1{
public superAndSub() {
	System.out.println("B");
}
public static void main (String [] args) {
	new superAndSub();
}
}
