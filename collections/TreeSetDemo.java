package collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 
public class TreeSetDemo{
 
    public static void main(String[] args) {
 
        TreeSet<Employee> empTreeSet = new TreeSet<Employee>((e1,e2)->e1.getId()-e2.getId());
        
        Employee emp1 = new Employee(20, "Clark");
        Employee emp2 = new Employee(24, "Bernie");
        Employee emp3 = new Employee(3, "Alex");
        
        empTreeSet.add(emp1);
        empTreeSet.add(emp2);
        empTreeSet.add(emp3);
    	
    	 Set<Short> set = new HashSet<Short>();
    	 
         for (Short i = 0; i < 10; i++) {
             set.add(i);
             set.remove(i - 1);
         }
  
         System.out.println(set.size());
        
        
         set.stream()
     // .map(Employee::getName)
      .forEach(System.out::println );
    }
 
}


  class AgeComparator implements Comparator<Employee>{
  
  public int compare(Employee e, Employee e2) {
	  
	  return e.getName().compareTo(e2.getName());
  
  /*if( e.getId() > e2.getId()) { return 1; }else if(e.getId() < e2.getId()) {
  return-1; }else { return 0; }*/
  
  } }
 