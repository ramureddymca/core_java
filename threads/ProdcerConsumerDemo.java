package threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProdcerConsumerDemo {
	
	public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
		new Thread(new Producer(q, 10, "producer")).start();
		new Thread(new Consumer(q, 10, "producer")).start();
	}
	
}

class Producer implements Runnable{

	Queue<Integer> q;
	int maxSize;
	public Producer(Queue<Integer> q, int size, String name) {
		this.q = q;
		maxSize =size;
	}
	@Override
	public void run() {
		while(true) {
			synchronized(q) {
				while(q.size()==maxSize) {
					try {
						System.out.println("Waiting to consume resource");
						q.wait();
					}catch(Exception e){
						
					}
				}
				Random r = new Random();
				int i = r.nextInt();
				System.out.println("element producing:  "+i);
				q.add(i);
				q.notifyAll();
			}
		}
	}
	
}

class Consumer implements Runnable{

	Queue<Integer> q;
	int maxSize;
	public Consumer(Queue<Integer> q, int size, String name) {
		this.q = q;
		maxSize =size;
	}
	@Override
	public void run() {
		while(true) {
			synchronized(q) {
				while(q.isEmpty()) {
					try {
						System.out.println("Waiting to produce resource");
						q.wait();
					}catch(Exception e){
						
					}
				}
				System.out.println("element consuming:  "+q.remove());
				q.notifyAll();
			}
		}
	}
	
}
