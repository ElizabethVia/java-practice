package Java_Day_15;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item="java";
		String pageTitle=item+ "Google Search";
		
		//test if page Title starts with item
		if (pageTitle.startsWith(item)) {
			System.out.println("Page title check passed");
		}else {
			System.out.println("FAIL: Page title check failed");
			
		}
		
		if(pageTitle.endsWith("Google search")) {
		System.out.println("Pass: Google search is in title");
		}else {
			System.out.println("FAIL: page title check failed");
					
		}

	}

}
