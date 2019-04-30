
public class contacts {

	public static void main(String[] args) {


		String contact="john 4846558";
		String[] contacts=new String[5];
		contacts[0]="james 8946546";
		contacts[1]="alex 4582145";
		contacts[2]="jack 8946544";
		contacts[3]="tan 8946786";
		contacts[4]="hannah 1246546";
		for(int i=0;i<5;i++) {
			System.out.println(contacts[i]);//this will print all the contacts
		}
		for(int i=0; i<contacts.length;i++) {
		if(contacts[i].contains("jack")) {
			System.out.println("I found it index is: "+i);{
				System.out.println(contacts[i]);//jack 8946544

			}
		}	
		}
		//find and delete contact
		for(int i=0;i<contacts.length;i++) {
			if(contacts[i].contains("james")) {
				contacts[i]=null;
			}
		}
		System.out.println("*********************************************");
		for(int i=0;i<contacts.length;i++) {
			if(contacts[i]!=null) {//this will delete null
			System.out.println(contacts[i]);
		}
		}
	}

}
