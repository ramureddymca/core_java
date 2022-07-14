package com.test.prod.cons;

public class Producer implements Runnable{

	SharedResource sharedResource ;
	Producer(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			produce(i);
		}
		
	}
	
	public void produce(int i) {
		synchronized (sharedResource) {
			if(sharedResource.arr[0] == 0) {
				sharedResource.arr[0] = i;
				System.out.println(Thread.currentThread().getName() +" Producing : "+sharedResource.arr[0]);
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
