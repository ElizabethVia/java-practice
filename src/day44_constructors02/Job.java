package day44_constructors02;

public class Job {

	private String tittle;
	private String company;
	private double annualSalary;
	
	
	public Job() {
		System.out.println("No-args constructor");
		this.tittle="unidefined";
		this.company="unidefined";
	}
	public Job(String title) {
		System.out.println("One-args constructor");
		this.tittle=title;
		this.company="unefined";
		
	}
	public Job(String tittle,String company, double annualSalary) {
		System.out.println("thee-args constructor");
		setTittle(tittle);
		setCompany(company);
		this.annualSalary=annualSalary;
	}
	
	public String toString() {
		return "\nJob [tittle=" + tittle + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}
