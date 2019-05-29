package JavaDay39_arrayList04;

public class School {

	public static void main(String[] args) {
		//create object from student class 
		Student student=new Student();
		student.name="Roman";
		student.age=25;
		student.subject="java";
		System.out.println("Name: "+student.name);//Name: Roman
        System.out.println("Age: "+student.age);//Age: 25
        System.out.println("Subject: "+student.subject);//Subject: java
        
        Student student2=new Student();
        student2.name="Cleetus";
        student2.age=33;
        student2.subject="Selenium";
        
        System.out.println("Name: "+student2.name);//Name: Cleetus
        System.out.println("Age: "+student2.age);//Age: 33
        System.out.println("Subject: "+student2.subject);//Subject: Selenium
        
        

	}

}
