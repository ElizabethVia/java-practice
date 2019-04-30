package Java_day_23;

public class NumbersFrom1To50 {

	public static void main(String[] args) {
		/*
		 * loop through the numbers from 1 till 50(use for loop) print each number in
		 * the same line if number is divisible by 5 (n%5==0), skip it if number is
		 * divisible by 20, then exit the loop
		 */
		
		
		for(int i=1;i<=50;i++) {
			
			if(i%20==0) {
				break;
			}
			if(i%5==0) {
				continue;
			}
			System.out.print(i+",");
		}
		//1,2,3,4,6,7,8,9,11,12,13,14,16,17,18,19,
	}

}
