package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Integer> bqueue = new ArrayBlockingQueue(10);
		
		Runnable r = ()-> {
			int i=0;
			while(i<10) {
				try {
					System.out.println("Producing Thread:" +Thread.currentThread().getName()+" value"+i);
					bqueue.put(i);
					i++;
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		new Thread(r).start();
		new Thread(r).start();
		
		Runnable r1 = ()-> {
			while(true) {
				try {
					int i = bqueue.take();
					System.out.println("Consuming Thread:" +Thread.currentThread().getName()+" value"+i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		new Thread(r1).start();
		new Thread(r1).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
