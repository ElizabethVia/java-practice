package day_19_loops;

import java.util.Scanner;

public class Transsactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("What is your current balance?");
	   double balance=scan.nextDouble();
	    int count=0;
		while(balance>0) {
			count++;//increase transaction by 1
			System.out.println("what is transaction #"+count+"amount?");
			double transaction=scan.nextDouble();
			if(transaction>balance) {
				System.out.println("your balance is about to be negative due to this transaction");
			}
			balance-=transaction;
			System.out.println("Current balance: "+balance);
		}
		System.out.println("You have insuficient founts,your balance is "+balance);
		System.out.println("Transaction total count: "+count);
	}
}
