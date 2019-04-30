package day18_while_dowhile_loops;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfStudents=1;
		//using a loop iterate until we have 10 students in the room
		//student1
		//student2
		//print out no more space
		
		while(numberOfStudents<=10) {
			System.out.println("Student: "+numberOfStudents);
			numberOfStudents++;
		}
		System.out.println("No more space");
	}

}
