package day47_blocks;

public class AllBlocks {
int nonStaticInt=10;//first
static int staticInt=10;//10

	static {
		System.out.println("STATIC BLOCK-I run first and only once");
		staticInt--;//becomes 9
		////nonStaticInt--; will not work because is not static
	}
	{
		System.out.println("INIT BLOCK - I run each time object is created. before constructor");
	nonStaticInt+=5;//second add 10+5
	staticInt+=5;//second becomes 14  4-again it adds 17+5=22
	}
	
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created, after Init block");
		nonStaticInt+=3;//third 15+3
		staticInt+=3;// third becomes 17   fifth 22+3 =25
	}
}
