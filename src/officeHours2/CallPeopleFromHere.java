package officeHours2;

public class CallPeopleFromHere {

	public static void main(String[] args) {
		//need a create object to access
		//non static variables
		People mymanNursultan= new People();
		System.out.println(mymanNursultan.hardToGet);//Nursultan
		//no need a create object to access
	    //static variables
		System.out.println(People.easyToGet);//Muhtar
		//use object to access the non static method
		mymanNursultan.sayMyName();//Nursultan
		// use class name to access the static method
		People.whatMyName();//Muhtar
		
		
		
	}

}
