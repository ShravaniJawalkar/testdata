package threadpattern;

public class MyThread implements Runnable{

	@Override
	public  synchronized void run() {
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+":-"+i);
			try {
				Thread.sleep(50);
			}catch(Exception e) {e.printStackTrace();}
		}// TODO Auto-generated method stub
		
	}

}
