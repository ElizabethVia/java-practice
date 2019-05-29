package day47_blocks;

public class InitBlock {

	{
		System.out.println("Init block");//this line will run first
		                           //no importa donde lo pogas arriva o abajo
		//it will run all the time
	}
	public InitBlock() {
		System.out.println("Constructor");
	}
}
