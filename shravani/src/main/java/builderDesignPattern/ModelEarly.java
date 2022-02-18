package builderDesignPattern;

public class ModelEarly {
private static ModelEarly e=new ModelEarly();
private ModelEarly() {
	System.out.println("hi.. early");
}
public static ModelEarly getEarly() {
	return e;
}
 
}
