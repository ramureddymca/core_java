package lambdas;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class BasicLambda1 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
		//l.stream().collect(Collectors.p)
		//Iterative approach/ informative approach
		
		/*for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		for(int e : l) {
			System.out.println(e);
		}*/
		
		//encapsulation 
		//
		//l.forEach(val ->System.out.println(val));
		//l.forEach(System.out::println);

		/*l.stream().map(BasicLambda1::squere)
				//.filter(a->a.equals(1))
				  .forEach(System.out::println);*/
		
		/*System.out.println(l.stream()
		 //.reduce(0, (total, e)->Integer.sum(total, e)));
		.reduce(0, Integer::sum));*/
		List<Integer> list = l.stream()
							  .filter(e->e%2==0)
							  .map(e-> {
								  l.remove(e);
								  return e;
							  })
							  .collect(toList());
		System.out.println(list);
	/*	String s = "a,b,c,d";
		 MathOperation division = (int a, int b) -> a / b;
		 
		 System.out.println("10 / 5 = " + new BasicLambda1().operate(10, 5, division));
		System.out.println(Arrays.asList(s.split(","))
				.stream()
				//.map(String::valueOf)
				.reduce("", String::concat)
				);*/
	}
	interface MathOperation {
	    int operation(int a, int b);
	 }
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	public static int squere(int a) {
		return a*a;
	}

}

