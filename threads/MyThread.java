package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThread {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newWorkStealingPool();

List<Callable<String>> callables = Arrays.asList(
        () -> "task1",
        () -> "task2",
        () -> "task3");

try {
	executor.invokeAll(callables)
	    .stream()
	    .map(future -> {
	        try {
	            return future.get();
	        }
	        catch (Exception e) {
	            throw new IllegalStateException(e);
	        }
	    })
	    .forEach(System.out::println);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		/*executor.execute(()->{
			
			System.out.println("Hello " + Thread.currentThread().getName());
		});
		*/
		
		
	/*	Callable<Integer> task = ()->{
			 try {
			        TimeUnit.SECONDS.sleep(1);
			        return 123;
			    }
			    catch (InterruptedException e) {
			        throw new IllegalStateException("task interrupted", e);
			    }
		};
		*/
		
		/*Future<Integer> future = executor.submit(()->{
			 try {
			        TimeUnit.SECONDS.sleep(1);
			        return 123;
			    }
			    catch (InterruptedException e) {
			        throw new IllegalStateException("task interrupted", e);
			    }
		});
		System.out.println("Is Done: "+future.isDone());
		try {
			Integer result = future.get();
			System.out.println("Is Done: "+future.isDone());
			System.out.print("result: " + result);
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executor.shutdown();
		try {
			executor.awaitTermination(5,  TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(!executor.isTerminated()) {
				System.out.println("Cancel the not completed tasks ");
			}
			executor.isShutdown();
		}*/
		
		Runnable task = () -> {
			System.out.println("Hello " + Thread.currentThread().getName());
		try {
			//Thread.sleep(1000);
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Hello " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		};

		Thread t = new Thread(() -> {
			System.out.println("Hello " + Thread.currentThread().getName());
		try {
			//Thread.sleep(1000);
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Hello " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		});
		t.start();

	}

}
