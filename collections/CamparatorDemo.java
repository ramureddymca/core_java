package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CamparatorDemo {

	public static void main(String[] args) {
		
List list = new ArrayList();
        
        list.add(10);
        list.add(10);
        
        System.out.println(list.size());
        
        list.remove(new Integer(10));
        
        System.out.println(list.size());

/*List<Integer> list = new ArrayList<Integer>();
        
        Integer[] arr = {2,10,3};
        
        list = Arrays.asList(arr);
        
        list.set(0, 3);
        
        System.out.println(list);
        
        list.add(1);
        
        System.out.println(list);*/
		
		
		/*List<Employee> elist = Arrays.asList(new Employee(108, "Ram"), new Employee(102, "Som"));
		
		List l2 = new ArrayList();
		CopyOnWriteArrayList<Employee> e = new CopyOnWriteArrayList<>();
		e.addAll(elist);
		System.out.println(e);
		Collections.sort(elist);
		//elist.sort(( e, e2) -> e.getId() - e2.getId());
		//Collections.sort(elist, ( e, e2) -> e.getId() - e2.getId());
		System.out.println(elist);*/
	}
}

/*
 * class AgeComparator implements Comparator<Employee>{
 * 
 * public int compare(Employee e, Employee e2) {
 * 
 * if( e.getId() > e2.getId()) { return 1; }else if(e.getId() < e2.getId()) {
 * return-1; }else { return 0; }
 * 
 * } }
 */