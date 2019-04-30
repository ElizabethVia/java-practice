import java.util.Scanner;

public class Avgtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		
								//80			//70				//96
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
				for(int i=0;i<temps.length;i++) {
					total+=temps[i];
					k++;
				}
				
				
				
				avgTemp=total/k;
				System.out.println(avgTemp);
				
				
				
	}
	}