package practice;

import java.util.concurrent.ForkJoinPool;

public class SortDemo {

	public static void main(String[] args) {
		
	}
	private static final int getSplitThreshold(int n) {
		  int p = ForkJoinPool.getCommonPoolParallelism();
		  int t = (p > 1) ? (1 + n / (p << 3)) : n;
		  return t < MIN_ARRAY_SORT_GRAN ? MIN_ARRAY_SORT_GRAN : t;
		}
}
