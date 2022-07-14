package dpatterns;

public class SingletonTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
				SingletonDemo s1= SingletonDemo.getInstance();
				System.out.println(s1.hashCode());
		});
		
		Thread t2 = new Thread(()-> {
				
				SingletonDemo s2= SingletonDemo.getInstance();
				System.out.println(s2.hashCode());
		});
		t1.start();
		t2.start();
	}

}