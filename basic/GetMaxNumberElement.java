package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMaxNumberElement {

	public static void main(String[] args) {
		//List<String> s = Arrays.asList("Test1:2", "Test2:3", "Test3:5", "Test4:67", "Test5:6", "Test6:7", "Test7:10", "Test8:1", "Test9:11", "Test10:1");
		
		//"Test1:2", "Test2:3", "Test3:5", "Test4:67", "Test5:6", "Test6:7", "Test7:10", "Test8:1", "Test9:11", "Test10:1";
		/*Arrays.stream(input.split(","))
		  .map(String::trim)
		  .toArray(String[]::new);*/
		
		List<String> valuesToBeAdded = new ArrayList<>();
		List<String> myValues = Arrays.asList("Test1:2", "Test2:3", "Test3:5", "Test4:67", "Test5:6", "Test6:7", "Test7:10", "Test8:1", "Test9:11", "Test10:1");
	
		int maxIndex = 0; // Use 1-based index so we can modulo properly
		for (int i = 0; i < myValues.size()+1; i++) {
		if (Integer.parseInt(myValues.get(i+1).split(":")[1]) > Integer.parseInt(myValues.get(maxIndex).split(":")[1])) {
		      maxIndex = i+1;
		}
		  if (i%5 == 0){
		      valuesToBeAdded.add(myValues.get(maxIndex-1).split(":")[0]);
		      maxIndex = i; // Reset max to the first element of the next five
		}
		}
		System.out.println(valuesToBeAdded);
	}
}
