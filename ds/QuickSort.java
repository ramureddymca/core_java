package ds;

public class QuickSort {

	public static void main(String[] args) {

		int a[] = { 4, 1, 10, -3, 16 };
		int n = a.length;
		int b[] = sort(a, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
	}

	public static int[] sort(int[] a, int low, int high) {

		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
		return a;

	}

	private static int partition(int[] a, int low, int high) {

		int pivote = a[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (a[j] < pivote) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}

}
