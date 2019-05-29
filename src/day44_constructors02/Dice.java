package day44_constructors02;

import java.util.ArrayList;
import java.util.List;

public class Dice {

	public static void main(String[] args) {
		
		Job job1 =new Job();
		Job job2 =new Job("java Developer");
		Job job3 = new Job("SDET","Amazon",130_000.0);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		//create a list of jobs
		//and add 5 different jobs, with company, salary, and title
		List<Job> jobsList= new ArrayList<>();
		
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master","Google",123000));
		jobsList.add(new Job("SDET","FreddieMac",100000));
		jobsList.add(new Job("BA","Leidos",98000));
		jobsList.add(new Job("Senior QA Tester","Delta",150_000));
		
		System.out.println(jobsList.toString());
		
		//find the highest paying job and print toString for that
		double maxSalary=0;
		int highestIndex=-1;
		for(int i=0;i<jobsList.size();i++) {
			if(jobsList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=jobsList.get(i).getAnnualSalary();
				highestIndex=i;
			}
		}//two ways to do it 
		//1  way-->Job bestJob=jobsList.get(highestIndex);
		//System.out.println("Highest Salary: "+bestJob.toString());
		System.out.println("Highest Salary: "+jobsList.get(highestIndex));
	}

}
