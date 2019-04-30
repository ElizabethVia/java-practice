package day27_arrays05;

public class CanvasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://learn.cybertrkschool.com/courses/149";
		// split by/ and store into array
		String[] urlArr = url.split("/");
		System.out.println("Length: " + urlArr.length);
		// get last number and convert to int data type
		System.out.println(urlArr[urlArr.length - 1]);

		int courseID = Integer.parseInt(urlArr[4]);
		// use switch statement to find course name
		switch (courseID) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("invalid number of couse");
			break;
		}

	}

}
