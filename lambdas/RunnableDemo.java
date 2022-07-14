package lambdas;

public class RunnableDemo implements Demo{

	public static void main(String[] args) {
		
		 new Thread(()-> System.out.println("Another thread is running")).start();
		 new RunnableDemo().show();
	}
}

interface Demo{
	 public default void show() 
	    { 
	      System.out.println("Default Method Executed"); 
	    } 
	 
	 public default void show2() 
	    { 
	      System.out.println("Default Method Executed"); 
	    } 
}