package day08_casting_conditionals;

public class IfElseWithVariables { 

	public static void main(String[] args) {
		int temperature= 45;
		if(temperature >= 65) {
			System.out.println("It is a nice day! Lets code java");
		}else {
			System.out.println("Stay home and code java");
		}
		//2 int variables,teamAScore, teamBScore
		//put a condition check if teamA won "Team A won"
		//"Team A won". 
		//go to team A!
		//else "team b won or it was a draw
		//Go Teams
		
		int teamAScore= 5;
	    int teamBScore= 9;
	    //5             9
	    if(teamAScore >teamBScore) {
	    System.out.println("Team A won! ");
	    System.out.println("Go Team A!");
	    }else {
	    	System.out.println("Team B won or it was a draw");
	    	System.out.println("Go Teams");
	    }
		
		

	}

}
