package threads;

public class DeadLockDemo {

	
	public static void main(String[] args) {
		
		
		Runnable r = ()->{			
			synchronized (Integer.class) {
				System.out.println("Locked Integer object");
				
				synchronized (String.class) {
					System.out.println("Locked String object");
				}
		}};
		Runnable r2 = ()->{	
		synchronized (Integer.class) {
			System.out.println("Locked String object");
			
			synchronized (String.class) {
				System.out.println("Locked Integer object");
			}
		}
		};
		new Thread(r).start();
		new Thread(r2).start();
		
	}
	
	
}


