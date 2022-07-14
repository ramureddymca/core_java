package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Animal  
{  
    
    public static void main (String args[])  
    {  
    	String s1="ram";
    	String s2 = new String("ram");
    	System.out.println("s1::::::"+s1.hashCode()+"---->>>>>>s2::::::"+s2.hashCode());
    	Map<String, Integer> hmap = new HashMap<>();
    	 hmap.put(s1, 10);
    	 hmap.put(s2, 20);
    	 System.out.println(hmap.size());
    	
    	
    	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20,23);
    	
    	
    	List<Integer> list2 = list.stream().filter(n -> IntStream.range(2, n).noneMatch(i -> n % i == 0)).collect(Collectors.toList());
    	
    	System.out.println();
    	/*List<String> l = Arrays.asList("ab","ac");
    	//l.stream().map(String::concat(",")).forEach(System.out::print);
    	Stream.of(1, 2, 3, 4, 5).forEachOrdered(System.out::print);*/
    	/*String s1="ram";
    	String s2 = new String("Ram");
    	System.out.println("s1::::::"+s1.hashCode()+"s2::::::"+s2.hashCode());
    	Map<String, Integer> hmap = new HashMap<>();
    	 hmap.put(s1, 10);
    	 hmap.put(s2, 20);
    	 System.out.println(hmap.size());*/
    	 /*Map<Integer, String> hmap = new HashMap<Integer, String>();

         Adding elements to HashMap
         hmap.put(12, "Chaitanya");
         hmap.put(2, "Rahul");
         hmap.put(7, "Singh");
         hmap.put(49, "Ajeet");
         hmap.put(3, "Anuj");
         hmap.forEach((id, name)->{
        	 System.out.println(id +"........"+name);
         });
         hmap.entrySet().forEach(entry->{
        	 System.out.println(entry.getKey() +"........."+entry.getValue());
         });*/
    	// System.out.println("Is it a prime number: "+isPrime(5));
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number%i==0);
    } 
}    