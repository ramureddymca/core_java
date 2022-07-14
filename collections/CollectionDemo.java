package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList<String> bags = new ArrayList<String>(); 
		  
        // Add values in the bags list. 
        bags.add("p"); 
        bags.add("l"); 
        bags.add("r");
        bags.add(null);
        bags.add(null);
        
        // Creating another array list 
       HashSet<String> boxes = new HashSet<String>(); 
  
        // Add values in the boxes list. 
       boxes.add("q");boxes.add("e");
        boxes.add(null);
        boxes.add("t");boxes.add("q");boxes.add("f");boxes.add("q");boxes.add("q");boxes.add("q");
  
        // Before Applying method print both lists 
        System.out.println("Bags Contains :" + bags); 
        System.out.println("Boxes Contains :" + boxes); 
        Iterator<String> it = boxes.iterator();
        while(it.hasNext()){
            String i = it.next();
            System.out.print(i+" ");
        }
       /* HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(1);
      hashSet.add(null);  //will throw null pointer 
        hashSet.add(999);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(000);
        hashSet.add(999);
        hashSet.add(0);

        Iterator<Integer> it1 = hashSet.iterator();
        while(it1.hasNext()){
            //int i = it1.next();
            //System.out.print(i+" ");
        }*/
        
	}

}
