package practice;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 6, 8, 9, 11 };
		int n = 12;
		System.out.println(binarySearch(a, 0, a.length, n));
	}

	private static int binarySearch(int[] a, int start, int end, int item) {
		
		if(start<end) {
			int mid = start + (end-start)/2;
			if(a[mid]>item) {
				return binarySearch(a, start, mid, item);
			}else if(a[mid]<item) {
				return binarySearch(a, mid+1, end, item);
			}else {
				return mid;
			}
		}
		return -1;
	}
}
