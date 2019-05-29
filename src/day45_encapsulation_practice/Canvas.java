package day45_encapsulation_practice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
public static void main(String[] args) {
	 Course course1=new Course();
	 course1.setName("Java Programing");
	 
	 List<String>javateachers=new ArrayList<>();
	 javateachers.add("Vasyl");
	 javateachers.add("Murodil");
	 javateachers.add("Marufjon");
	 javateachers.add("Muhtar");
	 course1.setTeachers(javateachers);
	 List<String> javaStudents=new ArrayList<>();
	 javaStudents.add("Burak");
	 javaStudents.add("Roman");
	 javaStudents.add("Gulnar");
	 javaStudents.add("Ethem");
	 javaStudents.add("Sung");
	 
	 course1.setStudents(javaStudents);
	 System.out.println(course1.toString());
	 course1.addTeacher("Ekaterina");
	 course1.addStudent("Maria");
	 
	 if(course1.getTeachers().contains("Maria")) {
		 System.out.println("Maria is a teacher");
	 }else {
		 System.out.println("maria is not a teacher");
	 }
	 if(course1.getStudents().contains("Ekaterina")) {
		 System.out.println("Ekaterina is a student");
	 }else {
		 System.out.println("Ekaterina is not a student");
	 }
	 course1.removeTeacher("Murodil");
	 course1.removeStudent("Roman");
	 if(!course1.getTeachers().contains("Murodil")) {
		 System.out.println("Murodil is removed seccessfully");
		 
	 }else {
		 System.out.println("Murodil is still a teacher");
	 }
	 if(!course1.getStudents().contains("Roman")) {
		 System.out.println("Roman is removed seccessfully");
		 
	 }else {
		 System.out.println("Roman is still a student");
	 }
}
}
