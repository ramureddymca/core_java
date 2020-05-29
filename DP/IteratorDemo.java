package DP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class IteratorDemo {
//higher-order function is different in 

	public static int totalValue(List<Integer> n, Predicate<Integer> selector) {
		
		return n.stream()
				.filter(selector::test)
				.reduce(0,  Integer::sum );
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println(totalValue(numbers, e-> true));
		System.out.println(totalValue(numbers, e-> e%2==0));
		System.out.println(totalValue(numbers, e-> e%2!=0));

	}
}
