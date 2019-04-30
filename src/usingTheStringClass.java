
public class usingTheStringClass {

	public static void main(String[] args) {
		String sentence = "Text processing is hard!";
		int position = sentence.indexOf("hard");
		System.out.println(sentence);
		System.out.println("012345678901234567890123");
		System.out.println("The word \"hard\" starts at index "
							+ position);
		sentence = sentence.substring(0,position) + "easy!";
		sentence = sentence.toUpperCase();
		System.out.println("The changed string is:");
		System.out.println(sentence);
		
		//2 int variables,teamAScore, teamBScore
				//put a condition check if teamA won "Team A won"
				//"Team A won".
				//go to team A!
				//else "team b won or it was a draw
				//Go Teams
		
		int teamAScore= 9;
		int teamBScore=6;
		if (teamAScore > teamBScore) {
			System.out.println("Team A won");
			System.out.println("Go team A");
			
		}else {
			System.out.println("Team b won or it wasdraw" );
			System.out.println("Go Teams");
		}
	
		
		
		
	}

}
