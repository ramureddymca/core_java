package threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
		Display d = new Display();
		ThreadDemo t1 = new ThreadDemo(d, "MSD");
		ThreadDemo t2 = new ThreadDemo(d, "Yuvi");
		t1.start();
		t2.start();
	}
}

class Display{
	final ReentrantLock l = new ReentrantLock();
	public void display(String name) {
		 
		l.lock();
			for(int i=1;i<5;i++) {
				try {
					System.out.print("GM: ");
					Thread.sleep(2000);
				}catch(InterruptedException e) {
				}
				System.out.println(name);
				
		}
			l.unlock();
	}
}

class ThreadDemo extends Thread{
	Display d;
	String name;
	ThreadDemo(Display d, String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.display(name);
	}
	
}