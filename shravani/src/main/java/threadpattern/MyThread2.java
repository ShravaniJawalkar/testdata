package threadpattern;

public class MyThread2 extends Thread{
public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+":-"+i);
		try {
			Thread.sleep(20);
		}catch(Exception e) {e.printStackTrace();}
	}
}
}
