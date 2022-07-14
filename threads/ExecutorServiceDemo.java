package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(2);
		int n = 0;
		while (n < 5) {
			Future o =service.submit(() -> {
				int i=5;
				System.out.println("Callable example using ExecutorService" + Thread.currentThread().getName()+"sum of "+i+"is: "+(i*i+1)/2);
				--i;
				return i;
			});
			System.out.println(""+o.get());
			n++;
		}

	}

}
