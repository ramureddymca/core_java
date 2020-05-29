package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListComparision {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("abc","bca"); 
				List<String> list2 = Arrays.asList("abc","xyz"); 
		
				List<String> unavailable = list1.stream() 
                .filter(not(list2::contains)) 
                .collect(Collectors 
                             .toList());
	}
	public static <T> Predicate<T> not(Predicate<T> t) {
	    return t.negate();
	}
}
