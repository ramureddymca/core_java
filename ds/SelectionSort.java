package ds;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 4, 1, 10, -3, 16 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[min] > a[j])
					min = j;
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
