package threads;

public class InterThreadCom {
	int amount = 10000;

	public static void main(String[] args) {

		InterThreadCom i = new InterThreadCom();
		new Thread(() -> i.withdraw(15000)).start();
		new Thread(() -> i.deposit(10000)).start();

	}

	private synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}

	Object o = new Object();

	private synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
			if (this.amount < amount) {
				System.out.println("Less balance; waiting for deposit...");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.amount -= amount;
			System.out.println("withdraw completed...");
	}

}
