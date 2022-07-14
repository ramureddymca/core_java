package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("1","2","3","4","5","6","7","8","9");
		List<String> l2 = Arrays.asList("1","2","3","4","5","6","7","8","9");
		l.stream().filter(s-> 
				l2.stream().allMatch(isSalaryMoreThan(s))
				.collect(Collectors.toList()));
				 // .filter(s2-> s2.endsWith("1"))
				  //.collect(Collectors.toList()));
		Set<String> wordsToAvoid = new HashSet<>(Arrays.asList("one", "two"));
		 
		Stream.of("There", "were", "two", "people", "who", "always", "said", "one", "thing", "over", "and", "over")
		  .filter(word -> !wordsToAvoid.contains(word))
		  .forEachOrdered(System.out::println);
		
		
	}
	

	
	 public static Predicate < String > isSalaryMoreThan(String salary) {
	        return p - > p.endsWith(salary);
	    }
	
}
