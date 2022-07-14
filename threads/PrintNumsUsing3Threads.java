package threads;

public class PrintNumsUsing3Threads implements Runnable{

	int n =10;
	int remainder ;
	int num =1;
	Object lock = new Object();
	public PrintNumsUsing3Threads(int remainder) {
		this.remainder = remainder;
	}
	public void run() {
		while (num < n-1) {
			synchronized (lock) {
				while (num % 3 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + num);
				num++;
				lock.notifyAll();
			}
		}
	}
	public static void main(String[] args) {
 
	/*	new Thread(new PrintNumsUsing3Threads(1), "T1").start();
		new Thread(new PrintNumsUsing3Threads(2), "T2").start();
		new Thread(new PrintNumsUsing3Threads(0), "T3").start();*/
		
		PrintNumsUsing3Threads runnable1=new PrintNumsUsing3Threads(1);
		PrintNumsUsing3Threads runnable2=new PrintNumsUsing3Threads(2);
		PrintNumsUsing3Threads runnable3=new PrintNumsUsing3Threads(0);
		
		Thread t1=new Thread(runnable1,"T1");
		Thread t2=new Thread(runnable2,"T2");
		Thread t3=new Thread(runnable3,"T3");
		
		t1.start();
		t2.start();
		t3.start();	
		
	}

}
