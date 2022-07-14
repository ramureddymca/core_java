package algorithems;

public class LeanerSearch {

	public static void main(String[] args) {

		int a[] = { 2, 1, 5, 3, 9, 7 };
		int n = 9;
		System.out.println(findElement(a, n));
	}
	
	public static int findElement(int [] a, int n) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
					return i;
			}
		}
		return -1;
	}
}
