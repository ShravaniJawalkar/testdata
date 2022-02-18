package builderDesignPattern;

public class ModelLazy {
	private static ModelLazy l;

	private ModelLazy() {
		System.out.println("hi.. lazy");
	}

	public static ModelLazy getLazy() {
		if (l == null) {
			synchronized (ModelLazy.class) {
				if (l == null)
					l = new ModelLazy();
			}
		}

		return l;
	}
}
