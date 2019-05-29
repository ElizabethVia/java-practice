package day47_blocks;

public class VariableAccess {

		//instance variable
		int myInstanceVar=40;
		//static variable
		static int myStaticVariable=55;
	
		public static void main(String[] args) {
			//can not access non-static from static method
			//System.out.println(myInstanceVar);
			System.out.println(myStaticVariable);//55
			//create object of VariableAccess and print myInstanceVar
			VariableAccess v=new VariableAccess();
			System.out.println(v.myInstanceVar);//40
			//access static variable using object
			System.out.println(v.myStaticVariable);//55
			//access static variable using classname
			System.out.println(VariableAccess.myStaticVariable);//55
			
	}

}
