package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortSet {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "Mahesh", 12));
		set.add(new Student(2, "Suresh", 15));
		set.add(new Student(3, "Nilesh", 10));
		/*
		System.out.println("---Natural Sorting by Name---");
		set.stream().sorted().forEach(e -> System.out.println("Id:"
		          + e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Natural Sorting by Name in reverse order---");
		set.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println("Id:"
		          + e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));		
		
		System.out.println("---Sorting using Comparator by Age---");
		set.stream().sorted(Comparator.comparing(Student::getAge))
		  .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Sorting using Comparator by Age in reverse order---");
		set.stream().sorted(Comparator.comparing(Student::getAge).reversed())
		.forEach(s -> System.out.println("Student Id: "+ s.getId()+" "+s.getName()+""+ s.getAge()));
		 // .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
*/	
		Map<Integer, String> map = new HashMap<>();
		map.put(15, "Mahesh");
		map.put(10, "Suresh");
		map.put(30, "Nilesh");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
		.forEach(e-> System.out.println("key"+e.getKey()+" val "+e.getValue()) );
		
	
	}
} 


class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Student ob) {
		return name.compareTo(ob.getName());
	}
        @Override
        public boolean equals(final Object obj) {
          if (obj == null) {
             return false;
          }
          final Student std = (Student) obj;
          if (this == std) {
             return true;
          } else {
             return (this.name.equals(std.name) && (this.age == std.age));
          }
        }
        @Override
        public int hashCode() {
          int hashno = 7;
          hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
          return hashno;
        }	
} 