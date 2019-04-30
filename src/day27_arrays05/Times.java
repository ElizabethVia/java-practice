package day27_arrays05;

public class Times {

	public static void main(String[] args) {
		int[] time1=new int[2]; 
		int[] time2=new int[2]; 
		/*
		 * int[] time1={20,45};
		 *  int[] time2={15,33};
		 */
		time1[0]=10;//hour
		time1[1]=15;//minute
		
		time2[0]=16;//hour
		time2[1]=10;//minute
		//before comparing int,check if both arrays have
		//valid hour/minute
		if(time1[0]<0 || time1[0]>23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if(time1[1]<0 || time1[1]>59) {
			System.out.println("Time1 has invalid minutes");
			return;
		}
		if(time2[0]<0 || time2[0]>23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		if(time2[1]<0 || time2[1]>59) {
			System.out.println("Time2 has invalid minutes");
			return;
		}
		//compare arrays and tell which one is earlier
		//comprare hours
		if(time1[0]<time2[0]) {
			System.out.println("Time1 earlier");
		}else if(time2[0]<time1[0]) {
			System.out.println("Time2 is earlier");
		}else {//hours are equal,check minutes
			if(time1[1]<time2[1]) {
				}else if(time2[1]<time1[1]) {
				System.out.println("Time1 is earlier");
				
			}else if(time2[1]<time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("same time!");
			}
		}
		
		
	}

}
