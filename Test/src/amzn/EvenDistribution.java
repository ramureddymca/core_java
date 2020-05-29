package amzn;

class EvenDistribution {
	public static boolean solution(int[] A) {
		// write your code in Java SE 8
		int leftPointer = 1;
		int rightPointer = A.length - 2;
		int leftPartSum, middlePartSum, rightPartSum;
		int[] sumArray = new int[A.length];

		// Initializing the sum array
		sumArray[0] = A[0];
		for (int i = 1; i < A.length; i++)
			sumArray[i] = sumArray[i - 1] + A[i];

		// Using two Pointer technique
		while (leftPointer < rightPointer) {

			leftPartSum = sumArray[leftPointer] - A[leftPointer];
			middlePartSum = sumArray[rightPointer] - sumArray[leftPointer] - A[rightPointer];
			rightPartSum = sumArray[A.length - 1] - sumArray[rightPointer];

			if (leftPartSum == middlePartSum && middlePartSum == rightPartSum)
				return true;

			if (leftPartSum < rightPartSum)
				leftPointer++;
			else if (leftPartSum > rightPartSum)
				rightPointer--;
			else { // Else condition denotes: leftPartSum == rightPartSum
				leftPointer++;
				rightPointer--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [] a = {1, 3, 4, 2, 2, 2, 1, 1, 2};
		System.out.println(solution(a));
	}
}
