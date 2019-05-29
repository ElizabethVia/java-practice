
public class Student {
	String name;
	int StudentID;
	
	
	public Student() {
		System.out.println("no arg from student");
	}
	public Student(String name, int StudentID) {
		
		this.name=name;
		this.StudentID=StudentID;
		System.out.println("2 args from studemt "+this.name + " "+this.StudentID);
	}
	
	
}
