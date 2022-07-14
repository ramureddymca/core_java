package threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWaitNotify {

	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		Runnable r = () -> {

			synchronized (list) {
				while (true) {
					System.out.println("Adding element to list");
					list.add(1);
					try {
						System.out.println("Releasing the lock");
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Runnable r2 = () -> {

			synchronized (list) {
				//while (true) {
					if (list.size() > 1) {
						System.out.println("Removing the element from list");
						list.remove(1);
					}
					System.out.println("Consumer releasing the lock");
					list.notify();
				}
			//}
		};

		new Thread(r).start();
		new Thread(r2).start();
	}
}
