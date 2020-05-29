package basic;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int id;
	
	public int getId() {
		return id;
	}
	public int compareTo(Employee e) {
		
		return this.name.compareTo(e.name);
	}

	
}


class AgeCmp implements Comparator<Employee>{
	
	public int compare(Employee e, Employee e2) {
		if( e.getId()>e2.getId()) {
			return -1;
		}else if(e.getId()<e2.getId()) {
			return 1;
		}else {
			
		return 0;
		}
	}
}