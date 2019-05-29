import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OCAPracticeQuiz {

	public static void main(String[] args) {
		
		/*String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}*/
/*What is the result?
A. May 04, 2014T00:00:00.00
B. 2014-05T00:00: 00. 000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime. 
D-is(Correct) because you are declaring time and we don't need time
*/
//	
		/*
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2; 			// Line n1
		String s4 = (String) (s3 * s2);		// Line n2
		System.out.println("Sum is " + s4);
		
		///Cannot cast from long to String
	}
	/*
	 * What is the result? 
	 * A. Sum is 600 
	 * B. Compilation fails at line n1.
	 * C.Compilation fails at line n2.
	 * D. A ClassCastException is thrown at line n1.
	 * E. A ClassCastException is thrown at line n2. 
	 * ANSWER: C      Cannot cast from long to String
	 */
		/*
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		if(sb.equals(s)) {
			System.out.println("Match 1");
		}else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		}else {
			System.out.println("No Match");
		}
	
	/*
What is the result?
A. Match 1
B. Match 2
C. No Match
D. A NullPointerException is thrown at runtime
ANSWER: Match 2
...........................................
*/
		/*
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C','D'); is not replacing C for D   ??
		ta = ta.concat(tb);
		System.out.println(ta);
	*/
	/*
What is the result?
Choose options:
A. A B C D
B. A C D
C. A B C C   (correct)
D. A B D C
*/

	}

}
