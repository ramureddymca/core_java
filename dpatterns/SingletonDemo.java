package dpatterns;

import java.io.Serializable;

public class SingletonDemo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile SingletonDemo instance=null;
	
	private SingletonDemo() {
		if (instance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
	}
	public static SingletonDemo getInstance() {
		if(instance==null) {
			synchronized(SingletonDemo.class) {
				if(instance==null) {
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}
	

}
