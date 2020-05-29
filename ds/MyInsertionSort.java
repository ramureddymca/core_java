package ds;

public class MyInsertionSort {

	public static void main(String a[]) {
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		int[] arr2 = doInsertionSort(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doInsertionSort(int[] input) {

		/*
		 * for(int i=0; i<input.length; i++) { int key = input[i]; int j=i-1; while(j>=0
		 * && input[j]> key) { input[j+1]=input[j]; j=j-1; } input[j+1] =key;
		 */ 
		for(int i=1; i<input.length;i++) {
			for(int j=i;j>0;j--) {
				if(input[j]<input[j-1]) {
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
					
				}
			}
		}
		return input;
	}
}