package algorithems;

import java.util.HashMap;

public class PairCount {
	static int arr[] = new int[] { 1, 1, 1, 1 };

	// Returns number of pairs in arr[0..n-1] with sum equal
	// to 'sum'

	// Driver method to test the above function
	public static void main(String[] args) {

		int sum = 2;
		System.out.println("Count of pairs is " + getPairsCount(arr.length, sum));

	}

	private static Integer getPairsCount(int length, int sum) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<length;i++) {
			map.put(arr[i], !map.containsKey(arr[i]) ?1:map.get(arr[i])+1);
			/* if(!map.containsKey(arr[i])) 
	                map.put(arr[i],0); 
	                  
	            map.put(arr[i], map.get(arr[i])+1); */
		}
		int twice_count =0;
		for(int i =0; i<length;i++) {
			if(map.get(sum-arr[i])!=null) {
				twice_count +=map.get(sum-arr[i]);
			}
			
			if(sum-arr[i]==arr[i]) {
				twice_count--;
			}
		}
		
		return twice_count/2;
	}
}
// This code is contributed by Gaurav Miglani 
