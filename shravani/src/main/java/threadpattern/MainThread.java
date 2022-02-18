package threadpattern;

public class MainThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"start");
		//implementation of thread class
		Thread t=new MyThread2();
		t.setName("T1");
		t.setDaemon(true);
		t.start();
		//implementation of runnable interface
		MyThread m=new MyThread();
		Thread t1=new Thread(m);
		t1.setName("T2");
		//t1.setDaemon(true);
		t1.start();
		System.out.println(Thread.currentThread().getName()+"end");
		
	}

}
