package officeHours2;

public class EmailGenerator {

	static String companyName="Deloitte";
	
	String name;
	
	public EmailGenerator(String name) {
		this.name=name;
	}
	public String getEmail() {
		return name+ "@"+companyName+".com";
	}
}
