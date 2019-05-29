package day46_static_keyword;

public class CompanyTest {

	public static void main(String[] args) {
		//print cname variable value
		
		System.out.println(Company.cname);//Deloitte
		
		System.out.println(Company.cname.toUpperCase());//DELOITTE
		//
		//Company.cname.toUpperCase();
		//System.out.println();
		Company c=new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
		
		
	}

}
