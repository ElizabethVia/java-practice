package JavaDay_37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cars = new ArrayList<>();
		cars.add("Honda");// etc add more values
		// declare and add values in single statement
		// Arrays class
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		// nums.add(100);this will not work
		// System.out.println(nums.toString());

		// create arraylist prices
		// assign values using Arrays.asList method
		List<Double> prices = Arrays.asList(2.99, 1.99, 2.50, 50.5, 100.10, 250.0, 550.10, 80.0, 90.50, 100.0);
		System.out.println(prices.size());// 10
		// calculate sum of all prices
		double sum = 0;
		for (double price : prices) {
			sum += price;
		}

		System.out.println("Sum: " + sum);// Sum: 1228.68

		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("Sum2: " + sum2);// Sum2: 1228.68

		// create new list call expensive
		// add prices that are more than 100 from prices
		List<Double> expensive = new ArrayList<>();
		for (double price : prices) {
			if (price > 100.0) {
				expensive.add(price);
			}
		}
		System.out.println("Expensive: " + expensive.toString());
		// Expensive: [100.1, 250.0, 550.1]
		
	}

}
