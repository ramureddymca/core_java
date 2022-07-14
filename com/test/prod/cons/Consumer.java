package com.test.prod.cons;

public class Consumer implements Runnable{
	SharedResource sharedResource ;
	Consumer(SharedResource sharedResource){
		
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			consume();
		}
		
	}
	
	public void consume() {
		synchronized (sharedResource) {
			if(sharedResource.arr[0] != 0) {
				System.out.println(Thread.currentThread().getName() +" Consuming : "+sharedResource.arr[0]);
				sharedResource.arr[0] = 0;
				sharedResource.notifyAll();
			}else {
				try {
					sharedResource.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
