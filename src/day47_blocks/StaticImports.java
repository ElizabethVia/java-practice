package day47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import static java.time.LocalDateTime.now;
import java.util.Arrays;
import java.util.Arrays.*;
public class StaticImports {
public static void main(String[] args) {
	System.out.println(PI);//pie
	System.out.println(max(10,5));//10
	System.out.println(max(10,10));//10
	System.out.println(max(10,100));//100
	System.out.println(floor(3.45));//3.0
	System.out.println(round(45.99));//46
	System.out.println(round(15.5));//16
	System.out.println(round(15.49999));//15
	System.out.println(abs(-10));//10
	System.out.println(pow(10.4,2));//108.16000000000001
	System.out.println(sqrt(5));//2.23606797749979
    System.out.println(random()*10);//3.9472030381126832
    //========================================

	System.out.println(isDigit('4'));//true
	System.out.println(isAlphabetic('j'));//true 
	
	int [] nums= {34,23,44,11,4444,1222};
	sort(nums);
	System.out.println(Arrays.toString(nums));//[11, 23, 34, 44, 1222, 4444]
	System.out.println(now());//2019-05-19T14:39:14.663718800
}
	
}
