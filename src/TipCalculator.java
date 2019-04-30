import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        String split;
	        String serviceQuality;
	        int numberOfPeople;
	        double checkAmount;
	        double totalTip = 0.0;

	        System.out.println("Split:");
	        split = input.next();

	        System.out.println("Number of people:");
	        numberOfPeople = input.nextInt();

	        System.out.println("Check amount:");
	        checkAmount = input.nextDouble();

	        System.out.println("Service Quality:");
	        serviceQuality = input.next();

	        switch (serviceQuality.toLowerCase()) {
	        case "poor":
	            totalTip = checkAmount * 0.05;
	            break;
	        case "fair":
	            totalTip = checkAmount * 0.10;
	            break;
	        case "good":
	            totalTip = checkAmount * 0.15;
	            break;
	        case "great":
	            totalTip = checkAmount * 0.20;
	            break;
	        case "excellent":
	            totalTip = checkAmount * 0.25;
	            break;

	        }

	        System.out.print("Number of people entered: ");

	        if (numberOfPeople == 1) {
	            System.out.println("&");
	        } else if (numberOfPeople == 2) {
	            System.out.println("&&");
	        } else if (numberOfPeople == 3) {
	            System.out.println("&&&");
	        } else if (numberOfPeople == 4) {
	            System.out.println("&&&&");
	        }else if (numberOfPeople == 5) {
	            System.out.println("&&&&&");
	        }

	        System.out.println("Total to pay: " + (checkAmount + totalTip));

	        System.out.println("Total tip: " + totalTip);

	        System.out.println("Total per person: " + ((checkAmount + totalTip) / numberOfPeople));

	        System.out.println("Tip per person: " + (totalTip / numberOfPeople));

	    }

	}