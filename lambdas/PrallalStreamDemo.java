package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrallalStreamDemo {

	public static void main(String[] args) {

		List<Employee> emplist = Arrays.asList(new Employee("ram", 30, "APAC", 101), new Employee("rak", 32, "APAC", 102),new Employee("rak", 32, "APAC", 102),
				new Employee("rao", 40, "APAC", 101), new Employee("som", 30, "EMEA", 102), new Employee("Karuna", 30, "APAC", 102));
		
		Map<Employee, Long> count1 = emplist.stream()
			    .filter(e-> e.getRegien().equals("APAC"))
			    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(count1);
		
		Map<Integer, List<Employee>> count2 =  emplist.stream()
	    .filter(e-> e.getRegien().equals("APAC"))
	    .collect(Collectors.groupingBy(Employee::getDeptId));
		
	}

}
