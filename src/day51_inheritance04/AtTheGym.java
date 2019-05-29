package day51_inheritance04;

public class AtTheGym {

	public static void main(String[] args) {
		Excercise e= new Excercise();
		Running r=new Running();
		Swimming s=new Swimming();
		Yoga y= new Yoga();
		JuiJitSu j= new JuiJitSu();
		Sprinting sp= new Sprinting();
		System.out.println(e.Perform(30));
		System.out.println(r.Perform(40));
		System.out.println(s.Perform(45));
		System.out.println(y.Perform(60));
		System.out.println(j.Perform(60));
		System.out.println(sp.Perform(25));
		System.out.println("=============================");
		Snowbording sn= new Snowbording();
		System.out.println(sn.perform(100));
	}

}
