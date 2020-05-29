package ds;

public class MergeSort {

	public static void main(String[] args) {

		int a[] = { 4, 1, 10, -3, 16 };
		int n = a.length;
		sort(a, 0, n - 1);
		 for (int i=0; i<n; ++i) 
	            System.out.print(a[i] + " "); 
	}

	private static void sort(int[] a, int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;

			sort(a, low, mid);
			sort(a, mid + 1, high);

			merge(a, low, mid, high);
		}

	}

	private static void merge(int[] a, int low, int mid, int high) {

		int s1 = mid - low + 1;
		int s2 = high - mid;

		int l[] = new int[s1];
		int r[] = new int[s2];
		for (int i = 0; i < s1; ++i) {
			l[i] = a[low + i];
		}
		for (int i = 0; i < s2; ++i) {
			r[i] = a[mid + 1 + i];
		}

		int i = 0, j = 0;
		int k = low;

		while (i < s1 && j < s2) {
			if (l[i] < r[j]) {
				a[k] = l[i];
				i++;
			} else {
				a[k] = r[j];
				j++;
			}
			k++;
		}
		while(i<s1) {
			a[k] = l[i];
			i++;
			k++;
		}
		while(j<s2) {
			a[k] = r[j];
			j++;
			k++;
		}
	}

}
