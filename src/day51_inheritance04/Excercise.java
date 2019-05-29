package day51_inheritance04;

public class Excercise {

	public int Perform(int minutes) {
		System.out.println( "Performing general exercise");
		return minutes*4;
	}
	
}
//multiple classes can be stores in the same file, 
//but only one of them needs to be public
//and file name must match the public class
/*
Public Int Perform(int minutes)
"Doing general exercise"
4 calories per minute

-->running
"runing"
10 cal/minutes
-->Swimming
11 cal/min
-->Yoga
5 cal/minute
-->juijitsu
12 cal/minute

Perform(int minutes)
4 calories per minute
*/