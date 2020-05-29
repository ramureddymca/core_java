package algorithems;

public class BSDemo {

	static int bs(int[] arr, int start, int max, int key) {
		
		
		while (start <= max) {
			int mid = (start + max) / 2;
			if(arr[mid]==key) {
				return mid;
			}
			if (arr[mid] > key) {
				max= mid-1;
				//bs(arr, start, mid, key);
				
			} else {
				start = mid+1;
				//bs(arr,mid, max, key);
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = {  1,3,4, 8,  11, 20 };
		int max = arr.length - 1;
		System.out.println("index is:::"+bs(arr, 0, max, 8));
		
	}
}
