
public class Assignment150 {

	public static void main(String[] args) {
		String input="11:30PM";
		int time=Integer.parseInt(input.substring(0,input.indexOf(":")));
		time+=12;
		System.out.println(time);
	}

}
