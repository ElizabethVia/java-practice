package day47_blocks;

public class AllBlocksTest {

	public static void main(String[] args) {
		AllBlocks all1= new AllBlocks();
		AllBlocks all2= new AllBlocks();

		/*
		 * STATIC BLOCK-I run first and only once
           INIT BLOCK - I run each time object is created. before constructor
           CONSTRUCTOR- I run each time object is created, after Init block
           INIT BLOCK - I run each time object is created. before constructor
           CONSTRUCTOR- I run each time object is created, after Init block

		 */
		System.out.println(all1.nonStaticInt);
		System.out.println(all1.staticInt);
		
		System.out.println(all2.nonStaticInt);
		System.out.println(all2.staticInt);
		
		
	
	}

}
