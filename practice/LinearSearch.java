package practice;

import java.util.Scanner;

public class LinearSearch implements Runnable {

	private int startIndex, endIndex;
	private static int nElements, key, myArray[];
	private boolean flag;
	private String threadName;
	public static Scanner scanner = new Scanner(System.in);

	public LinearSearch(int startIndex, int endIndex, String threadName) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.threadName = threadName;
		Thread thread = new Thread(this);
		thread.start();
	}

	public static void setValues() {
		System.out.println("Enter the " + nElements + " elements ");
		myArray = new int[nElements];
		for (int i = 0; i < nElements; i++) {
			myArray[i] = scanner.nextInt();
		}

		System.out.println("Enter the key");
		key = scanner.nextInt();
	}

	@Override
	public void run() {
		for (int i = startIndex; i <= endIndex; i++) {
			if (myArray[i] == key) {
				System.out.println("Search is successful"+threadName);
				flag =true;
				return;
			}
			if(flag == false) 
			System.out.println("Search is unsuccessful"+threadName);
		}
	}

	public static void main(String[] args) {
		nElements = scanner.nextInt();
		setValues();
		long startTime = System.currentTimeMillis();
		new LinearSearch(0,(nElements / 2)-1, "Thread-1");
		new LinearSearch(nElements / 2, nElements - 1, "Thread-2");
		long endTime = System.currentTimeMillis();
		System.out.println("time"+(endTime-startTime));

	}

}
