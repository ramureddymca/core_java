package taiger;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RoyalRumble {
  public List<String> getSortedList(List<String> names) {

	 /* Louis IX
	  Louis VIII
	  David II*/
	  
	  //https://form.jotform.me/82350931514452
	  List<String> sortedEmployees = names.stream()
              .sorted(Comparator
            	      .comparing(e-> e.sp)
            	      .thenComparing(name-> name))
              .collect(Collectors.toList());

	  //https://github.com/spkenn5/royal-sorter/blob/master/src/Main.java
    return null;
  }
}
