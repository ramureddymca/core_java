package algorithems;

public class MergeSortDemo {

	public static void main(String[] args) {

		int a[] = new int[] { 3, 32, 8, 4, 10, 15, 90 };

		int r = a.length;

		divide(a, 0, r - 1);
		System.out.println("Sorted array is::");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void divide(int a[], int l, int r) {

		if (l < r) {
			int q = (l + r) / 2;
			divide(a, l, q);
			divide(a, q + 1, r);

			merge(a, l, q, r);
		}

	}

	private static void merge(int[] a, int l, int q, int r) {
		int leftSize = q - l + 1;
		int rightSize = r - q;

		int[] left = new int[leftSize];
		int[] right = new int[rightSize];

		for (int i = 0; i < leftSize; i++) {
			left[i] = a[l + i];
		}
		for (int i = 0; i < rightSize; i++) {
			right[i] = a[q + i + 1];
		}

		int i, j, k = l;
		for (i = 0, j = 0; i < leftSize && j < rightSize;) {
			if (left[i] < right[j]) {
				a[k++] = left[i];
				i++;
			} else {
				a[k++] = right[j];
				j++;
			}
		}

		while (i < leftSize) {
			a[k++] = left[i++];
		}
		while (j < rightSize) {
			a[k++] = right[j++];
		}
	}

}
