package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class PartitioningWithCollectors {
  static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
      new Employee("Harry Major", 40),
      new Employee("Ethan Hardy", 65),
      new Employee("Nancy Smith", 22),
      new Employee("Catherine Jones", 21),
      new Employee("James Elliot", 58),
      new Employee("Frank Anthony", 21),
      new Employee("Michael Reeves", 40));
 
  public static void main(String args[]){
    Map<Boolean,List<Employee>> employeeMap
        = (Map<Boolean,List<Employee>>) employeeList
          .stream()
          .collect(Collectors.partitioningBy((Employee e)->e.getAge()>30));
    
    double avgAge = employeeList.stream().mapToInt(e-> e.getAge())
    			.average().getAsDouble();
    Map<Integer, List<Employee>> groupByMap = 
    employeeList.stream()
    .collect(Collectors.groupingBy(Employee::getAge));
    
    System.out.println(groupByMap);
    
  System.out.println("Emp avg age: "+ avgAge);
  //  System.out.println("Employees partitioned based on Predicate - 'age > 30'");
   // employeeMap.forEach((Boolean key, List<Employee> empList) -> System.out.println(key +"->" + empList));
  }
}
//Employee.java(POJO Class)
