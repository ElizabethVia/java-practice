
public class ForLoopsPractice1 {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i+=2) {//if is i++ it will print 1-5
			//System.out.println("Hello friends!");//it will print hello friends 5 times
			System.out.println(i);//it will print 1 3 5
		}
		for(int j=0;j<=10;j++) {
			System.out.print("*");//***********
			System.out.print(j);//*0*1*2*3*4*5*6*7*8*9*10
		}
		System.out.println();
		for (int i=10;i>=0;i--) {
			System.out.print(i+ ", ");//10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0,
		}
		System.out.println();
		for (int i = 0; i < 50; i++) {
			if(i %2==0) {//even numbers will print 1-49
			//if(i %2!=0)//add number will print
				System.out.print(i+" ");//even number will print 0-48
			}
		}
		System.out.println();
			String[]fruits=new String[3];
			fruits[0]="apples";
			fruits[1]="pears";
			fruits[2]="oranges";
			//fruits[3]="mango";
			for(int i=0;i<3;i++) {
				System.out.println(fruits[i]);//apples pears oranges
			//	System.out.println(fruits[1]);
			
			
			
		}
	}

}
