package Java_day_23;

public class CheckNumber {
public static void main(String[] args) {
	for(int i =1;i<=100;i++) {
		//if(i%5==0) {it will not print anything the number5
		//continue;
	if(i==15) {
		break;
	}
	System.out.println("Number "+i);
	System.out.println("##############################");
}
	
	for(int i=1;i<=20;i++) {
		if(i>=5&&i<=10) {//IT WILL SKIP 5-10
			continue;
		}
		System.out.println("Number "+i);
	}
}
}