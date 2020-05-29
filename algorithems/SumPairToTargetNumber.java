package algorithems;

import java.util.Arrays;
import java.util.HashSet;

public class SumPairToTargetNumber {

	public static void main(String[] args) {

		int[] a = new int[] { 9, 3, 1, 13, 7, 5, 4, 10, -1 };

		Arrays.sort(a);
		int sum = 9;
		checkSumEqualsGivenNum(a, sum);
		//System.out.println(checkSumEqualsGivenNum(a, sum));
	}

	private static void checkSumEqualsGivenNum(int[] a, int sum) {
		
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<a.length;i++) {
			int  tmp	= sum-a[i];
			if(tmp>0 && set.contains(tmp)){
				System.out.println("Pair with the given String "+ tmp +","+ a[i]);
			}
			set.add(a[i]);
		}
		/*
		 HashSet<Integer> s = new HashSet<Integer>(); 
	        for (int i=0; i<arr.length; ++i) 
	        { 
	            int temp = sum-arr[i]; 
	  
	            // checking for condition 
	            if (temp>=0 && s.contains(temp)) 
	            { 
	                System.out.println("Pair with given sum " + 
	                                    sum + " is (" + arr[i] + 
	                                    ", "+temp+")"); 
	            } 
	            s.add(arr[i]);*/ 
		
		
		
		//2nd way of doing
		/*int l =0;
		int r= a.length-1;
		while(l<r) {
			if(a[l]+a[r]==sum) {
				return true;
			}
			else if(a[l]+a[r]<sum) {
				l++;
			}else {
				r--;
			}
			
		}
		return false;*/
	}

}
