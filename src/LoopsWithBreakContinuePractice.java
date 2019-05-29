
public class LoopsWithBreakContinuePractice {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("numbers "+i);/*numbers 0
                                               numbers 1
                                               numbers 2
                                               numbers 3
                                               numbers 4
           */
           }                                    
			for (int i=0;i<10;i++) {
				if(i%2!=0) {//even numbers
					continue;
		//System.out.println("Even numbers "+i);when is inside the loop and it 
					                   // does not have continue it will print add numbers
				}
				System.out.println("Even numbers "+i);//when out side this will print add numbers
			}
			
		

	}

}
