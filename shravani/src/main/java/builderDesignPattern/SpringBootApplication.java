package builderDesignPattern;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance;

public class SpringBootApplication {
	public static void main(String args[]) {
		// Builder Design
		ModelBuilder m = new ModelBuilder();
		ModelClass m1 = m.setName("shyam").setCode("1234").getPhone();
		System.out.println(m1);
		// Singleton with early
		ModelEarly e = ModelEarly.getEarly();
		ModelEarly e1 = ModelEarly.getEarly();
		// Singleton with Lazy
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				ModelLazy l = ModelLazy.getLazy();
				ModelLazy l1 = ModelLazy.getLazy();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				ModelLazy l = ModelLazy.getLazy();
				ModelLazy l1 = ModelLazy.getLazy();
			}
		});
		t1.start();
		t2.start();
		
				ABC.Instance.setInt(90);
				int k=ABC.Instance.getInt();
		System.out.println(k);
		//factory design pattern
		PolicyFactory p=new PolicyFactory();
		p.getInstance("travel").getPolicy();
		p.getInstance("health").getPolicy();
		p.getInstance("motor").getPolicy();
	}
	enum ABC{
		Instance;
		int i;
		public int getInt() {
			return i;
		}
		public void setInt(int i) {
			this.i=i;
		}
	}
}
