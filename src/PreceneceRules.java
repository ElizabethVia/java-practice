
 public class PreceneceRules {
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  
  int z=2; int q=2; System.out.println(z++);//2 System.out.println(z);//3
  System.out.println(q--);//2 System.out.println(q);//1
  
  int x=8; System.out.println(++x * 3+""+x); // 9*3+"+x // 27+"+9 27 9 int
  int i=10+(+11)-(-12); System.out.println(i); //21 +12
  
  int a=12+21*3-9/2; // 12 +63-9/2 // 12 + 63-4 71 System.out.println("a="+a);
  
  int b=14-32*4+175/ 8-3; // 14 -128+/8-3 // 14-128+21-3 //b=96
  System.out.println(b);
  
  if(++a>71 &&--b<20) { System.out.println("true");
  
  if(b--==-97 || a--<100) { System.out.println("also true"); } }
  
  }
  
  }
 