package day_20_forLoops;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop;1-7
		//1-monday
		//2-tuesday
		for(int day=1;day<=7;day++) {
		switch(day) {
		case (1):
			System.out.println(day+ "-monday");
		break;
		case(2):
		System.out.println(day+ "-tuesday");
		break;
		case(3):
			System.out.println(day+ "-wednesday");
		break;
		case(4):
			System.out.println(day+ "-thursday");
		break;
		case(5):
			System.out.println(day+ "-friday");
		break;
		case(6):
			System.out.println(day+ "-saturday");
		break;
		case(7):
			System.out.println(day+ "-sunday");
		break;
		default:
			System.out.println("Invaid day");
		
		}
		}

	}

}
