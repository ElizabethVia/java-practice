package Java_Day_15;

public class IndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//index of with 2 inputs
		
		String list ="html-selenium-angular-jerkins-grid";
		int firstDash= list.indexOf("-");
		System.out.println("First dash: " + firstDash);
		
		int secondDash=list.indexOf("-",5);//start looking from the second dash
		System.out.println("second dash:"+ secondDash);
		//find the third dash
		int thirdDash= list.indexOf("-",secondDash+1);
		System.out.println("thirth Dash: "+ thirdDash);
		// find last dash
		
		int lastDash=list.lastIndexOf("-");
		System.out.println("Last dash: "+ lastDash);
		
		String count="one,two,tree,four,five";
		int firstComa=count.indexOf(",");
		System.out.println("first coma: "+firstComa);
		
		
		
		
	}

}
