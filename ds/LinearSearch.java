package ds;

public class LinearSearch {

	public static void main(String[] args) {
		//int a[] = { 4, 1, 10, -3, 16 };
		int a[]= {-3, 1 ,4 ,10,16};
		int n = a.length;
		int k = 16;
		System.out.println(bSearch(a, 0, n, k));
	}

	private static int bSearch(int[] a, int low, int high, int k) {
		int index = -1;
		if(low<high) {
		int mid =(low+high)/2;
		if(a[mid]==k)
			index = mid;
		else if(a[mid]>k){
			return bSearch(a, low, mid-1, k);
		}else {
			return bSearch(a, mid+1, high, k);
		}
		}
		return index;

	}
}
