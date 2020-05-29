package collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;  
class MapExample3{  
 public static void main(String args[]){  
Map<Employee,String> map=new HashMap<Employee,String>();          
        
      map.put(new Employee(101, "ram"),"Vijay");    
      map.put(new Employee(100, "ram"),"Rahul"); 
      map.put(new Employee(102, "ram"),"Amit"); 
      //Returns a Set view of the mappings contained in this map        
      Map<Employee,String> map2 =   map.entrySet() 
    		  .stream().sorted(Comparator.comparing(Map.Entry::getValue))
      //Returns a sequential Stream with this collection as its source  
     //.stream().sorted(Map.Entry.<Employee,String>comparingByKey((e1, e2)->e1.getId()-e2.getId()))
     //.forEach(System.out::println);
      .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue()));
      System.out.println(":::::::::"+map2);
 }  
}  