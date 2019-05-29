import java.util.ArrayList;

public class MentoringArrayListStrings2 {

	public static void main(String[] args) {
		ArrayList<String>colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("purple");
		colors.add("yellow");
		colors.add("white");
		//print in a single line
		System.out.println(colors.toString());
		//print colors using for each loop
		for(String color:colors) {
			System.out.print(color+" ");
		}
		//check if our list is empty
		//System.out.println(colors.isEmpty());
		
		//add colors to a position 0 and 1
		System.out.println();
		colors.add(0,"brown");
		colors.add(1,"green");
		System.out.println(colors.toString());
		//find index of color blue
		int idx=colors.indexOf("blue");
		System.out.println(idx);
		//replace idx for red
		colors.set(idx, "yellow");
		System.out.println(colors.toString());
		
	}

}
